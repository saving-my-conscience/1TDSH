package br.com.fiap.tds.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.exception.EntidadeNaoEncontradaException;

/**
 * Classe responsável por realizar as operações (CRUD) com a tabela TB_PRODUTO
 * @author Thiago Yamamoto
 */
public class ProdutoDao {

	private Connection conexao;
	
	/**
	 * Construtor que recebe a conexão (Injeção de dependência)
	 * @param conexao
	 */
	public ProdutoDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	/**
	 * Cadastra um produto na tabela 
	 * @param produto Objeto com os dados que serão cadastrados
	 * @throws SQLException
	 */
	public void cadastrar(Produto produto) throws SQLException {
		//Criar o comando SQL que recebe parâmetros
		PreparedStatement stmt = conexao.prepareStatement("INSERT INTO tb_produto (cd_produto, nm_produto, "
				+ "vl_produto, ds_produto, qt_produto) values (sq_tb_produto.nextval,?,?,?,?)");
		
		//stmt.setInt(1, produto.getCodigo()); //Seta a primeira ? da query com o código
		stmt.setString(1, produto.getNome()); //Seta a segunda ? da query com o nome
		stmt.setDouble(2, produto.getValor()); 
		stmt.setString(3, produto.getDescricao());
		stmt.setInt(4, produto.getQuantidade());
		
		//Executar a query
		stmt.executeUpdate();
		
		//Fechar 
		stmt.close(); 
	}
	
	/**
	 * Atualiza um produto na tabela
	 * @param produto Produto que será atualizado no banco
	 * @throws SQLException 
	 * @throws EntidadeNaoEncontradaException Produto não encontrado para atualizar
	 */
	public void atualizar(Produto produto) throws SQLException, EntidadeNaoEncontradaException {
		
		//Valida se o produto existe
		pesquisar(produto.getCodigo());
		
		//Criar o comando SQL que recebe os parâmetros
		PreparedStatement stmt = conexao.prepareStatement("UPDATE tb_produto SET nm_produto = ?, vl_produto = ?,"
				+ " ds_produto = ?, qt_produto = ? where cd_produto = ?");
		
		//Setar os parâmetros na query
		stmt.setString(1, produto.getNome());
		stmt.setDouble(2, produto.getValor());
		stmt.setString(3, produto.getDescricao());
		stmt.setInt(4, produto.getQuantidade());
		stmt.setInt(5, produto.getCodigo());
		
		//Executar a query
		stmt.executeUpdate();
		
		stmt.close();
	}
	
	/**
	 * Pesquisa um produto pela PK
	 * @param codigo PK do produto
	 * @return Produto com todas as informações 
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Produto não foi encontrado 
	 */
	public Produto pesquisar(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		//Criar o comando SQL
		PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM tb_produto WHERE cd_produto = ?");
		//Setar o código na query
		stmt.setInt(1, codigo);
		
		//Executar a query
		ResultSet resultado = stmt.executeQuery();

		//Recuperar os valores
		if (resultado.next()) {
			Produto produto = parse(resultado);
			//Retornar o produto
			return produto;
		} else {
			throw new EntidadeNaoEncontradaException("Produto não encontrado");
		}
	}
	
	public List<Produto> listar(){
		List<Produto> lista = new ArrayList<Produto>();
		
		try {
			//Criar o comando SQL
			PreparedStatement stmt = conexao.prepareStatement("SELECT * from tb_produto");
			//Executar a Query
			ResultSet resultado = stmt.executeQuery();
			
			while (resultado.next()) {
				//Recuperar os valores
				Produto produto = parse(resultado);
				//Adicionar na lista
				lista.add(produto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Retornar a lista
		return lista;
	}

	private Produto parse(ResultSet resultado) throws SQLException {
		int codigo = resultado.getInt("cd_produto");
		String nome = resultado.getString("nm_produto");
		String descricao = resultado.getString("ds_produto");
		double valor = resultado.getDouble("vl_produto");
		int quantidade = resultado.getInt("qt_produto");
		//Instanciar um produto
		Produto produto = new Produto(codigo, nome, valor, descricao, quantidade);
		return produto;
	}
	
	/**
	 * Remove um produto do banco
	 * @param codigo PK do produto que será removido
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Produto não foi encontrado para remoção
	 */
	public void remover(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		//Validar se o produto existe
		pesquisar(codigo);
		//Criar o comando SQL
		PreparedStatement stmt = conexao.prepareStatement("DELETE FROM tb_produto WHERE cd_produto = ?");
		//Setar o código na query
		stmt.setInt(1, codigo);
		//Executar o comando
		stmt.executeUpdate();
	}
	
}

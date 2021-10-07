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
 * Classe respons�vel por realizar as opera��es (CRUD) com a tabela TB_PRODUTO
 * @author Thiago Yamamoto
 */
public class ProdutoDao {

	private Connection conexao;
	
	/**
	 * Construtor que recebe a conex�o (Inje��o de depend�ncia)
	 * @param conexao
	 */
	public ProdutoDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	/**
	 * Cadastra um produto na tabela 
	 * @param produto Objeto com os dados que ser�o cadastrados
	 * @throws SQLException
	 */
	public void cadastrar(Produto produto) throws SQLException {
		//Criar o comando SQL que recebe par�metros
		PreparedStatement stmt = conexao.prepareStatement("INSERT INTO tb_produto (cd_produto, nm_produto, "
				+ "vl_produto, ds_produto, qt_produto) values (sq_tb_produto.nextval,?,?,?,?)");
		
		//stmt.setInt(1, produto.getCodigo()); //Seta a primeira ? da query com o c�digo
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
	 * @param produto Produto que ser� atualizado no banco
	 * @throws SQLException 
	 * @throws EntidadeNaoEncontradaException Produto n�o encontrado para atualizar
	 */
	public void atualizar(Produto produto) throws SQLException, EntidadeNaoEncontradaException {
		
		//Valida se o produto existe
		pesquisar(produto.getCodigo());
		
		//Criar o comando SQL que recebe os par�metros
		PreparedStatement stmt = conexao.prepareStatement("UPDATE tb_produto SET nm_produto = ?, vl_produto = ?,"
				+ " ds_produto = ?, qt_produto = ? where cd_produto = ?");
		
		//Setar os par�metros na query
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
	 * @return Produto com todas as informa��es 
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Produto n�o foi encontrado 
	 */
	public Produto pesquisar(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		//Criar o comando SQL
		PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM tb_produto WHERE cd_produto = ?");
		//Setar o c�digo na query
		stmt.setInt(1, codigo);
		
		//Executar a query
		ResultSet resultado = stmt.executeQuery();

		//Recuperar os valores
		if (resultado.next()) {
			Produto produto = parse(resultado);
			//Retornar o produto
			return produto;
		} else {
			throw new EntidadeNaoEncontradaException("Produto n�o encontrado");
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
	 * @param codigo PK do produto que ser� removido
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Produto n�o foi encontrado para remo��o
	 */
	public void remover(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		//Validar se o produto existe
		pesquisar(codigo);
		//Criar o comando SQL
		PreparedStatement stmt = conexao.prepareStatement("DELETE FROM tb_produto WHERE cd_produto = ?");
		//Setar o c�digo na query
		stmt.setInt(1, codigo);
		//Executar o comando
		stmt.executeUpdate();
	}
	
}

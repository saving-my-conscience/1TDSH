package br.com.fiap.tds.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.factory.ConnectionFactory;

/**
 * Classe responsável por realizar as operações (CRUD) com a tabela TB_PRODUTO
 * @author Thiago Yamamoto
 *
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
	
	//Implementar os métodos Atualizar, Pesquisar por Codigo, Remover e Listar Todos
	
	
}
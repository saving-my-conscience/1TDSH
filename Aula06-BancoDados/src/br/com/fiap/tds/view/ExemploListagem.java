package br.com.fiap.tds.view;

import java.sql.Connection;
import java.util.List;
import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.dao.ProdutoDao;
import br.com.fiap.tds.factory.ConnectionFactory;

public class ExemploListagem {

	public static void main(String[] args) {
		
		try {
			//Obter a conexão
			Connection conexao = ConnectionFactory.getConnection();
			
			//Instanciar o ProdutoDao
			ProdutoDao dao = new ProdutoDao(conexao);
			
			//Listar os produtos
			List<Produto> lista = dao.listar();
			
			//Exibir os produtos
			for (Produto produto : lista) {
				System.out.println(produto.getCodigo() + " " + produto.getNome() + " " + produto.getDescricao()
					+" "+ produto.getQuantidade() + " " + produto.getValor());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
		
	}//main	
}//class
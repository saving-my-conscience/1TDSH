package br.com.fiap.tds.view;

import java.sql.Connection;
import java.util.Scanner;

import br.com.fiap.tds.dao.ProdutoDao;
import br.com.fiap.tds.exception.EntidadeNaoEncontradaException;
import br.com.fiap.tds.factory.ConnectionFactory;

public class ExemploRemocao {

	public static void main(String[] args) {
		
		try {
			//Obter a conexão
			Connection conexao = ConnectionFactory.getConnection();
			
			//Instanciar o ProdutoDao
			ProdutoDao dao = new ProdutoDao(conexao);
			
			//Ler o codigo para remover
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite o código");
			int codigo = leitor.nextInt();
			
			//Remover
			dao.remover(codigo);
			System.out.println("Produto removido!");
			
		} catch (EntidadeNaoEncontradaException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class
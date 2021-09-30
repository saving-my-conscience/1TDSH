package br.com.fiap.tds.view;

import java.sql.Connection;
import java.util.Scanner;

import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.dao.ProdutoDao;
import br.com.fiap.tds.factory.ConnectionFactory;

public class ExemploCadastro2 {

	public static void main(String[] args) {
		
		try {
			//Ler os dados do produto
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite o nome do produto");
			String nome = leitor.next() + leitor.nextLine();
			
			System.out.println("Digite o valor do produto");
			double valor = leitor.nextDouble();
			
			System.out.println("Digite a descrição do produto");
			String descricao = leitor.next() + leitor.nextLine();
			
			System.out.println("Digite a quantidade do produto");
			int quantidade = leitor.nextInt();
			
			//Instanciar um produto
			Produto produto = new Produto(0, nome, valor, descricao, quantidade);
			
			//Obter a conexão com o banco
			Connection conexao = ConnectionFactory.getConnection();
			
			//Instanciar o DAO
			ProdutoDao dao = new ProdutoDao(conexao);
			
			//Cadastrar o produto no banco utilizando o DAO
			dao.cadastrar(produto);
		
			System.out.println("Produto cadastrado!");
			
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
	
}//class
package br.com.fiap.tds.view;

import java.sql.Connection;
import java.util.Scanner;
import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.dao.ProdutoDao;
import br.com.fiap.tds.exception.EntidadeNaoEncontradaException;
import br.com.fiap.tds.factory.ConnectionFactory;

public class ExemploAtualizacao {

	public static void main(String[] args) {
		try {
			//Obter uma conexão
			Connection conexao = ConnectionFactory.getConnection();
			
			//Instanciar um ProdutoDao
			ProdutoDao dao = new ProdutoDao(conexao);
			
			//Ler os dados para atualizar
			Scanner leitor = new Scanner(System.in);

			System.out.println("Digite o código");
			int codigo = leitor.nextInt();
			
			System.out.println("Digite o nome do produto");
			String nome = leitor.next() + leitor.nextLine();
			
			System.out.println("Digite o valor do produto");
			double valor = leitor.nextDouble();
			
			System.out.println("Digite a descrição do produto");
			String descricao = leitor.next() + leitor.nextLine();
			
			System.out.println("Digite a quantidade do produto");
			int quantidade = leitor.nextInt();
			
			//Instanciar um produto
			Produto produto = new Produto(codigo, nome, valor, descricao, quantidade);
			
			//Atualizar o produto
			dao.atualizar(produto);
			System.out.println("Produto atualizado!");
			
			conexao.close();
			leitor.close();
		} catch (EntidadeNaoEncontradaException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
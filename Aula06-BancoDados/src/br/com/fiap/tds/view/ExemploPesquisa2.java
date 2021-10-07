package br.com.fiap.tds.view;

import java.sql.Connection;
import java.util.Scanner;

import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.dao.ProdutoDao;
import br.com.fiap.tds.exception.EntidadeNaoEncontradaException;
import br.com.fiap.tds.factory.ConnectionFactory;

public class ExemploPesquisa2 {

	//Pesquisar um produto pelo c�digo
	public static void main(String[] args) {
		
		try {
			//Obter uma conex�o
			Connection conexao = ConnectionFactory.getConnection();
			
			//Instanciar um ProdutoDao
			ProdutoDao dao = new ProdutoDao(conexao);
			
			//Ler o c�digo
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite o c�digo");
			int codigo = leitor.nextInt();
			
			//Pesquisar pelo c�digo
			Produto produto = dao.pesquisar(codigo);
			
			//Exibir o resultado
			System.out.println(produto.getCodigo());
			System.out.println(produto.getNome());
			System.out.println(produto.getDescricao());
			System.out.println("Qtd: " + produto.getQuantidade());
			System.out.println("Valor: " + produto.getValor());
			
			leitor.close();
			conexao.close();
		} catch (EntidadeNaoEncontradaException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class
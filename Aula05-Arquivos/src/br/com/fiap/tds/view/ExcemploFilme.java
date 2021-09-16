package br.com.fiap.tds.view;

import java.io.IOException;
import java.util.Scanner;

import br.com.fiap.tds.bean.Filme;
import br.com.fiap.tds.dao.FilmeDao;

public class ExcemploFilme {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Instanciar o FilmeDao
		FilmeDao dao = new FilmeDao();
		
		//Ler os dados do filme
		System.out.println("Digite o título");
		String titulo = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o autor");
		String autor = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite a duração");
		int duracao = leitor.nextInt();
		
		System.out.println("Digite o gênero");
		String genero = leitor.next() + leitor.nextLine();
		
		//Instanciar o filme
		Filme filme = new Filme(titulo, autor, duracao, genero);
		
		//Chamar o método gravar do filme
		try {
			dao.gravar(filme);
			System.out.println("Filme gravado!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		leitor.close();
	}//main
}//class
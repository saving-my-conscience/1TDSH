package br.com.fiap.tds.view;

import java.io.IOException;
import java.util.List;
import br.com.fiap.tds.bean.Filme;
import br.com.fiap.tds.dao.FilmeDao;

public class ExemploFilmeLeitura {
	
	//Ler os filmes gravados no arquivo
	public static void main(String[] args) {
		//Instanciar o FilmeDao
		FilmeDao dao = new FilmeDao();
	
		try {
			//Chamar o método listar e armazenar a lista de filmes
			List<Filme> filmes = dao.listar(); 
			
			//Exibir os filmes encontrados
			for (Filme filme : filmes) {
				System.out.println(filme);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main
}//class

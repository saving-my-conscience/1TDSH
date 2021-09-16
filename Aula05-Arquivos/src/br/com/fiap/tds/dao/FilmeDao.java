package br.com.fiap.tds.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tds.bean.Filme;

/**
 * Classe responsável por gravar e ler os filmes em um arquivo
 * @author Thiago Yamamoto
 * @version 1.0
 *
 */
public class FilmeDao {

	/**
	 * Gravar o filme no arquivo, os dados separados por ","
	 * @param filme objeto que será gravado no arquivo
	 * @throws erro ao gravar no arquivo
	 */
	public void gravar(Filme filme) throws IOException {
		//Criar o stream de saída de dados, escrever no final do arquivo
		FileWriter outputSteam = new FileWriter("filmes.txt", true);	
		//Criar o objeto que escrever no arquivo
		PrintWriter arquivo = new PrintWriter(outputSteam);
		
		//Escrever os valores do filme no arquivo, separando os atributos por ","
		arquivo.println(filme.getTitulo() + ","  + filme.getAutor() + "," + filme.getDuracao() + "," + filme.getGenero() );
		
		//Fechar
		outputSteam.close();
		arquivo.close();
	}
	
	/**
	 * Lê o arquivo e retorna todos os filmes em uma lista
	 * @return Lista todos os filmes do arquivo
	 */
	public List<Filme> listar() throws IOException {
		//Criar o stream de entrada de dados
		FileReader inputStream = new FileReader("filmes.txt");
		//Criar o objeto para ler do arquivo
		BufferedReader arquivo = new BufferedReader(inputStream);
		
		//Criar a lista de filmes
		List<Filme> filmes = new ArrayList<>();
		
		String linha;
		
		//Ler as linhas do arquivo
		while ((linha = arquivo.readLine()) != null) {
			//Separar os dados (atributos) .split(",") -> Retorna um vetor de string, separado pelo caracter informado
			String[] dados = linha.split(",");
			//Instanciar o filme com os dados lidos e adicionar na lista
			Filme filme = new Filme(dados[0], dados[1], Integer.parseInt(dados[2]), dados[3]);
			filmes.add(filme);
		}
		return filmes;
	}

}
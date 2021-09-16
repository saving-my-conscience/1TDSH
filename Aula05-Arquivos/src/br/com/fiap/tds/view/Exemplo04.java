package br.com.fiap.tds.view;

import java.io.File;
import java.io.IOException;

public class Exemplo04 {

	public static void main(String[] args) {
		
		//Criar um objeto que representa um diretório
		File diretorio = new File("arquivos");
		
		//Verificar se o objeto representa um diretório e se ele existe
		if (diretorio.isDirectory() && diretorio.exists()) {
			
			//Se existir exibir o caminho completo
			System.out.println(diretorio.getAbsolutePath());
			
		} else {
			//Se não existir, criar o diretório
			diretorio.mkdir();
			System.out.println("Criando o diretório...");
		}
		
		//Criar um arquivo dentro do diretório
		File arquivo = new File(diretorio, "churros.txt");
		
		try {
			arquivo.createNewFile();
			System.out.println("Criando o arquivo..");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main
}//class

package br.com.fiap.tds.view;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Exemplo03 {

	public static void main(String[] args) {
		
		//Instanciar um objeto que representa o arquivo exemplo.txt
		File arquivo = new File("exemplo.txt");
		
		//Validar se é um arquivo e o arquivo existe
		if (arquivo.isFile() && arquivo.exists()) {
			//Exibir o path do arquivo
			System.out.println(arquivo.getAbsolutePath());
			
			//Exibir o tamanho do arquivo
			System.out.println(arquivo.length() + " bytes");
			
			//Apagar o arquivo
			arquivo.delete();
		} else {
			try {
				//Se o arquivo não existir, criar o arquivo
				arquivo.createNewFile();
				
				//Gravar no arquivo
				PrintWriter outPrintWriter = new PrintWriter(arquivo);
				outPrintWriter.println("Fiap - Faculdade");
				outPrintWriter.close();
				
				//Ler do arquivo
				FileReader inputStream = new FileReader(arquivo);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}//main
}//class
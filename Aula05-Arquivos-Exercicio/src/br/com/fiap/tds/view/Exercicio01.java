package br.com.fiap.tds.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercicio01 {

	public static void main(String[] args) {
		try {
			//Ler um arquivo
			FileReader inputStream = new FileReader("exercicio.txt");
			BufferedReader reader = new BufferedReader(inputStream);
			
			String linha;
			StringBuffer texto = new StringBuffer();
			
			while ( (linha = reader.readLine()) != null ) {
				texto.append(linha).append("\n");
			}

			//Retirar os caracteres especiais
			String resultado = texto.toString().replaceAll("[^A-z \\n]*", "");
			
			//Escrever no arquivo resultado
			FileWriter outputStream = new FileWriter("resultado.txt");
			PrintWriter arquivo = new PrintWriter(outputStream);
			
			arquivo.print(resultado);
			
			System.out.println("Gerando o arquivo...");
			
			inputStream.close();
			reader.close();
			outputStream.close();
			arquivo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		//Exemplo de Expressão Regular (Regexp)
		String exemplo = "Thisdasgo!!";
		
		//Validar se a string possui somente caracteres A a z e espaço
		boolean ok = exemplo.matches("[A-z ]*");
		
		//Troca as ocorrências encontradas (caracteres que não são de A a z ou espaço)
		String teste = exemplo.replaceAll("[^A-z ]*", "");
		System.out.println(teste);
		
		System.out.println("Segue a regra: " + ok);
		*/
	}//main
}//class
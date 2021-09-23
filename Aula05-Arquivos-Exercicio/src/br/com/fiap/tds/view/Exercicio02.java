package br.com.fiap.tds.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercicio02 {

	public static void main(String[] args) {
		
		try {
			//Instanciar os streams de entrada e saída
			FileReader inputStream = new FileReader("soma.txt");
			BufferedReader reader = new BufferedReader(inputStream);
			
			FileWriter outputStream = new FileWriter("resultado-soma.txt");
			PrintWriter arquivo = new PrintWriter(outputStream);
			
			String linha;
			
			//Ler as linhas do arquivo
			while ((linha = reader.readLine()) != null) {
				//Separar os números
				String[] numeros = linha.split(",");
				int n1 = Integer.parseInt(numeros[0]);
				int n2 = Integer.parseInt(numeros[1]);
				//Realizar o cálculo
				int soma = n1 + n2;
				//Escrever no arquivo destino
				arquivo.println(n1 + "," + n2 + " = " + soma);
			}
			
			System.out.println("Arquivo processado!");
			
			//Fechar
			inputStream.close();
			reader.close();
			outputStream.close();
			arquivo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main
}//class
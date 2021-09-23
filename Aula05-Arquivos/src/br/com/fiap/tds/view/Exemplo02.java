package br.com.fiap.tds.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo02 {

	//Ler o arquivo
	public static void main(String[] args) {
		
		try {
			
			//Abrir o fluxo de leitura/entrada do arquivo
			FileReader inputStream = new FileReader("exemplo.txt");
			//Instancia a classe para ler as linhas do arquivo
			BufferedReader arquivo = new BufferedReader(inputStream);
			
			String linha;
			//Objeto para manipular Strings, podendo alterar o seu valor (String)
			StringBuffer texto = new StringBuffer();
			//String texto = "";
			
			//readLine() lê a linha e vai para a próxima linha, se não exitir mais linhas, retorna null
			//Primeiro lê a linha, depois atribui na variável "linha" e por fim, compara com null
			while ( (linha = arquivo.readLine()) != null) {
				texto.append(linha).append("\n"); //Adiciona a string no final da sequencia
				//texto += linha + "\n";
			}
			
			System.out.println(texto);
			
			//Fechar
			inputStream.close();
			arquivo.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}//main
}//class
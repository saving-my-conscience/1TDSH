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
			
			//readLine() l� a linha e vai para a pr�xima linha, se n�o exitir mais linhas, retorna null
			//Primeiro l� a linha, depois atribui na vari�vel "linha" e por fim, compara com null
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
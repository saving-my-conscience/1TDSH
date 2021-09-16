package br.com.fiap.tds.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Exemplo01 {

	//Gravar em um arquivo texto
	public static void main(String[] args) {
		
		try {
			//Abrir o fluxo de saída de dados, para inserir o conteúdo no final do arquivo
			FileWriter outputStream = new FileWriter("exemplo.txt", true);
			//Objeto que escreve no arquivo
			PrintWriter arquivo = new PrintWriter(outputStream);
			
			//Escrever no arquivo			
			//Pedir para o usuário escrever algo
			String nome = JOptionPane.showInputDialog("Digite o seu nome");
			arquivo.println(nome);
			System.out.println("Escrevendo no arquivo...");
			
			//Fechar os recursos
			outputStream.close();
			arquivo.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); //Exibe a pilha de execução
		}
		
	}//main
}//class

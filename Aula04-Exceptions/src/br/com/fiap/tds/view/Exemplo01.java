package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		

		try {
			//Código que pode lançar uma exceção
			//Ler um número
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			
			System.out.println("O número é "+ numero);
			
		} catch (NumberFormatException e) {
			//Captura da exception e tratamento
			System.out.println(e.getMessage());
		} finally {
			//Utilizado geralmente para fechar os recursos que foram abertos
			System.out.println("Opcional, Sempre executado!");
		}
		
		System.out.println("Finalizando o sistema");
		
	}//main
}//class
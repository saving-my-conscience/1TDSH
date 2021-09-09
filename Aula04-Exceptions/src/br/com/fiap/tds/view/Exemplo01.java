package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		

		try {
			//C�digo que pode lan�ar uma exce��o
			//Ler um n�mero
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
			
			System.out.println("O n�mero � "+ numero);
			
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
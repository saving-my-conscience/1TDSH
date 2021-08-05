package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class Exercicio02 {
	
	/*
	 * Crie um programa em Java onde o usuário informa N números e ao final é
	 * impresso o maior entre eles. Nota: o número N é um valor solicitado ao
	 * usuário durante a execução do programa; utilize vetores na solução.
	 */
	public static void main(String[] args) {
		//Ler a quantidade de números
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números"));
		
		//Criar o vetor para armazenar os números
		int[] vetor = new int[qtd];
		
		//Laço de repetição para ler os números
		for (int i=0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
		}
		
		//Variável com o maior número
		int maior = vetor[0];
		
		//Determinar qual o maior número
		for (int i=1; i < vetor.length; i++) {
			if (vetor[i] > maior)
				maior = vetor[i];
		}
		
		//Exibir os números e o maior número
		System.out.println("O maior número é " + maior);
		for (int item : vetor) {
			System.out.print(item + " ");
		}
	}	
}

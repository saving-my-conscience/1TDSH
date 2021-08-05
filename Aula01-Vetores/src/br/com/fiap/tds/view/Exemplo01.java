package br.com.fiap.tds.view;

public class Exemplo01 {

	public static void main(String[] args) {
		//Declarar um vetor de inteiros e inicializar o vetor com 5 posições
		int[] vetor = new int[5]; //O index começa do 0 e vai até o 4
		
		//Exibir a quantidade de posições do vetor
		System.out.println("Quantidade de posições: " + vetor.length);
		
		//Exibir o valor da primeira posição do vetor
		System.out.println("A primeira posição do vetor possui: " + vetor[0]);
		
		//Criar um vetor de String com 4 estados do brasil
		//String[] estados = new String[4];
		//estados[0] = "São Paulo";
		//estados[1] = "Bahia";
		//estados[2] = "Amazonas";
		//estados[3] = "Tocantins";
		
		String[] estados = {"São Paulo", "Bahia", "Amazonas", "Tocantins"};
		
		//Exibir os estados 
		System.out.println("Percorrendo o vetor com for");
		for (int i = 0; i < estados.length; i++) {
			System.out.println(estados[i]);
		}
		
		//Foreach (Variável que recebe cada item do vetor : vetor)
		System.out.println("Percorrendo o vetor com foreach");
		for (String item : estados) {
			System.out.println(item);
		}
		
		//Exibir os números do vetor
		System.out.println("Exibindo os valores do vetor de inteiros");
		for (int valor : vetor) {
			System.out.println(valor);
		}
		
	}//main	
}//classe
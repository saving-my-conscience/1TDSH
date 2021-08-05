package br.com.fiap.tds.view;

public class Exemplo01 {

	public static void main(String[] args) {
		//Declarar um vetor de inteiros e inicializar o vetor com 5 posi��es
		int[] vetor = new int[5]; //O index come�a do 0 e vai at� o 4
		
		//Exibir a quantidade de posi��es do vetor
		System.out.println("Quantidade de posi��es: " + vetor.length);
		
		//Exibir o valor da primeira posi��o do vetor
		System.out.println("A primeira posi��o do vetor possui: " + vetor[0]);
		
		//Criar um vetor de String com 4 estados do brasil
		//String[] estados = new String[4];
		//estados[0] = "S�o Paulo";
		//estados[1] = "Bahia";
		//estados[2] = "Amazonas";
		//estados[3] = "Tocantins";
		
		String[] estados = {"S�o Paulo", "Bahia", "Amazonas", "Tocantins"};
		
		//Exibir os estados 
		System.out.println("Percorrendo o vetor com for");
		for (int i = 0; i < estados.length; i++) {
			System.out.println(estados[i]);
		}
		
		//Foreach (Vari�vel que recebe cada item do vetor : vetor)
		System.out.println("Percorrendo o vetor com foreach");
		for (String item : estados) {
			System.out.println(item);
		}
		
		//Exibir os n�meros do vetor
		System.out.println("Exibindo os valores do vetor de inteiros");
		for (int valor : vetor) {
			System.out.println(valor);
		}
		
	}//main	
}//classe
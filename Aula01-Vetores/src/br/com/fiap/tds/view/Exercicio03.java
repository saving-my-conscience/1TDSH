package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Aluno;

public class Exercicio03 {

	/*
	 * Faça um programa em Java que solicite o nome de N alunos e suas respectivas
	 * 3 notas. Mostre no final qual é a maior nota da sala e o respectivo aluno.
	 * Nota: o número N é um valor solicitado ao usuário durante a execução do
	 * programa; utilize vetores na solução
	 */
	
	public static void main(String[] args) {
		//Ler a quantidade de alunos
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd de alunos"));
		
		//Declarar o vetor de alunos
		Aluno[] vetor = new Aluno[qtd];
		
		//Ler o nome e as notas do aluno
		for (int i=0; i < vetor.length; i++) {
			//Ler o nome do aluno
			String nome = JOptionPane.showInputDialog("Digite o nome");
			
			//Inicializar o vetor de notas do aluno
			float[] notas = new float[3];
			
			//Laço de repetição para ler as 3 notas do aluno
			for (int j=0; j < notas.length; j++) { 
				notas[j] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota " + (j + 1)));
			}
			
			//Instanciar um aluno com os valores e adicionar no vetor
			vetor[i] = new Aluno(nome, notas);
		}
		
		/*
		//Variável para armazenar os alunos que possuim as maiores notas
		Aluno[] alunoComMaiorNota = new Aluno[vetor.length];
		//Iniciar a primeira posição com o primeiro aluno
		alunoComMaiorNota[0] = vetor[0];
		//Variável auxiliar para controlar o index do vetor de alunos com maiores notas
		int indice = 0;
		
		//Verificar qual aluno possui a maior nota
		for (int i=1; i < vetor.length; i++) {
			//Validar se o aluno possui uma nota maior
			if (vetor[i].getMaiorNota() > alunoComMaiorNota[0].getMaiorNota()) {
				//"Resetar" o vetor com os alunos com maiores notas
				alunoComMaiorNota = new Aluno[vetor.length];
				//"Resetar" a variável auxiliar que controla o index do vetor de maiores notas
				indice = 0;
				//Adicionar o aluno na primeira posição do vetor
				alunoComMaiorNota[0] = vetor[i];
				//Validar se o aluno possui uma nota maior igual
			} else if (vetor[i].getMaiorNota() == alunoComMaiorNota[0].getMaiorNota()) {
				//Adicionar o aluno no vetor na posição correta
				indice++;
				alunoComMaiorNota[indice] = vetor[i];
			}			
		}*/
		
		Aluno alunoComMaiorNota = vetor[0];
		
		for (int i=1; i < vetor.length; i++) {
			if (vetor[i].getMaiorNota() > alunoComMaiorNota.getMaiorNota())
				alunoComMaiorNota = vetor[i];
		}
		
		//Vetor para armazenar os alunos
		Aluno[] alunos = new Aluno[vetor.length];		
		int indice = 0;
		
		//Percorre o vetor para encontrar os alunos com a maior nota
		for (Aluno item : vetor) {
			if (alunoComMaiorNota.getMaiorNota() == item.getMaiorNota()) {
				alunos[indice] = item;
				indice++;
			}
		}
		
		//Exibir todos os alunos e as notas
		for (Aluno item : vetor ) {
			System.out.print(item.getNome() + " Notas: ");
			for (float nota : item.getNotas()) {
				System.out.print(nota + " ");
			}
			System.out.println();
		}
		
		System.out.println("Maiores notas:");
		for (int i =0 ; i < indice; i++) {
			//Exibir a nota e o nome dos alunos com as maiores notas
			System.out.println("Aluno: " + alunos[i].getNome() + " Nota: " + alunos[i].getMaiorNota());
		}
	}//main	
}//classe
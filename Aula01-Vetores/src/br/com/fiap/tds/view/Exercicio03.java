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
		
		//Variável para armazenar o aluno que possui a maior nota
		Aluno alunoComMaiorNota = vetor[0];
		
		//Verificar qual aluno possui a maior nota
		for (int i=1; i < vetor.length; i++) {
			if (vetor[i].getMaiorNota() > alunoComMaiorNota.getMaiorNota())
				alunoComMaiorNota = vetor[i];
		}
		
		//Exibir todos os alunos e as notas
		
		//Exibir a nota e o nome dos alunos com as maiores notas
		System.out.println("Aluno: " + alunoComMaiorNota.getNome() + " Nota: " + alunoComMaiorNota.getMaiorNota());
		
	}//main	
}//classe
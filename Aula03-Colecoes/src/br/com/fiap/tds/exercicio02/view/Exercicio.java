package br.com.fiap.tds.exercicio02.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.tds.exercicio02.bean.Aluno;

public class Exercicio {

	public static void main(String[] args) {
		
		//Variável para armazenar a escolha do usuário
		int opcao;
		
		//Criar a lista de alunos
		List<Aluno> lista = new ArrayList<>(); 
		
		do {
			//Ler os dados do aluno
			String nome = JOptionPane.showInputDialog("Digite o nome");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			float media = Float.parseFloat(JOptionPane.showInputDialog("Digite a média do aluno"));
			
			//Instanciar um aluno
			Aluno aluno = new Aluno(nome, idade, media);
			
			//Adicionar o aluno na lista
			lista.add(aluno);
			
			//Verificar se o usuário quer adicionar mais alunos
			opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais alunos?");
		} while (opcao == JOptionPane.YES_OPTION);
		
		
	}//main
}//class

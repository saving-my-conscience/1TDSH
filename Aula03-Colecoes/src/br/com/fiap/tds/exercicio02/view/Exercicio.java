package br.com.fiap.tds.exercicio02.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.tds.exercicio02.bean.Aluno;

public class Exercicio {

	public static void main(String[] args) {
		
		//Vari�vel para armazenar a escolha do usu�rio
		int opcao;
		
		//Criar a lista de alunos
		List<Aluno> lista = new ArrayList<>(); 
		
		//Carregar as informa��es dos alunos:
		do {
			//Ler os dados do aluno
			String nome = JOptionPane.showInputDialog("Digite o nome");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			float media = Float.parseFloat(JOptionPane.showInputDialog("Digite a m�dia do aluno"));
			
			//Instanciar um aluno
			Aluno aluno = new Aluno(nome, idade, media);
			
			//Adicionar o aluno na lista
			lista.add(aluno);
			
			//Verificar se o usu�rio quer adicionar mais alunos
			opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais alunos?");
		} while (opcao == JOptionPane.YES_OPTION);
		
		//Relat�rio: 
		//Adiciona os valores do primeiro aluno
		float somaMedias = lista.get(0).getMedia();
		int somaIdades = lista.get(0).getIdade();
		int maiorIdade = lista.get(0).getIdade();
		int menorIdade = lista.get(0).getIdade();
		
		//La�o para armazenar as informa��es nas vari�veis auxiliares
		for (int i = 1; i< lista.size(); i++) {
			somaMedias += lista.get(i).getMedia();
			somaIdades += lista.get(i).getIdade();
			
			if (lista.get(i).getIdade() > maiorIdade)
				maiorIdade = lista.get(i).getIdade();
			
			if (lista.get(i).getIdade() < menorIdade)
				menorIdade = lista.get(i).getIdade();
		}
		//Total de alunos cadastrados
		System.out.println("Total de alunos: " + lista.size());
		//M�dia geral de notas
		System.out.println("M�dia geral de notas: " + somaMedias/lista.size());
		//M�dia geral de idade
		System.out.println("M�dia geral de idade: " + somaIdades/lista.size());
		//Maior Idade
		System.out.println("Maior idade: " + maiorIdade);
		//Menor Idade
		System.out.println("Menor idade: " + menorIdade);
		
		//Menu:
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n1-Exibir alunos \n2-Alunos acima de 6 "
				+ "\n3-Alunos acima de 30 anos \n4-Excluir alunos com menos de 3 \n5-Sair"));
			switch(opcao) {
			case 1:
				//1-Imprimir os nomes e m�dias de todos os alunos
				for (Aluno aluno : lista) {
					System.out.println(aluno);
				}
				break;
			case 2:
				//2-Imprimir apenas os nomes dos alunos que possuem m�dia acima de 6.0
				System.out.println("Alunos acima da m�dia");
				for (Aluno aluno : lista) {
					if (aluno.getMedia() > 6) {
						System.out.println(aluno);
					}
				}
				break;
			case 3:
				//3-Imprimir apenas os nomes dos alunos que possuem idade acima de 30 anos
				System.out.println("Alunos acima de 30 anos");
//				for (Aluno aluno : lista) {
//					if (aluno.getIdade() > 30) {
//						System.out.println(aluno);
//					}
//				}
				lista.forEach(aluno -> System.out.print(aluno.getIdade() > 30 ? aluno + "\n" : ""));
				break;
			case 4: 
				//4-Excluir os alunos com m�dias menores que 3.0				
//				for (int i = 0; i < lista.size(); i++) {
//					if (lista.get(i).getMedia() < 3) {
//						lista.remove(i);
//						i--;
//					}
//				}
				lista.removeIf(aluno -> aluno.getMedia() < 3);
				System.out.println("Alunos exclu�dos...");
				break;
			case 5:
				//5-Sair do sistema
				System.out.println("Finalizando o sistema...");
				break;
			default:
				System.out.println("Op��o inv�lida");	
			}
		} while (opcao != 5);
	}//main
}//class

package br.com.fiap.tds.exercicio03.view;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Desenvolva um programa em Java que permita ao usuário cadastrar e consultar
 * os números de DDD pertencentes a um estado(UF). a) Ao ser executado o sistema
 * deverá exibir um menu ao usuário onde é apresentado 3 opções: i) Incluir o
 * estado e seus DDDs ii) Consultar os DDDs de um estado iii) Sair b) Caso o
 * usuário selecione a opção 1, o sistema deverá solicitar a sigla do estado e
 * depois permitir que o usuário atribua quantos números de DDD desejar. c) Caso
 * o usuário selecione a opção 2, o sistema deverá solicitar a sigla do estado e
 * depois exibir os números de DDD que foram atribuídos a ele.
 */
public class Exercicio {

	public static void main(String[] args) {
		//Objeto para ler os dados inseridos pelo usuário
		Scanner leitor = new Scanner(System.in);
		
		// Variável que armazena a escolha do usuário
		int opcao;
		
		//Variável para armazenar a sigla e os DDDs (Mapa -> chave - sigla, valor - DDDs)
		Map<String, Set<Integer>> mapa = new HashMap<String, Set<Integer>>();

		// Laço de repetição
		do {
			// Exibir o menu e ler a opção escolhida
			System.out.println("Escolha: \n1-Adicionar \n2-Consultar \n4-Listar \n3-Sair");
			opcao = leitor.nextInt();
			switch (opcao) {
			case 1: 
				//Ler a sigla do estado
				System.out.println("Digite a sigla");
				String sigla = leitor.next();
				
				//Criar um Set para armazenar os DDDs
				Set<Integer> ddds = new HashSet<Integer>();
				
				//Verifica se o estado já possui DDDs cadastrados
				if (mapa.containsKey(sigla)) {
					//Recuperar o conjunto de DDDs da sigla
					ddds = mapa.get(sigla);
				}
				
				//Ler os DDDs, quantos o usuário quiser
				do {
					System.out.println("Digite o DDD");
					ddds.add(leitor.nextInt());
					System.out.println("Deseja adicionar mais? (1)-Sim,(0)-Não");
				} while(leitor.nextInt() != 0);
				
				//Adicionar o mapeamento no mapa
				mapa.put(sigla, ddds);
				break;
			case 2:
				//Ler a sigla do estado
				System.out.println("Digite a sigla");
				sigla = leitor.next();

				//Verifica se o mapeamento possui a sigla
				if (mapa.containsKey(sigla)) {
					//Pesquisar os DDDs pela sigla 
					ddds = mapa.get(sigla);
					
					//Exibir os DDDs
					for (int item : ddds) {
						System.out.println(item);
					}				
				} else {
					System.out.println("O estado " + sigla + " não possui DDDs cadastrados!");
				}
				break;
			case 4:
				//Exibir a sigla e os DDDs de todos os mapeamentos
				//Recuperar todas as siglas (chaves do mapa)
				Set<String> siglas = mapa.keySet();
				
				//Exibir a chave (sigla) e os valores (ddds)
				for (String item : siglas) {
					System.out.println(item + " " + mapa.get(item));
				}
				break;
			case 3:
				System.out.println("Finalizando o sistema");
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (opcao != 3);

		leitor.close();
	}// main
}// class
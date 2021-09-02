package br.com.fiap.tds.exercicio03.view;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Desenvolva um programa em Java que permita ao usu�rio cadastrar e consultar
 * os n�meros de DDD pertencentes a um estado(UF). a) Ao ser executado o sistema
 * dever� exibir um menu ao usu�rio onde � apresentado 3 op��es: i) Incluir o
 * estado e seus DDDs ii) Consultar os DDDs de um estado iii) Sair b) Caso o
 * usu�rio selecione a op��o 1, o sistema dever� solicitar a sigla do estado e
 * depois permitir que o usu�rio atribua quantos n�meros de DDD desejar. c) Caso
 * o usu�rio selecione a op��o 2, o sistema dever� solicitar a sigla do estado e
 * depois exibir os n�meros de DDD que foram atribu�dos a ele.
 */
public class Exercicio {

	public static void main(String[] args) {
		//Objeto para ler os dados inseridos pelo usu�rio
		Scanner leitor = new Scanner(System.in);
		
		// Vari�vel que armazena a escolha do usu�rio
		int opcao;
		
		//Vari�vel para armazenar a sigla e os DDDs (Mapa -> chave - sigla, valor - DDDs)
		Map<String, Set<Integer>> mapa = new HashMap<String, Set<Integer>>();

		// La�o de repeti��o
		do {
			// Exibir o menu e ler a op��o escolhida
			System.out.println("Escolha: \n1-Adicionar \n2-Consultar \n4-Listar \n3-Sair");
			opcao = leitor.nextInt();
			switch (opcao) {
			case 1: 
				//Ler a sigla do estado
				System.out.println("Digite a sigla");
				String sigla = leitor.next();
				
				//Criar um Set para armazenar os DDDs
				Set<Integer> ddds = new HashSet<Integer>();
				
				//Verifica se o estado j� possui DDDs cadastrados
				if (mapa.containsKey(sigla)) {
					//Recuperar o conjunto de DDDs da sigla
					ddds = mapa.get(sigla);
				}
				
				//Ler os DDDs, quantos o usu�rio quiser
				do {
					System.out.println("Digite o DDD");
					ddds.add(leitor.nextInt());
					System.out.println("Deseja adicionar mais? (1)-Sim,(0)-N�o");
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
					System.out.println("O estado " + sigla + " n�o possui DDDs cadastrados!");
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
				System.out.println("Op��o inv�lida");
			}
		} while (opcao != 3);

		leitor.close();
	}// main
}// class
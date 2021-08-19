package br.com.fiap.tds.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplo01 {

	public static void main(String[] args) {
		//Declara e instancia uma lista
		List<String> lista = new ArrayList<>();
		
		//Adicionar elementos String na lista
		lista.add("São Paulo"); //0
		lista.add("Rio de Janeiro"); //1
		lista.add("Minas Gerais"); //2
		lista.add("Amazonas"); //3
		lista.add("Alagoas"); //4
		
		//Adicionar um elemento na lista em uma posição específica
		lista.add(2,"Espirito Santo");//2 
		
		//Alterar o valor do elemento de uma posição específica
		lista.set(1, "Bahia");
		
		//Remover o elemento dado uma posição
		lista.remove(0);
		//Remover um elemento da lista (a primeira ocorrência)

		lista.remove("Bahia");

		//Remove todos os elementos da lista
		//lista.clear();
		
		//Transforma um vetor em uma lista
		List numeros = Arrays.asList(new int[] {1,2,3});

		//Validar se a lista contém elementos
		if (!lista.isEmpty()) {
			//Verificar qual a primeira posição do elemento Amazonas
			System.out.println("Amazonas está na posição: " + lista.indexOf("Amazonas"));
			
			//Verificar se existe o estado Bahia na coleção
			if (lista.contains("Bahia")) {
				System.out.println("A lista possui a Bahia");
			} else {
				System.out.println("A lista não contém a Bahia");
			}
			
			//Recuperar e exibir o elemento da posição 2
			System.out.println(lista.get(2)); 
			
			//Exibir os elementos da lista
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(i + " " + lista.get(i));
			}
		}else {
			System.out.println("A lista está vazia");
		}
		
		//Converter uma lista em um vetor
		Object[] vetor = lista.toArray();
		System.out.println("Tamanho do vetor: " + vetor.length);
		
		//Criar uma sublista da lista de estados
		List<String> subLista = lista.subList(1, 3);
		System.out.println("Sublista:");
		
		System.out.println(lista.subList(1, 3));
		
		//Exibir os elementos da sublista
		for (int i=0; i < subLista.size(); i++) {
			System.out.println(i + " " + subLista.get(i));
		}
		
		for (String item : subLista) {
			System.out.println(item);
		}
		
		//Pega cada elemento da lista e utiliza o método println
		subLista.forEach(System.out::println);
		//item é um parâmetro do método, que representa um item da lista, do outro lado da seta é o função 
		subLista.forEach(item -> System.out.println(item));
		
	}//main
}//class
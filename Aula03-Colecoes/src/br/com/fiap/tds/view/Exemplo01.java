package br.com.fiap.tds.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplo01 {

	public static void main(String[] args) {
		//Declara e instancia uma lista
		List<String> lista = new ArrayList<>();
		
		//Adicionar elementos String na lista
		lista.add("S�o Paulo"); //0
		lista.add("Rio de Janeiro"); //1
		lista.add("Minas Gerais"); //2
		lista.add("Amazonas"); //3
		lista.add("Alagoas"); //4
		
		//Adicionar um elemento na lista em uma posi��o espec�fica
		lista.add(2,"Espirito Santo");//2 
		
		//Alterar o valor do elemento de uma posi��o espec�fica
		lista.set(1, "Bahia");
		
		//Remover o elemento dado uma posi��o
		lista.remove(0);
		//Remover um elemento da lista (a primeira ocorr�ncia)

		lista.remove("Bahia");

		//Remove todos os elementos da lista
		//lista.clear();
		
		//Transforma um vetor em uma lista
		List numeros = Arrays.asList(new int[] {1,2,3});

		//Validar se a lista cont�m elementos
		if (!lista.isEmpty()) {
			//Verificar qual a primeira posi��o do elemento Amazonas
			System.out.println("Amazonas est� na posi��o: " + lista.indexOf("Amazonas"));
			
			//Verificar se existe o estado Bahia na cole��o
			if (lista.contains("Bahia")) {
				System.out.println("A lista possui a Bahia");
			} else {
				System.out.println("A lista n�o cont�m a Bahia");
			}
			
			//Recuperar e exibir o elemento da posi��o 2
			System.out.println(lista.get(2)); 
			
			//Exibir os elementos da lista
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(i + " " + lista.get(i));
			}
		}else {
			System.out.println("A lista est� vazia");
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
		
		//Pega cada elemento da lista e utiliza o m�todo println
		subLista.forEach(System.out::println);
		//item � um par�metro do m�todo, que representa um item da lista, do outro lado da seta � o fun��o 
		subLista.forEach(item -> System.out.println(item));
		
	}//main
}//class
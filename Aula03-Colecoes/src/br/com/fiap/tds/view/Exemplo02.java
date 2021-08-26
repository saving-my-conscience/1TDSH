package br.com.fiap.tds.view;

import java.util.HashSet;
import java.util.Set;

public class Exemplo02 {

	public static void main(String[] args) {
		//Sets -> n�o permitem valores duplicados
		Set<String> conjunto = new HashSet<String>();
		
		//Adicionar elementos no conjunto
		conjunto.add("Alemanha");
		conjunto.add("Brasil");
		conjunto.add("Jap�o");
		conjunto.add("EUA");
		
		//Adicionar um elemento repetido no conjunto
		conjunto.add("Alemanha");
		conjunto.add("EUA");
		
		//Exibir a quantidade de elementos do conjunto
		System.out.println("Quantidade de elementos no conjunto: " + conjunto.size());
		
		//Remover um elemento
		conjunto.remove("Jap�o");
		
		//Remover todos os elementos
		//conjunto.clear();
		
		//Verificar se o conjunto est� vazio
		if (conjunto.isEmpty())
			System.out.println("O conjunto est� vazio");
		else
			System.out.println("O conjunto possui elementos");
		
		//Verificar se o conjunto possui "Brasil"
		if (conjunto.contains("Brasil"))
			System.out.println("O conjunto possui Brasil");
		else
			System.out.println("Est� faltando o Brasil!");
		
		//Transformar o conjunto em um vetor
		Object[] vetor = conjunto.toArray();
		System.out.println("Exibindo os dados do vetor:");
		System.out.println("Quantidade de elementos do vetor: " + vetor.length);
		for (Object item : vetor) {
			System.out.println(item);
		}
		
		System.out.println("Exibindo os dados do conjunto:");
		//Exibir os valores do conjunto
		for (String item : conjunto) {
			System.out.println(item);	
		}
	}//main
}//class

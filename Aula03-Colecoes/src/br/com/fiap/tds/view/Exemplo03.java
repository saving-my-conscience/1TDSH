package br.com.fiap.tds.view;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exemplo03 {

	public static void main(String[] args) {
		//Mapas (Dicionário)
		Map<String, String> mapa = new HashMap<String, String>();
		
		//Adicionar a chave como a sigla e o valor o nome do estado
		mapa.put("SP", "São Paulo");
		mapa.put("RR", "Roraima");
		mapa.put("BA", "Bahia");
		mapa.put("AC", "Acre");
		mapa.put("PR", "Paraná");
		
		//Adicionar um elemento com a mesma chave
		mapa.put("BA", "Brasil");
		
		//Recuperar o elemento da chave BA
		System.out.println("O elemento na chave [\"BA\"] é: " + mapa.get("BA"));
		
		//Exibir a quantidade de elementos no mapa
		System.out.println("A quantidade de elementos é: " + mapa.size());
		
		//Remove todos os mapeamentos
		//mapa.clear();
		
		//Verificar se o mapa está vazio
		if (mapa.isEmpty()) {
			System.out.println("O mapa está vazio");
		} else {
			System.out.println("O mapa possui elementos");
		}
		
		//Remover o elemento na chave BA
		mapa.remove("BA");
		
		//Verificar se existe a chave "SP" no mapeamento
		if (mapa.containsKey("SP"))
			System.out.println("O mapa possui a chave SP");
		else
			System.out.println("O mapa não possui a chave SP");
		
		//Verificar se existe o valor "Amazonas" no mapeamento
		if (mapa.containsValue("Amazonas"))
			System.out.println("O mapa possui o valor Amazonas");
		else
			System.out.println("O mapa não possui o valor Amazonas");
		
		//Recuperar os valores do mapa
		Collection<String> valores = mapa.values();
		
		//Exibir os valores da coleção
		System.out.println("Valores do mapa:");
		for (String item : valores) {
			System.out.println(item);
		}
		
		//Recuperar as chaves do mapa
		Set<String> chaves = mapa.keySet();
		
		//Exibir as chaves do set
		System.out.println("Chaves do mapa:");
		for (String item : chaves) {
			System.out.println(item);
		}
		
		//Exibir os dados do mapa
		System.out.println("Mapeamento:");
		for (String item : chaves) {
			System.out.println("[" + item + "] = " + mapa.get(item));
		}
		
	}//main
}//class

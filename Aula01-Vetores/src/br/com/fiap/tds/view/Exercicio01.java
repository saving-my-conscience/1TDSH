package br.com.fiap.tds.view;

import javax.swing.JOptionPane;
import br.com.fiap.tds.bean.Produto;

public class Exercicio01 {

	/**
 	Escreva um programa em Java que solicite ao usu�rio N
	produtos, suas respectivas quantidades, pre�os e descontos
	(se em oferta) e mostre no final o valor total a ser pago.
	 */
	public static void main(String[] args) {		
		//Ler a quantidade de produtos
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd de produtos"));
		
		//Criar o vetor de Produtos
		Produto[] vetor = new Produto[qtd];
		
		//Criar um la�o de repeti��o para ler cada produto e adicionar no vetor
		for (int i=0; i < vetor.length; i++) {
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd"));
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o"));
			double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o desconto"));
			vetor[i] = new Produto(quantidade,preco, desconto);
		}
		
		//Declarar a vari�vel para armazenar o valor total
		double valorTotal = 0;
		
		//Criar um la�o de repeti��o para calcular o valor a ser pago
		for (Produto produto : vetor) {
				valorTotal += produto.getQuantidade() * (produto.getPreco() - produto.getDesconto());
				//Exibir os valores dos atributos do produto
				System.out.println(produto);
		} 
				
		//Exibir o valor total
		System.out.println("O valor total � " + valorTotal);
		
	}//main
}//classe

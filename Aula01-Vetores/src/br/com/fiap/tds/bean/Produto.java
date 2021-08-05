package br.com.fiap.tds.bean;

public class Produto {

	private int quantidade;
	
	private double preco;
	
	private double desconto;
	
	public Produto() {}

	public Produto(int quantidade, double preco, double desconto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	@Override
	public String toString() {		
		return "Preço: " + preco + " Quantidade: " + quantidade + " Desconto: " + desconto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}

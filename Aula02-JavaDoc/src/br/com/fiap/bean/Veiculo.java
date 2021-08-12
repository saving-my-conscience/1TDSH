package br.com.fiap.bean;

/**
 * Classe que representa um veículo da concessionária
 * @author Thiago Yamamoto
 * @version 1.0
 *
 */
public class Veiculo {

	/**
	 * Armazena o ano do veículo
	 */
	private int ano;
	
	/**
	 * Armazena o modelo do veículo
	 */
	private String modelo;
	
	/**
	 * Armazena o preço do veículo
	 */
	private double valor;
	
	/**
	 * Inicializa uma instância com os atributos com valores padrões 
	 */
	public Veiculo() {}
	
	/**
	 * Inicializa uma instância com os valores informados
	 * @param ano Ano do veículo
	 * @param modelo Modelo do veículo
	 * @param valor Preço praticado
	 */
	public Veiculo(int ano, String modelo, double valor) {
		super();
		this.ano = ano;
		this.modelo = modelo;
		this.valor = valor;
	}
	
	/**
	 * Calcula o desconto que será aplicado na venda
	 * @param porcentagem Valor da porcentagem de desconto, ex. 10%
	 * @return O valor do desconto que pode ser aplicado
	 */
	public double calcularDesconto(double porcentagem) {
		return valor * porcentagem/100;
	}

	/**
	 * Aumenta o valor do veículo de acordo com a inflação informada
	 * @param inflacao Valor da inflação, ex. 10%
	 */
	public void aumentarValor(double inflacao) {
		valor += valor * inflacao/100;
	}
	
	/**
	 * Retorna o ano do veículo
	 * @return Ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Altera o ano do veículo
	 * @param ano Valor do ano
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * Retorna o modelo do veículo
	 * @return Modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Altera o modelo do veículo
	 * @param modelo Valor do veículo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Recupera o preço do veículo
	 * @return Valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * Altera o valor do veículo
	 * @param valor Preço do veículo
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
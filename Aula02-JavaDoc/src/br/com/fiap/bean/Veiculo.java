package br.com.fiap.bean;

/**
 * Classe que representa um ve�culo da concession�ria
 * @author Thiago Yamamoto
 * @version 1.0
 *
 */
public class Veiculo {

	/**
	 * Armazena o ano do ve�culo
	 */
	private int ano;
	
	/**
	 * Armazena o modelo do ve�culo
	 */
	private String modelo;
	
	/**
	 * Armazena o pre�o do ve�culo
	 */
	private double valor;
	
	/**
	 * Inicializa uma inst�ncia com os atributos com valores padr�es 
	 */
	public Veiculo() {}
	
	/**
	 * Inicializa uma inst�ncia com os valores informados
	 * @param ano Ano do ve�culo
	 * @param modelo Modelo do ve�culo
	 * @param valor Pre�o praticado
	 */
	public Veiculo(int ano, String modelo, double valor) {
		super();
		this.ano = ano;
		this.modelo = modelo;
		this.valor = valor;
	}
	
	/**
	 * Calcula o desconto que ser� aplicado na venda
	 * @param porcentagem Valor da porcentagem de desconto, ex. 10%
	 * @return O valor do desconto que pode ser aplicado
	 */
	public double calcularDesconto(double porcentagem) {
		return valor * porcentagem/100;
	}

	/**
	 * Aumenta o valor do ve�culo de acordo com a infla��o informada
	 * @param inflacao Valor da infla��o, ex. 10%
	 */
	public void aumentarValor(double inflacao) {
		valor += valor * inflacao/100;
	}
	
	/**
	 * Retorna o ano do ve�culo
	 * @return Ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Altera o ano do ve�culo
	 * @param ano Valor do ano
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * Retorna o modelo do ve�culo
	 * @return Modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Altera o modelo do ve�culo
	 * @param modelo Valor do ve�culo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Recupera o pre�o do ve�culo
	 * @return Valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * Altera o valor do ve�culo
	 * @param valor Pre�o do ve�culo
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
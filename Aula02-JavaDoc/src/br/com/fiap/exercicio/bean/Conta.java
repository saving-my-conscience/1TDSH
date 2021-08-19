package br.com.fiap.exercicio.bean;

/**
 * Classe que representa uma Conta Bancária
 * @author Thiago Yamamoto
 * @version 1.0
 */
public class Conta {

	/**
	 * Número da agência
	 */
	private int agencia;
	
	/**
	 * Número da conta com dígito
	 */
	private String numero;
	
	/**
	 * Saldo da conta bancária em reais
	 */
	protected double saldo;
	
	/**
	 * Inicializa o objeto conta sem valores
	 */
	public Conta() {}

	/**
	 * Inicializa o objeto com valores para agência e número da conta
	 * @param agencia Número da agência
	 * @param numero Número da conta bancária com dígito
	 */
	public Conta(int agencia, String numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	/**
	 * Recupera o número da agência
	 * @return número da agência
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * Altera o número da agência
	 * @param agencia número da agência
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * Recupera o número da conta com dígito
	 * @return número da conta com dígito
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Altera o número da conta com dígito
	 * @param numero número da conta com dígito
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Retorna o saldo da conta bancária em reais
	 * @return saldo da conta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Altera o saldo da conta bancária em reais
	 * @param saldo saldo da conta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}

package br.com.fiap.exercicio.bean;

/**
 * Classe que representa uma Conta Banc�ria
 * @author Thiago Yamamoto
 * @version 1.0
 */
public class Conta {

	/**
	 * N�mero da ag�ncia
	 */
	private int agencia;
	
	/**
	 * N�mero da conta com d�gito
	 */
	private String numero;
	
	/**
	 * Saldo da conta banc�ria em reais
	 */
	protected double saldo;
	
	/**
	 * Inicializa o objeto conta sem valores
	 */
	public Conta() {}

	/**
	 * Inicializa o objeto com valores para ag�ncia e n�mero da conta
	 * @param agencia N�mero da ag�ncia
	 * @param numero N�mero da conta banc�ria com d�gito
	 */
	public Conta(int agencia, String numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	/**
	 * Recupera o n�mero da ag�ncia
	 * @return n�mero da ag�ncia
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * Altera o n�mero da ag�ncia
	 * @param agencia n�mero da ag�ncia
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * Recupera o n�mero da conta com d�gito
	 * @return n�mero da conta com d�gito
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Altera o n�mero da conta com d�gito
	 * @param numero n�mero da conta com d�gito
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Retorna o saldo da conta banc�ria em reais
	 * @return saldo da conta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Altera o saldo da conta banc�ria em reais
	 * @param saldo saldo da conta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}

package br.com.fiap.exercicio.bean;

/**
 * Classe que representa uma Conta Corrente
 * @author Thiago Yamamoto
 * @version 1.0
 */
public class ContaCorrente extends Conta {

	/**
	 * Limite dispon�vel na conta corrente
	 */
	private double limite;

	/**
	 * Inicializa o objeto sem valores
	 */
	public ContaCorrente() {}
	
	/**
	 * Inicializa o objeto com valores para ag�ncia, n�mero e limite
	 * @param agencia n�mero da ag�ncia
	 * @param numero n�mero da conta banc�ria com d�gito
	 * @param limite valor do cheque especial
	 */
	public ContaCorrente(int agencia, String numero, double limite) {
		super(agencia, numero);
		this.limite = limite;
	}
	
	/**
	 * Retorna o valor total da conta, somando com o limite
	 * @return o valor do saldo mais o limite
	 */
	public double exibirSaldoTotal() {
		return saldo + limite;
	}


	/**
	 * Retorna o valor do limite da conta corrente
	 * @return valor do cheque especial
	 */
	public double getLimite() {
		return limite;
	}

	/**
	 * Altera o valor do limite da conta banc�ria
	 * @param limite valor do novo limite
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
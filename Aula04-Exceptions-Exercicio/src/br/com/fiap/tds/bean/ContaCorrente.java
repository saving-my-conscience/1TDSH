package br.com.fiap.tds.bean;

import br.com.fiap.tds.exception.SaldoInsuficienteException;
import br.com.fiap.tds.exception.ValorNegativoException;
import br.com.fiap.tds.view.TesteContaCorrente;

/**
 * Classe que representa uma Conta Corrente
 * @author Thiago Yamamoto
 * @version 1.0
 */
public class ContaCorrente {

	private double saldo;
	private double limite;
	
	/**
	 * Construtor que inicializa a conta corrente sem valores
	 */
	public ContaCorrente() {}

	/**
	 * Construtor que inicializa a conta corrente com os valores para o saldo e limite
	 * @param saldo valor do saldo em reais
	 * @param limite valor do limite em reais
	 */
	public ContaCorrente(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	
	/**
	 * Realiza o saque da conta corrente
	 * @param valor valor que será retirado do saldo
	 * @throws ValorNegativoException o valor não pode ser negativo
	 * @throws SaldoInsuficienteException o valor não pode ser maior do que o saldo + limite
	 */
	public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
		validarValorNegativo(valor);
		if (valor > limite + saldo) {
			throw new SaldoInsuficienteException();
		}
		saldo -= valor; //saldo = saldo - valor;
	}
	
	/**
	 * Realiza o depósito na conta corrente
	 * @param valor valor que será depositado no saldo
	 * @throws ValorNegativoException o valor não pode ser negativo
	 */
	public void depositar(double valor) throws ValorNegativoException {
		validarValorNegativo(valor);
		saldo += valor; //saldo = saldo + valor;
	}
	
	private void validarValorNegativo(double valor) throws ValorNegativoException {
		if (valor < 0) {
			throw new ValorNegativoException();
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) throws ValorNegativoException {
		validarValorNegativo(limite);
		this.limite = limite;
	}
	
}
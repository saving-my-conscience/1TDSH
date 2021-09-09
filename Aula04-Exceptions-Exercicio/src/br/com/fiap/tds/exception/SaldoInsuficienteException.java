package br.com.fiap.tds.exception;

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException() {
		super("Saldo insuficiente");
	}
	
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
	
}
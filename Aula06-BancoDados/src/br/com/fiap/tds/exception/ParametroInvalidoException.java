package br.com.fiap.tds.exception;

public class ParametroInvalidoException extends Exception {

	public ParametroInvalidoException() {
		super("Par�metro inv�lido");
	}
	
	public ParametroInvalidoException(String msg) {
		super(msg);
	}
	
}
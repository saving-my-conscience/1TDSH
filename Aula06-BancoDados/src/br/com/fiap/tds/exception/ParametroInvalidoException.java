package br.com.fiap.tds.exception;

public class ParametroInvalidoException extends Exception {

	public ParametroInvalidoException() {
		super("Parâmetro inválido");
	}
	
	public ParametroInvalidoException(String msg) {
		super(msg);
	}
	
}
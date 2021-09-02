package br.com.fiap.tds.exception;

//Exception -> Checked (checada em tempo de compilação)
//RuntimeException -> Unchecked (não checada)

public class SalarioInvalidoException extends Exception {

	//CTR + 3 -> gcfs (Source -> Generate Constructor From Superclass)
	
	public SalarioInvalidoException() {
		super();
	}

	public SalarioInvalidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SalarioInvalidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public SalarioInvalidoException(String message) {
		super(message);
	}

	public SalarioInvalidoException(Throwable cause) {
		super(cause);
	}

}
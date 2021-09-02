package br.com.fiap.tds.exception;

public class MesesTrabalhadosInvalidoException extends Exception {

	public MesesTrabalhadosInvalidoException() {
		super();
	}

	public MesesTrabalhadosInvalidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MesesTrabalhadosInvalidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public MesesTrabalhadosInvalidoException(String message) {
		super(message);
	}

	public MesesTrabalhadosInvalidoException(Throwable cause) {
		super(cause);
	}
	
}

package br.com.fiap.tds.exception;

public class ValorNegativoException extends Exception {

	public ValorNegativoException() {
		//Mensagem padr�o de exception
		super("Valor n�o pode ser negativo");
	}
	
	public ValorNegativoException(String mensagem){
		super(mensagem);
	}
	
}
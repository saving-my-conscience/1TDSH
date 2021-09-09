package br.com.fiap.tds.exception;

public class ValorNegativoException extends Exception {

	public ValorNegativoException() {
		//Mensagem padrão de exception
		super("Valor não pode ser negativo");
	}
	
	public ValorNegativoException(String mensagem){
		super(mensagem);
	}
	
}
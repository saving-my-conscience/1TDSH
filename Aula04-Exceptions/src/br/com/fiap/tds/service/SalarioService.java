package br.com.fiap.tds.service;

import br.com.fiap.tds.exception.MesesTrabalhadosInvalidoException;
import br.com.fiap.tds.exception.SalarioInvalidoException;

/**
 * Classe que calcula os sal�rios e b�nus dos Colaboradores
 * @author Thiago Yamamoto
 * @version 1.0
 */
public class SalarioService {

	/**
	 * M�todo que calcula o d�cimo terceiro sal�rio do colaborador
	 * @param salario valor do sal�rio
	 * @param mesesTrabalhados meses trabalhados pelo colaborador
	 * @return o valor do d�cimo terceiro sal�rio
	 * @throws MesesTrabalhadosInvalidoException exception caso os meses trabalhados n�o esteja entre 0 e 12
	 * @throws SalarioInvalidoException exception caso o sal�rio seja negativo
	 */
	public double calcularDecimoTerceiro(double salario, int mesesTrabalhados) 
										throws MesesTrabalhadosInvalidoException, SalarioInvalidoException {
		
		//Validar se os meses trabalhados n�o est� entre 0 e 12
		if (mesesTrabalhados < 0 || mesesTrabalhados > 12) {
			//lan�ar uma exception
			throw new MesesTrabalhadosInvalidoException("Meses trabalhados inv�lido");
		}
		//Validar se o sal�rio � negativo
		if (salario < 0) {
			//lan�ar uma exception
			throw new SalarioInvalidoException("O sal�rio n�o pode ser negativo");
		} 
		
		
		return salario*mesesTrabalhados / 12;
	}
}
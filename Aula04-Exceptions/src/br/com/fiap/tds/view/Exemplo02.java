package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.exception.MesesTrabalhadosInvalidoException;
import br.com.fiap.tds.exception.SalarioInvalidoException;
import br.com.fiap.tds.service.SalarioService;

public class Exemplo02 {

	public static void main(String[] args) {
		
		//Instanciar uma SalarioService
		SalarioService service = new SalarioService();
		
		try {
			//Ler o sal�rio e os meses trabalhados
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio"));
			int meses = Integer.parseInt(JOptionPane.showInputDialog("Digite os meses trabalhados"));

			//Chamar o m�todo calcular sal�rio
			double decimoTerceiro = service.calcularDecimoTerceiro(salario, meses);
			JOptionPane.showMessageDialog(null, "D�cimo terceiro: " + decimoTerceiro);
			
		//Sempre as exceptions mais gen�ricas no final do catch:
		} catch (SalarioInvalidoException | NumberFormatException churros) {
			//Trata a exception de sal�rio inv�lido
			System.out.println("Sal�rio inv�lido ou n�mero inv�lido: " + churros.getMessage());
			
		} catch (MesesTrabalhadosInvalidoException e) {
			//Trata a exception de meses trabalhados
			System.out.println("Meses trabalhados inv�lido: " + e.getMessage());
			
		} catch (Exception e) {
			//Trata as demais exceptions
			System.out.println(e.getMessage());
		}
		
	}//main
}//class

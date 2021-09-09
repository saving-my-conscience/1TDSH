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
			//Ler o salário e os meses trabalhados
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
			int meses = Integer.parseInt(JOptionPane.showInputDialog("Digite os meses trabalhados"));

			//Chamar o método calcular salário
			double decimoTerceiro = service.calcularDecimoTerceiro(salario, meses);
			JOptionPane.showMessageDialog(null, "Décimo terceiro: " + decimoTerceiro);
			
		//Sempre as exceptions mais genéricas no final do catch:
		} catch (SalarioInvalidoException | NumberFormatException churros) {
			//Trata a exception de salário inválido
			System.out.println("Salário inválido ou número inválido: " + churros.getMessage());
			
		} catch (MesesTrabalhadosInvalidoException e) {
			//Trata a exception de meses trabalhados
			System.out.println("Meses trabalhados inválido: " + e.getMessage());
			
		} catch (Exception e) {
			//Trata as demais exceptions
			System.out.println(e.getMessage());
		}
		
	}//main
}//class

package br.com.fiap.tds.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.com.fiap.tds.factory.ConnectionFactory;

public class ExemploPesquisa {

	public static void main(String[] args) {
		
		try {
			Connection conexao = ConnectionFactory.getConnection();
			
			//Criar o Statement
			Statement comando = conexao.createStatement();

			//Executar a pesquisa no banco e recuperar o resultado
			ResultSet resultado = comando.executeQuery("select * from TB_PRODUTO");
			
			//Enquanto houver registros no resultado
			while (resultado.next()) {
				//Recuperar os dados das colunas
				int codigo = resultado.getInt("cd_produto");
				String nome = resultado.getString("nm_produto");
				double valor = resultado.getDouble("vl_produto");
				int qtd = resultado.getInt("qt_produto");
				String descricao = resultado.getString("ds_produto");
				
				System.out.println("Código: " + codigo + " Nome: " + nome + " Valor: " 
									+ valor + " Qtd: " + qtd + " Descrição: " + descricao);
			}
			
			//Fechar
			conexao.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}//main
	
}//class
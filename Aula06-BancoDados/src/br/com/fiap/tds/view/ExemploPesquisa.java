package br.com.fiap.tds.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploPesquisa {

	public static void main(String[] args) {
		
		try {
			//Obter uma conexão com o banco
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl","pf0392", "fiap");
			
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
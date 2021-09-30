package br.com.fiap.tds.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fiap.tds.factory.ConnectionFactory;

public class ExemploCadastro {

	public static void main(String[] args) {
		
		try {
			//Obter uma conexão com o banco de dados
			Connection conexao = ConnectionFactory.getConnection();					
		
			System.out.println("Obtendo a conexão com o banco...");
			
			//Criar o comando para inserir valores na tabela
			Statement comando = conexao.createStatement();
			//Executar o comando no banco
			comando.executeUpdate("INSERT INTO TB_PRODUTO (CD_PRODUTO, NM_PRODUTO, DS_PRODUTO,"
					+ " QT_PRODUTO, VL_PRODUTO) VALUES (3, 'Microfone Xiaomi', 'Microfone Top', 10, 100)");
			
			System.out.println("Produto registrado!");
			
			//Fechar a conexão com o banco
			conexao.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}//main
}//class

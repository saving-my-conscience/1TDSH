package br.com.fiap.tds.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por obter uma conexão com o banco de dados
 * @author Thiago Yamamoto
 *
 */
public class ConnectionFactory {
	
	/**
	 * Obtem uma conexão com o banco de dados oracle
	 * @return Connection conexão com o banco
	 * @throws ClassNotFoundException Não encontrou o driver do banco de dados
	 * @throws SQLException Não foi possível conectar com o banco
	 */
	//static -> o método será de classe e não de objeto, ou seja, não é preciso do objeto para utiliza-lo
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//Registrar o driver do banco de dados
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//Obter uma conexão com o banco de dados: (string de conexão, usuário, senha)
		Connection conexao = 
				DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl","pf0392", "fiap");
		
		return conexao;
	}
	
}
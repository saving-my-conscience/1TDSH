package br.com.fiap.tds.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe respons�vel por obter uma conex�o com o banco de dados
 * @author Thiago Yamamoto
 *
 */
public class ConnectionFactory {
	
	/**
	 * Obtem uma conex�o com o banco de dados oracle
	 * @return Connection conex�o com o banco
	 * @throws ClassNotFoundException N�o encontrou o driver do banco de dados
	 * @throws SQLException N�o foi poss�vel conectar com o banco
	 */
	//static -> o m�todo ser� de classe e n�o de objeto, ou seja, n�o � preciso do objeto para utiliza-lo
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//Registrar o driver do banco de dados
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//Obter uma conex�o com o banco de dados: (string de conex�o, usu�rio, senha)
		Connection conexao = 
				DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl","pf0392", "fiap");
		
		return conexao;
	}
	
}
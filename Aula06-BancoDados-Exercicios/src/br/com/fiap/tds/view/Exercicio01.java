package br.com.fiap.tds.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

import br.com.fiap.tds.dao.ProdutoDao;
import br.com.fiap.tds.factory.ConnectionFactory;

public class Exercicio01 {

	public static void main(String[] args) {
		
		try {
			//Criar o InputStream
			FileReader inputStream = new FileReader("alunos.csv");
			BufferedReader reader = new BufferedReader(inputStream);
			
			//Criar a conexão com o banco de dados
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl","pf0392", "fiap");
		
			Connection conexao = ConnectionFactory.getConnection();
			
			//Criar o Statement
			Statement stmt = conexao.createStatement();
			
			//Variável para armazenar cada linha do arquivo
			String linha;
			
			reader.readLine(); //Lê a primeira linha 
			
			//Laço de repetição para ler cada linha do arquivo
			while ((linha = reader.readLine()) != null) {
				//Separar as informações por ";"
				String[] valores = linha.split(";");
				//Inserir a linha do arquivo no banco de dados
				stmt.executeUpdate("INSERT INTO TB_ALUNO (nr_rm, nm_aluno, st_ativo, vl_nota1, vl_nota2) VALUES ("
						+ valores[0] + ",'" + valores[1] + "'," + (valores[2].equals("true")?1:0)
						+ "," + valores[3] + "," + valores[4] + ")");
			}
			System.out.println("Dados importados!");
			//Fechar
			inputStream.close();
			reader.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
	
}//class
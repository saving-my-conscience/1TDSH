package br.com.fiap.tds.view;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercicio02 {

	public static void main(String[] args) {
		try {
			//Criar o OutputStream
			FileWriter outupStream = new FileWriter("alunos-banco.csv");
			PrintWriter arquivo = new PrintWriter(outupStream);
			
			//Criar a conexão com o banco de dados
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl","pf0392", "fiap");
		
			//Criar o Statement
			Statement stmt = conexao.createStatement();	
			
			//Executar a pesquisa no banco de dados
			ResultSet result = stmt.executeQuery("select * from tb_aluno");
			
			//Imprimir a primeira linha
			arquivo.println("RM;Nome;Ativo;Nota1;Nota2");
			
			//Percorrer todos os registros encontrados no banco
			while (result.next()) {
				//Ler os dados
				int rm = result.getInt("nr_rm");
				String nome = result.getString("nm_aluno");
				boolean ativo = result.getBoolean("st_ativo");
				float nota1 = result.getFloat("vl_nota1");
				float nota2 = result.getFloat("vl_nota2");
				
				//Inserir os registros encontrados no arquivo
				arquivo.println(rm + ";" + nome + ";" + ativo + ";" + nota1 + ";" + nota2);	
				
			}
			
			System.out.println("Dados exportados!");
			
			//Fechar
			outupStream.close();
			arquivo.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main
	
}//class
package br.com.fiap.tds.bean;

public class Aluno {

	private String nome;
	
	private float[] notas;

	public Aluno() {}
	
	public Aluno(String nome, float[] notas) {
		this.nome = nome;
		this.notas = notas;
	}
	
	//Método que retorna a maior nota do aluno
	public float getMaiorNota() {
		//variável que armazena a maior nota
		float maior = notas[0];
		
		//laço para comparar as notas e verificar qual é a maior
		for (int i =1; i < notas.length; i++) {
			if (notas[i] > maior)
				maior = notas[i];
		}
		
		//retorna a maior nota encontrada
		return maior;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
}

package br.com.fiap.tds.exercicio02.bean;

public class Aluno {

	private String nome;
	
	private int idade;
	
	private float media;
	
	public Aluno() {}
	
	public Aluno(String nome, int idade, float media) {
		this.nome = nome;
		this.idade = idade;
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
	
}

package br.com.fiap.tds.bean;

public class Filme {

	private String titulo;
	
	private String autor;
	
	private int duracao;
	
	private String genero;

	public Filme() {}
	
	public Filme(String titulo, String autor, int duracao, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.duracao = duracao;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return titulo + " " + autor + " " + duracao + " " + genero;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
package br.com.projescola1.model;

public class Cidade {
	
	private int id;
	private String nome;
	private int qtdhabitantes;
	
	
	public Cidade() {
		
	}
	
	public Cidade(String nome) {
		this.nome=nome;
	}
public Cidade(int id) {
		this.id=id;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdhabitantes() {
		return qtdhabitantes;
	}
	public void setQtdhabitantes(int qtdhabitantes) {
		this.qtdhabitantes = qtdhabitantes;
	}
	
	
	

}

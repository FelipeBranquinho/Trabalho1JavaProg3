package jrf;

public class Aluno {
	private String nome;
	private int matricula;
	private String tipo;
	
	public Aluno(String nome, int matricula, String tipo){
		this.nome = nome;
		this.matricula = matricula;
		this.tipo = tipo;
	}
	
	@Override
	public String toString(){
		return matricula + ";" + nome;
	}
	
	public String getTipo(){
		return tipo;
	}
};

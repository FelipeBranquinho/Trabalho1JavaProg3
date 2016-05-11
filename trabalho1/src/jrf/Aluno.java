package jrf;

public class Aluno {
	private String nome;
	private int matricula;
	private String tipo;
	//private Map<String,Nota> nota;
	
	public Aluno(String nome, int matricula, String tipo){
		this.nome = nome;
		this.matricula = matricula;
		this.tipo = tipo;
		//this.nota = new HashMap<String,Nota>();
	}
	
	@Override
	public String toString(){
		return matricula + ";" + nome;
	}
	
	public String getTipoAluno(){
		return tipo;
	}
};

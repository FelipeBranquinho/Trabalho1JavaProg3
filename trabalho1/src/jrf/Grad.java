package jrf;

public class Grad extends Aluno{
	private int curso;
	
	public Grad(String nome, int matricula, String tipo, int curso){
		super(nome, matricula, tipo);
		this.curso = curso;
	}
	
	public int getCursoGrad(){
		return curso;
	}
};

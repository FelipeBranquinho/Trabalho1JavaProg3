package jrf;

public class PosGrad extends Aluno{
	private String curso;
	
	public PosGrad(String nome, int matricula, String tipo, String curso){
		super(nome, matricula, tipo);
		this.curso = curso;
	}
	
	public String getCursoPosGrad(){
		return curso;
	}
};
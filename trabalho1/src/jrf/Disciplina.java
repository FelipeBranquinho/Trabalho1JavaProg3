package jrf;
import java.util.*;

public class Disciplina {
	private String nome;
	private String codigo;
	private ArrayList<Grad> aluno;
	private ArrayList<PosGrad> posAluno;
	//private ArrayList<Exame> exame;
	
	public Disciplina(String nome, String codigo){
		this.nome = nome;
		this.codigo = codigo;
		this.aluno = new ArrayList<Grad>();
		this.posAluno = new ArrayList<PosGrad>();
	}
	
	public void addAlunoG(String nome, int matricula, String tipo, int curso){
		aluno.add(new Grad(nome, matricula, tipo, curso));
	}
	
	public void addAlunoP(String nome, int matricula, String tipo, String curso){
		posAluno.add(new PosGrad(nome, matricula, tipo, curso));
	}
	
	@Override
	public String toString(){
		return codigo + ";" + nome;
	}
};

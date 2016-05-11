package jrf;
import java.util.*;

public class Disciplina {
	private String nome;
	private String codigo;
	private Map<Integer,Aluno> aluno;
	private Map<String,Exame> exame;
	
	public Disciplina(String nome, String codigo){
		this.nome = nome;
		this.codigo = codigo;
		this.aluno = new HashMap<Integer,Aluno>();
		this.exame = new HashMap<String,Exame>();
	}
	
	public void addAluno(String nome, int matricula, String tipo, int curso){
		if(!aluno.containsValue(matricula))
			aluno.put(matricula, new Grad(nome, matricula, tipo, curso));
	}
	
	public void addAluno(String nome, int matricula, String tipo, String curso){
		if(!aluno.containsValue(matricula))
			aluno.put(matricula, new PosGrad(nome, matricula, tipo, curso));
	}
	
	public void addExame(String codigo, String nome, double peso, String tipo, Date data){
		if(!exame.containsValue(codigo))
			exame.put(codigo, new Exame(codigo, nome, peso, tipo, data)); //Trocar depois para polimorfismo
	}
	
	@Override
	public String toString(){
		return codigo + ";" + nome;
	}
	
	public String getCodigoDisciplina(){
		return codigo;
	}
};

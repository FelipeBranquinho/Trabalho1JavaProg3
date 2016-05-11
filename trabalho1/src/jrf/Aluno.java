package jrf;
import java.util.*;

public class Aluno {
	private String nome;
	private int matricula;
	private String tipo;
	private Map<String,Nota> nota;
	
	public Aluno(String nome, int matricula, String tipo){
		this.nome = nome;
		this.matricula = matricula;
		this.tipo = tipo;
		this.nota = new HashMap<String,Nota>();
	}
	
	public void addNota(String codigoEx, double nota){
		if(!this.nota.containsValue(codigoEx))
			this.nota.put(codigoEx, new Nota(nota, codigoEx));
	}
	
	public Nota getNotaExame(String codigoEx){
		return nota.get(codigoEx);
	}
	
	@Override
	public String toString(){
		return matricula + ";" + nome + ";";
	}
	
	public String getTipoAluno(){
		return tipo;
	}
	
	public String getAlunoNome(){
		return nome;
	}
	
	public static Comparator<Aluno> comparaAlunoNome = new Comparator<Aluno>(){
		public int compare(Aluno a1, Aluno a2){
			String nomeAluno1 = a1.getAlunoNome().toUpperCase();
			String nomeAluno2 = a2.getAlunoNome().toUpperCase();
			return nomeAluno1.compareTo(nomeAluno2);
		}
	};
};

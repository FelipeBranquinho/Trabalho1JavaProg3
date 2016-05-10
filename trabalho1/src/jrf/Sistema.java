package jrf;
import java.util.*;

public class Sistema {
	private Map<Integer,String> cursos;
	private ArrayList<Disciplina> disciplina;
	
	public Sistema(String nome, int codigo){
		this.cursos = new HashMap<Integer,String>();
		this.disciplina = new ArrayList<Disciplina>();
	}
	
	public void addCurso(String nome, int codigo){
		cursos.put(codigo, nome);
	}
	
	public String getCurso(int codigo){
		return cursos.get(codigo);
	}
	
	public void addDisciplina(String nome, String codigo){
		disciplina.add(new Disciplina(nome, codigo));
	}
	
	@Override
	public String toString(){
		return disciplina.toString();
	}
};

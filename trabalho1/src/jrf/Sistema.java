package jrf;
import java.util.*;

public class Sistema {
	private Map<Integer,String> cursos;
	private Map<String,Disciplina> disciplina;
	
	public Sistema(String nome, int codigo){
		this.cursos = new HashMap<Integer,String>();
		this.disciplina = new HashMap<String,Disciplina>();
	}
	
	public void addCurso(String nome, int codigo){
		cursos.put(codigo, nome);
	}
	
	public String getCodigoCurso(int codigo){
		return cursos.get(codigo);
	}
	
	public void addDisciplina(String nome, String codigo){
		if(!disciplina.containsValue(codigo))
			disciplina.put(codigo, new Disciplina(nome, codigo));
	}
	
	@Override
	public String toString(){
		return disciplina.toString();
	}
};

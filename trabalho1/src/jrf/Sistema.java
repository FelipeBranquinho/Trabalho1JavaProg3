package jrf;
import java.util.*;

public class Sistema {
	private Map<Integer,String> cursos;
	private Map<String,Disciplina> disciplina;
	
	public Sistema(){
		this.cursos = new HashMap<Integer,String>();
		this.disciplina = new HashMap<String,Disciplina>();
	}
	
	public void addCurso(String nomeCur, int codigoCur){
		cursos.put(codigoCur, nomeCur);
	}
	
	public String getCodigoCurso(int codigoCur){
		return cursos.get(codigoCur);
	}
	
	public void addDisciplina(String nomeDisc, String codigoDisc){
		if(!disciplina.containsValue(codigoDisc))
			disciplina.put(codigoDisc, new Disciplina(nomeDisc, codigoDisc));
	}
	
	@Override
	public String toString(){
		return disciplina.toString();
	}
};

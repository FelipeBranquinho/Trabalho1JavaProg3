package jrf;
import java.util.*;

public class Trabalho extends Exame{
	private int tamGrupo;
	private ArrayList<Integer> integrantes;
	
	public Trabalho(String codigo, String nome, double peso, String tipo, Date data, int tamGrupo){
		super(codigo, nome, peso, tipo, data);
		this.tamGrupo = tamGrupo;
		this.integrantes = new ArrayList<Integer>();
	}
	
	public void addIntegrante(int matriculaAluno){
		if(!integrantes.contains(matriculaAluno))
			integrantes.add(matriculaAluno);
	}
	
	public int getTamGrupo(){
		return tamGrupo;
	}
};
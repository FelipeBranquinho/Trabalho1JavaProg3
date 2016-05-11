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
	
	public void addAluno(String nomeAl, int matriculaAl, String tipoAl, int cursoAl){
		if(!aluno.containsValue(matriculaAl))
			aluno.put(matriculaAl, new Grad(nomeAl, matriculaAl, tipoAl, cursoAl));
	}
	
	public void addAluno(String nomeAl, int matriculaAl, String tipoAl, String cursoAl){
		if(!aluno.containsValue(matriculaAl))
			aluno.put(matriculaAl, new PosGrad(nomeAl, matriculaAl, tipoAl, cursoAl));
	}
	
	public void addExame(String codigoEx, String nomeEx, double pesoEx, String tipoEx, Date dataEx){
		if(!exame.containsValue(codigoEx))
			exame.put(codigoEx, new Exame(codigoEx, nomeEx, pesoEx, tipoEx, dataEx)); //Trocar depois para polimorfismo
	}
	
	public Aluno getAluno(int matriculaAl){
		return aluno.get(matriculaAl);
	}
	
	public Exame getExame(String codigoEx){
		return exame.get(codigoEx);
	}
	
	@Override
	public String toString(){
		return codigo + ";" + nome;
	}
	
	public String getCodigoDisciplina(){
		return codigo;
	}
	
	public void pautaFinal(){
		ArrayList<Aluno> listAluno = new ArrayList<Aluno>(aluno.values());
		Collections.sort(listAluno, Aluno.comparaAlunoNome);
		
		ArrayList<Exame> listExame = new ArrayList<Exame>(exame.values());
		Collections.sort(listExame, Exame.comparaExameData);
		
		for(Aluno itAluno : listAluno){
			itAluno.toString();
			double media = 0;
			for(Exame itExame : listExame){//Mudar esse for
				Nota n = itAluno.getNotaExame(itExame.getCodigoExame());
				if(n.getNota() != -1)
					n.toString();
				media += n.getNota();
			}
		}
	}
};
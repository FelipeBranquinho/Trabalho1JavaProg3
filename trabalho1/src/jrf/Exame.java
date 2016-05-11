package jrf;
import java.util.*;

public class Exame {
	private String codigo;
	private String nome;
	private double peso;
	private String tipo;
	private Date data;
	
	public Exame(String codigo, String nome, double peso, String tipo, Date data){
		this.codigo = codigo;
		this.nome = nome;
		this.peso = peso;
		this.tipo = tipo;
		this.data = data;
	}
	
	@Override
	public String toString(){
		return codigo + ";" + nome + ";" + data;
	}
	
	public String getCodigoExame(){
		return codigo;
	}
	
	public double getPesoExame(){
		return peso;
	}
	
	public String getTipoExame(){
		return tipo;
	}
	
	public Date getDataExame(){
		return data;
	}
	
	public static Comparator<Exame> comparaExameData = new Comparator<Exame>(){
		public int compare(Exame d1, Exame d2){
			Date nomeData1 = d1.getDataExame();
			Date nomeData2 = d2.getDataExame();
			return nomeData1.compareTo(nomeData2);
		}
	};
};
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
};
package jrf;

public class Nota {
	private double nota = -1;
	private String codigoEx;
	
	public Nota(double nota, String codigoEx){
		this.nota = nota;
		this.codigoEx = codigoEx;
	}
	
	public String getCodigoEx(){
		return codigoEx;
	}
	
	public double getNota(){
		return nota;
	}
	
	@Override
	public String toString(){
		return nota + ";";
	}
};
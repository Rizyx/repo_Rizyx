package br.com.orientacao_a_objetos;

public class Aluno {
	private String nomealuno = null;
	private String rgaluno = null;
	private String datanascaluno = null;
	private Turma turma;
	
	public String getNomealuno() {
		return nomealuno;
	}
	public void setNomealuno(String nomealuno) {
		this.nomealuno = nomealuno;
	}
	public String getRgaluno() {
		return rgaluno;
	}
	public void setRgaluno(String rgaluno) {
		this.rgaluno = rgaluno;
	}
	public String getDatanascaluno() {
		return datanascaluno;
	}
	public void setDatanascaluno(String datanascaluno) {
		this.datanascaluno = datanascaluno;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	
	
}

package br.com.listAluno;

import java.util.Objects;

//o objeto aluno deve implementar o comparable para fazer a comparação e realzar a ordenação
public class Aluno implements Comparable<Aluno> {
	@Override
	public int compareTo(Aluno aluno) {
		
		return this.nome.compareTo(aluno.getNome());
	}
	@Override
	public int hashCode() {
		return Objects.hash(curso, nome, nota, sala);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(curso, other.curso) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota)
				&& Objects.equals(sala, other.sala);
	}
	private String nome, curso, sala;
	private double nota;
	
	public Aluno(String nome, String curso, double nota) {
		this.curso = curso;
		this.nome = nome;
		this.nota = nota;
	}
	
	public Aluno(String nome, String curso, double nota, String sala) {
		this(nome, curso, nota);
		this.sala = sala;
	}
	
	
	@Override
	public String toString() {
		return this.nome ;
	} //To String converte cobjeto em texto , nesse caso apenas fiz a impressão dos 

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
}

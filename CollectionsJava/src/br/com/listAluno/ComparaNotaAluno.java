package br.com.listAluno;

import java.util.Comparator;

public class ComparaNotaAluno implements Comparator<Aluno>{

	@Override
	public int compare(Aluno o1, Aluno o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getNota(), o1.getNota()); //Vai da maior para o menor nota, através do nome 
	}

	

	
	
}

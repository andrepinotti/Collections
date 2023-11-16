package br.com.map;

import br.com.listAluno.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploAluno {

	public static void main(String[] args) {
		
		Map<Integer, List<Aluno>> listaSala = new HashMap<>();
		
		List<Aluno> AlunoSala1 = criarTurma("Sala 1" , 10); 
		listaSala.put(1,  AlunoSala1);
		
		List<Aluno> AlunoSala2 = criarTurma("Sala 2" , 20); 
		listaSala.put(2, AlunoSala2);
		
		imprimirTurma(listaSala.get(1));
		
	}
	
	public static List<Aluno> criarTurma(String sala, int count) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		for(int i=0; i<count ;i++) {
			Aluno aluno = new Aluno("Nome: "+i, "Curso: "+i, i, sala);
			alunos.add(aluno);
		}
		
		return alunos;
		
	}
	
	public static void imprimirTurma(List<Aluno> alunos) {
		
		for(Aluno aluno : alunos) {
			
			System.out.println(aluno.getNome() +" "+aluno.getSala());
			
		}
		
		System.out.println("");
		
	}
	
	
}

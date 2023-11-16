package br.com.set;

import java.util.HashSet;
import java.util.Set;

import br.com.listAluno.Aluno;

public class ExemploHashSetAluno {
	public static void main(String[] args) {
		
		Set<Aluno> aluno = new HashSet<>();
		
		Aluno a = new Aluno("AWS Cloud", "Abel", 8.9);
		Aluno b = new Aluno("PHP Avançado", "Pedro", 7.8);
		Aluno c = new Aluno("Back-End Java", "Luís", 10);
		
		Aluno d = new Aluno("PHP Avançado", "Pedro", 7.8);
		
		aluno.add(a);
		aluno.add(b);
		aluno.add(c);
		aluno.add(d);
		
		//Criei dois objetos iguais com o intuito de duplicar, ele não duplica se implementarmos o equals e o HashCode
		//Os respectivos métodos, equals e hashcode se aplicam quando precisamos distinguir, ordenar e comparar objetos. 
		
		System.out.println("HashSet do tipo Objeto: "+ aluno);
		
	}	
}

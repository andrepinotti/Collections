package br.com.listAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAluno {
	
	public static void main(String[] args) {
		listaOrdenadaComparable();
		listaSimplesOrdenadaExterna();
	}
	
	public static void listaSimplesOrdenadaExterna() {
		System.out.println("****** Lista Ordenada Classe Externa ******");
		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno("João Marilhano", "AWS Cloud", 0);
		Aluno b = new Aluno("Alex Teixeira", "Linux Báscio", 0);
		Aluno c = new Aluno("Lúcia Ferreira", "Curso Java", 0);
		Aluno d = new Aluno("Matheus Oliveira", "Blockchain", 0);
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		
	}
	
	public static void listaOrdenadaComparable() {
		System.out.println("****** Lista Ordenada Comparable ******");
		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno("João Marilhano", "AWS Cloud", 6.3);
		Aluno b = new Aluno("Alex Teixeira", "Linux Báscio", 5);
		Aluno c = new Aluno("Lúcia Ferreira", "Curso Java", 9.8);
		Aluno d = new Aluno("Matheus Oliveira", "Blockchain",7.0);
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		
		ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
		System.out.println(lista);
		Collections.sort(lista, comparaNotaAluno);
		System.out.println(lista);
	}
	
}

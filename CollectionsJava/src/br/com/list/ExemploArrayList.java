package br.com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
	public static void main(String[] args) {
		exemploListaSimples();
		exemploListaSimplesOrdemAscendente();
		exemploListaNumerica();
	}
	
	//Para declarar uma List precisamos colocar a interface 'List' <tipo List> 
	// E a implementação será uma ArrayList (new ArrayList<>())
	//Lado direito sempre declarar a interface e na esquerda a implementação
		
	private static void exemploListaSimples() {
		//Lista Simples 
		System.out.println("****** exemploListaSimples ******");
		List<String> lista = new ArrayList<String>();
		lista.add("João da Silva");
		lista.add("Antônio Sousa");
		lista.add("Lúcia Ferreira");
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println("");
	}
	
	private static void exemploListaSimplesOrdemAscendente() {
	
			System.out.println("******* exemploListaSimplesOrdemAscendente ******");
			List<String> lista = new ArrayList<>();
			lista.add("Robson Limenrin");
			lista.add("Paulo Souza");
			lista.add("Abel Ferreira");
			Collections.sort(lista);
			System.out.println(lista);
			System.out.println("");
	
	}
	
	private static void exemploListaNumerica() {
		
		System.out.println("****** exemploListNumerica ******");
		List<Integer> numeros = new ArrayList<>();
		numeros.add(99);
		numeros.add(25);
		numeros.add(13);
		numeros.add(1);
		numeros.add(5);
		Collections.sort(numeros);
		System.out.println(numeros);
		System.out.println("");
	}
	
}

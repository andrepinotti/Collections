package br.com.Implementações;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

	//Receber nomes por vírugula, dividir por meio do split
	//ordenar por ordem alfabética e imprimir no console 
	
	 
	public static void main(String[] args) {
		
		List<String> nomePessoas = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os nomes:\n"
				+ "1-Use somente espaço entre os nomes\n"
				+ "2-Nomes compostos usar ífen\n");
		String entrada = sc.nextLine();
		
		
		String nomes[] = entrada.split(" ");
		
		for(String nome : nomes) {
			nomePessoas.add(nome);
		}
		Collections.sort(nomePessoas);
		System.out.println("*****Nomes*****\n");
		
		System.out.println(nomePessoas);
		
		//por ForEach
		
		
		System.out.println("\n*****Com laço de repetição*****\n");
		for(String nome : nomePessoas) {
			
			System.out.println(nome);
			
		}
		
		
	}	
	
}

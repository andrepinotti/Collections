package br.com.Implementações;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> nomesMasculinos = new ArrayList<>();
		ArrayList<String> nomesFemininos = new ArrayList<>();
		
		
		while(true) {
			
			System.out.println("Digite o  Primeiro Nome e o Sexo da Pessoa (Digite 'sair' para finalizar): ");
			String entrada = sc.nextLine();
			
			if(entrada.equalsIgnoreCase("sair")) {
				System.out.println("Fim!");
				break;
			}
			
			//Entrada o que é: mensagem que entramos para ser quebrada pelo split
			//Ex: André Masculino o 'André Masculino' seria a entrada inteira. Após isso, a variável partes recebe o valor   
		
			
			String partes[] = entrada.split(" ");
			
			if(partes.length == 2) {
				String nome = partes[0];
				String sexo = partes[1].toLowerCase();
				
				
				if(sexo.equalsIgnoreCase("masculino")) {
					nomesMasculinos.add(nome);
				}
				else if(sexo.equalsIgnoreCase("feminino")){
					nomesFemininos.add(nome);
				}
				
				
				
			}
		
		}
		
		System.out.println("*****Nomes Masculinos*****");
		for(String nome : nomesMasculinos) {
			System.out.println(nome);
		}
		
		System.out.println("*****Nomes Femininos******");
		for(String nome : nomesFemininos) {
			System.out.println(nome);
		}
		
		
		sc.close();
		
	}
}

package br.com.set;

import java.util.Set;

import br.com.queue.Main;

public class LinkedHashSet {

	public static void main(String[] args) {
		
		
		Set<String> set = new java.util.LinkedHashSet<>();
		
		
		set.add("Brasil");
		set.add("Polônia");
		set.add("Rússia");
		set.add("Colômbia");
		set.add("Argentina");
		
		System.out.println(set.contains("Argentina")); //true
		System.out.println(set.contains("brasil")); // false
		
		
		System.out.println(set.size()); //tamanho do nosso collections hashset 
		System.out.println("*****LinkedHashSet*****");
		System.out.println(set);

		
	}
	
}

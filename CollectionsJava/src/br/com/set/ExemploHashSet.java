package br.com.set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		
		set.add("Brasil");
		set.add("Polônia");
		set.add("Rússia");
		set.add("Colômbia");
		set.add("Argentina");
		
		System.out.println(set.contains("Argentina")); //true
		System.out.println(set.contains("brasil")); // false
		
		
		System.out.println(set.size()); //tamanho do nosso collections hashset 
		System.out.println("*****HashSet*****");
		System.out.println(set);

	}


}	 

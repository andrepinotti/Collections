package br.com.performance;

import br.com.listAluno.*;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class PerformanceSets {

	public static void main(String[] args) {
	
		performanceHashset();
		performanceLinkedHashSet();
		performanceTreeSet();
	}
	
	
	public static void performanceHashset() {
				
		Random r = new Random();
		
		HashSet<String> hashset = new HashSet<>();
		
		
		
		//start time 
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<1000;i++) {
			int x = r.nextInt(1000-10)+10;
			hashset.add("teste de inserção com HashSet");
		}
	
		//endtime
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		
		System.out.println("Tempo HashSet: "+duration);
		
		
	}
	
	public static void performanceTreeSet() {
		
		Random r = new Random();
		
		TreeSet<String> treeset = new TreeSet<>();
		//start time 
		long startTime = System.currentTimeMillis();
							
		for(int i=0; i<1000;i++) {
			int x = r.nextInt(1000-10)+10;
			treeset.add("teste de inserção com HashSet");
			}
						
		//endtime
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
							
		System.out.println("Tempo TreeSet: "+duration);
	}
	
	public static void performanceLinkedHashSet() {
		
		Random r = new Random();
		
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<1000;i++) {
			int x = r.nextInt(1000-10)+10;
			linkedhashset.add("teste de inserção com HashSet");
			}
						
		//endtime
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
							
		System.out.println("Tempo LinkedHashSet: "+duration);
		
	}
	
	
	
	
}

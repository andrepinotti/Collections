package br.com.performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class performanceLists {

	public static void main(String[] args) {
		exemploAddArrayList();
		exemploAddLinkedList();
		exemploRemoveArrayList();
		exemploRemoveLinkedList();
	}
	
	public static void exemploAddArrayList() {
		
		 final int max = 20000;
		 long tInicio = System.currentTimeMillis();
	 
		 List<Integer> lista = new ArrayList<>();
		 for (int i = 0; i < max; i++) {
			 
			 lista.add(i);
			 
		 }
		
		 
		 for(int i = 0; i < max; i++) {
			 lista.contains(i);//Consulta
		 }
		 
		 long tFim = System.currentTimeMillis();
		 
		 System.out.println("Teste de inserção Array List: "+ (tFim - tInicio));
		 
	}
	
	public static void exemploAddLinkedList() {
		
		 final int max = 20000;
		 long tInicio = System.currentTimeMillis();
	 
		 List<Integer> lista = new LinkedList<>();
		 for (int i = 0; i < max; i++) {
			 
			 lista.add(i);
			 
		 }
		
		 
		 for(int i = 0; i < max; i++) {
			 lista.contains(i);//Consulta
		 }
		 
		 long tFim = System.currentTimeMillis();
		 
		 System.out.println("Teste de inserção Linked List: "+ (tFim - tInicio));
		 
	}
	
	public static void exemploRemoveArrayList() {
		
		final int max = 20000;
		long tInicio = System.currentTimeMillis();
		
		List<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i < max; i++) {
			 lista.add(i);
		 }
		
		
		for(int i = max-1; i>0 ;i--) {
			lista.remove(i);
		}
		
		long tFim = System.currentTimeMillis();
		
		System.out.println("Teste de remoção Array List: "+(tFim -tInicio));
		
	}
	
	public static void exemploRemoveLinkedList() {
		
		
		final int max = 20000;
		long tInicio = System.currentTimeMillis();
		
		List<Integer> lista = new LinkedList<>();
		
		for (int i = 0; i < max; i++) {
			 lista.add(i);
		 }
		
		for(int i = max-1; i>0 ;i--) {
			lista.remove(i);
		}
		
		long tFim = System.currentTimeMillis();
		
		System.out.println("Teste de remoção Linked List: "+(tFim - tInicio));
		
		
	}
	
	

	
}

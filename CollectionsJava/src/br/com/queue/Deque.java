package br.com.queue;

import java.util.ArrayDeque;

public class Deque {
	public static void main(String[] args) {
		
		ArrayDeque<String> deque = new ArrayDeque<String>();
		
		//Será baseado em atores
		
		deque.add("Brad Pitt");
		deque.add("Mel Gibson");
		deque.add("Silvester Stalone");
		deque.add("Paola Oliveira");
		deque.add("Monique Alfradique");
		deque.add("Lázaro Ramos");
		deque.add("Seann William Scott");
		deque.add("Mena Suvari");
		deque.add("Denzel Washington");
		
		
		//Iremos imprimir o primeiro elemento e o último elemento da deque  
		
		System.out.println("Primeiro elemento da Deque: "+deque.getFirst());
		System.out.println("Último elemento da Deque: "+deque.getLast());
		
		//Iremos realizar uma inserção no primeiro elemento
	
		deque.addFirst("Angelina Jolie");
		System.out.println("Primeiro elemento atual da Deque: "+deque.getFirst());
		
		System.out.println("*****Deque inicial*****");
		System.out.println(deque);
		
		//Remoção de dois elementos da deque
		deque.remove();
		deque.remove("Silvester Stalone");
		
		
		System.out.println("\n*****Deque após remover com remove*****");
		System.out.println(deque);
		
		//Remoção através do pop
				
		deque.pop();


		System.out.println("\n*****Deque após remover com pop*****");
		System.out.println(deque);
		
		//Remoção através do poll
		
		deque.poll();
		deque.pollFirst();
		deque.pollLast();
	
		System.out.println("\n*****Deque após remover com poll, pollFirst, pollLast*****");
		System.out.println(deque);
		
		deque.removeAll(deque);
		System.out.println("\n*****Deque após remover tudo*****");
		System.out.println(deque);
		}
}

package br.com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
		public static void main(String[] args) {
			//Irei fazer um Teste retornando algumas mensagens com Collection do tipo Fila
			
			//Array Deque é uma lista de estrutura de dados do tipo fila de duas extremidades, 
			//onde é possível adicionar e remover elementos de ambas as extremidades.
			
			//Priority Queue - modelo de estrutura de dados do tipo fila FIFO(first in first out), 
			//onde entra por um lado e sai por outro, como se fosse uma fila de banco.
			
			Queue<String> queue = new PriorityQueue<String>();
		
			queue.add("Homem-Aranha");
			queue.add("Flash");
			queue.add("Lanterna Verde");
			queue.add("Capitão América");
			queue.add("Adão Negro");
			
			System.out.println(queue.contains("Lanterna Verde")); //true
			System.out.println(queue.contains("Cavaleiro Lunar")); //false
			
			//Essa queue faz com que a ordenação seja por ordem alfabética (padrão do ide) 
			
			
			
			System.out.println("*****Elementos Removidos do Queue*****");
			while(queue.size() != 0) {
				System.out.println(queue.remove());
			}
			
			if(queue.size() == 0) {
				queue.add(":)");
			}
			
			System.out.println("Fim dos testes com Queue " + queue.element());
			
		}
}

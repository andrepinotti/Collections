package br.com.map;

import java.util.Map;

public class TreeMap {

	
	public static void main(String[] args) {
		
		pegandoChave();
		imprimindoTreeMap();
		imprimindoFor();
		imprimindoChaves();
		imprimindoChavesValues();
	}
	
	public static void pegandoChave() {
		
		Map<Integer, String> treemap = new java.util.TreeMap<>();
		
		//Adicionando valores ao nosso mapa
		
			treemap.put(1, "Anderson");
			treemap.put(2, "Ana Júlia");
			treemap.put(3, "Wagner");
			treemap.put(4, "Caio");
			treemap.put(77, "Rafaela");
		
		
		System.out.println("*****Pegando chave*****");
		
		System.out.println(treemap.get(3));
		
	}
	
	public static void imprimindoTreeMap() {
		
		//Vamos imprimir o treemap
		//Obs- o treeMap ja é ordenado naturalmente 
		
		Map<Integer, String> treemap = new java.util.TreeMap<>();
		
		//Adicionando valores ao nosso mapa
		
			treemap.put(1, "Anderson");
			treemap.put(2, "Ana Júlia");
			treemap.put(3, "Wagner");
			treemap.put(4, "Caio");
			treemap.put(77, "Rafaela");
		
		System.out.println("Imprimindo com values: "+treemap.values());
		
	}
	
	public static void imprimindoFor() {
		
		Map<Integer, String> treemap = new java.util.TreeMap<>();
		
		//Adicionando valores ao nosso mapa
		
			treemap.put(1, "Anderson");
			treemap.put(2, "Ana Júlia");
			treemap.put(3, "Wagner");
			treemap.put(4, "Caio");
			treemap.put(77, "Rafaela");
		
		
		System.out.println("\n*****Imprimindo com valores com for*****");
		for(String value : treemap.values()) {
			System.out.println(value);
		}
	}
	
	public static void imprimindoChaves(){
		
		Map<Integer, String> treemap = new java.util.TreeMap<>();
		
		//Adicionando valores ao nosso mapa
		
			treemap.put(1, "Anderson");
			treemap.put(2, "Ana Júlia");
			treemap.put(3, "Wagner");
			treemap.put(4, "Caio");
			treemap.put(77, "Rafaela");
		
		System.out.println("*****Imprimindo Chaves*****");
		
		for(Integer key : treemap.keySet()) {
			System.out.println(key);
		}
		
	}
	
	
	public static void imprimindoChavesValues() {
		
		Map<Integer, String> treemap = new java.util.TreeMap<>();
		
		//Adicionando valores ao nosso mapa
		
			treemap.put(1, "Anderson");
			treemap.put(2, "Ana Júlia");
			treemap.put(3, "Wagner");
			treemap.put(4, "Caio");
			treemap.put(77, "Rafaela");
		
		System.out.println("Chaves: "+treemap.keySet());
	}
	
}

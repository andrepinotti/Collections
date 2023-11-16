package br.com.map;

import java.util.Map;

public class LinkedHashMap {
	public static void main(String[] args) {
		
		impressaoLinkedHashMap();
		
	}
	
	public static void impressaoLinkedHashMap(){
		Map<Integer, String> linkedHashMap = new java.util.LinkedHashMap<>();
		
		
		linkedHashMap.put(1, "Anderson");
		linkedHashMap.put(77, "Rafaela");
		linkedHashMap.put(232, "Paulo");
		linkedHashMap.put(3, "Wagner");
		linkedHashMap.put(2, "Ana Júlia");
		linkedHashMap.put(4, "Caio");
		
		//A impressão é feita peça ordem de inserção, o LinkedHashMap não é ordenado naturalmente pela chave
		System.out.println(linkedHashMap);
		
		
	}
	
}

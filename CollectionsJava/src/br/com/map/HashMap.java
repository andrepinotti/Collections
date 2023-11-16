package br.com.map;

import java.util.Map;

public class HashMap {
	
	public static void main(String[] args) {
		
		MapaSimples();
		impressaoPorValorMapa();
	}
	
	public static void MapaSimples(){
		
		//Iremos fazer um tipo de mapa simples que guarda dois tipos de valroes
		Map<Integer, String> map = new java.util.HashMap<>();
		
		//Adicionando valores ao nosso mapa
		
		map.put(1, "Anderson");
		map.put(2, "Ana Júlia");
		map.put(3, "Wagner");
		map.put(4, "Caio");
		map.put(77, "Rafaela");
		
		System.out.println("*****Mapa Simples***** \n"+map);
		
	}
	
	public static void impressaoPorValorMapa() {
		//Iremos pegar o exemplo do método anterior, mas a impressão será feita de acordo com
		//seu respectivo valor 
		
		
		Map<Integer, String> map = new java.util.HashMap<>();
		
		//Adicionando valores ao nosso mapa
		
		map.put(1, "Anderson");
		map.put(2, "Ana Júlia");
		map.put(3, "Wagner");
		map.put(4, "Caio");
		map.put(77, "Rafaela");
		
		System.out.println("*****Valores do Mapa***** \n");
		//Primeira forma: Imprimir o método values
		//values retorna uma collection com o valor de string
		System.out.println(map.values()+"\n");		
		//Segunda forma: Colocar um laço de repetição do tipo do String(que guarda o valor da posição do mapa 
		for(String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("******Chaves do Mapa******");
		System.out.println(map.keySet());
		
		for(Integer value : map.keySet()) {
			System.out.println(value);
		}
		
				
		
	}
}

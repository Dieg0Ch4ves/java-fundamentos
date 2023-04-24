package ArrayELinkedListPratica;

import java.util.LinkedList;

public class LinkedListCarros {
	
	public static void main(String[] args) {
		
		/*
		addFirst()
		addLast()
		removeFirst()
		removeLast()
		getFirst()
		getLast() 
		*/
		
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println(cars);
		
		//Incluindo Mazda no início
		cars.addFirst("Mazda");
		System.out.println(cars);
		
		//Incluindo Bugatti no fim
		cars.addLast("Bugatti");
		System.out.println(cars);
		
		//Remover o Primeiro
		cars.removeFirst();
		System.out.println(cars);
		
		//Remover o ultimo
		cars.removeLast();
		System.out.println(cars);
		
		
		//Pegar o primeiro
		System.out.println(cars.getFirst());
		
		//Pegar o ultimo 
		System.out.println(cars.getLast());
		
		cars.clear();
		if(cars.isEmpty()) {
			System.out.println("LinkedList está vazia !");
		}
	}
}

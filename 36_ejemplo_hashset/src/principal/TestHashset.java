package principal;

import java.util.HashSet;

public class TestHashset {

	public static void main(String[] args) {
		// Creamos un objeto de tipo coleccion hashset
		HashSet<Integer> nums=new HashSet<>();
		
		//y añadimos datos a la colección
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(400);
		nums.add(500);
		nums.add(600);
		nums.add(600); //este no lo añade, porque no admite repetidos
		
		//quitamos dato
		nums.remove(400);
		
		//recorremos la colección
		for(Integer n:nums) {
			System.out.println(n);
		}

	}

}

package principal;

public class UsoArray {

	public static void main(String[] args) {
		// Array

		//declaramos el array
		int[] nums;
		//instanciamos el array
		nums = new int[4];
		
		//declaramos variable e instanciamos a la vez
		int [] nums2 = new int [4];
		
		//rellenamos el array;
		nums [0]=30;
		nums [1]=4;
		nums [2]=12;
		nums [3]=30;
		
		//mostrar contenido de la posición 2
		System.out.println(nums[2]);
		
		System.out.println("---");
		
		//recorrer todo el array con for
		for(int i=0;i<=3;i++) {
			System.out.println(nums[i]);
			
		}
		
		System.out.println("---");
		// con el total de valores del array: nums.leght
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
			
		}
		
	}

}

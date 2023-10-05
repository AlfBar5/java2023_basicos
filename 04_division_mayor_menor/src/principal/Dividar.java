package principal;

public class Dividar {

	public static void main(String[] args) {
		
		int a=300, b=10;
		//mostrar resultado de dividir el mayor entre el menor
		if(a>b) {
			System.out.println("La división de: "+a+" entre "+b+"= ");
			System.out.println(a/b);
		}else {
			System.out.println("La división de: "+b+" entre "+a+"= ");
			System.out.println(b/a);
			
			
		}
		
		//OPERADOR TERNARIO
		int r=a>b?a/b:b/a;
		System.out.println("La división es: "+r);

	}

}

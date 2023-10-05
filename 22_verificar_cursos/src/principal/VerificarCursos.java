package principal;

public class VerificarCursos {

	public static void main(String[] args) {

		//Hacer un programa para saber cuantos cursos tienen que ver con java
		String cursos="Ofimática,Java básico,Java EE,Spring Boot,Angular,Programación avanzada en Java";
		
		//un objeto llama a un método tolowercase y luego llamo a otro método split
		String [] nombres = cursos.toLowerCase().split(",");
		int contador=0;
		
		//recorrer array foreach de strings no necesitamos la posición i
		for (String n:nombres) {
			if(n.contains("java")) {
				contador++;
			}
			
		}
		
		System.err.println("Cursos de Java: "+contador);
		
	}

}

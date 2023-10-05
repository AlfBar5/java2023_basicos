package principal;

public class CalculosNotas {

	public static void main(String[] args) {
		// envolver tipos primitivos

		String notas="4.5,2.7,8.9,5.1,3.4,9.0,6.7,7.2";
		
			
		//hacer un programa que calcule:
		//nota media
		//nota más alta
		//nota más baja
		//total de aprobados
		
		//Convertimos el string en un array de 4 posiciones y metemos cada día en una posición
		
		
		// convertir a array de strings
		String [] valores = notas.split(",");
						
		int numeronotas = valores.length;
		
		System.out.println("-------");
		System.out.println("El número de notas es: "+numeronotas );
		
		
		double media = 0.0;
		double notamaxima = Double.parseDouble(valores[0]);
		double notaminima = Double.parseDouble(valores[0]);
		int totalaprobados=0;
		
		//recorremos el array de strings con un foreach
		for (String s:valores) {
			//convertimos los string al tipo primitivo int para poder hacer operaciones matemáticas
			//sumamos todos los números ya convertidos a double
			// s es el valor que vamos recorriendo, cada vez una nota del array
			//guardamos en variable nota todas las conversiones (por limpieza de código)
			double nota = Double.parseDouble(s);
			
			media+=nota;
			
				if(nota > 5) {
					totalaprobados++;
				}
			
				if(nota > notamaxima) {
					notamaxima=nota;
				}
				
				if(nota < notaminima) {
					notaminima=nota;
				}
			
			
			}
		
		//System.out.println("La media es: "+media / valores.length);
		//formatear los decimales para que solo muestren dos cifras
		System.out.println("La media es: "+String.format("%.2f", media / valores.length));
		
		System.out.println("El total de aprobados es: "+totalaprobados);
		System.out.println("La nota máxima es: "+notamaxima);
		System.out.println("La nota mínima es: "+notaminima);
		
		
		
	}

}

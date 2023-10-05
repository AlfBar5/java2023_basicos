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
		
				
		
		//llamamos a los métodos o funciones
		
		//System.out.println("La media es: "+media / valores.length);
		//formatear los decimales para que solo muestren dos cifras
		System.out.println("La media es: "+String.format("%.2f", media(valores)));
				
		System.out.println("El total de aprobados es: "+aprobados(valores));
		System.out.println("La nota máxima es: "+mayor(valores));
		System.out.println("La nota mínima es: "+menor(valores));
		
		
	}
	
	
	
	
	
	//método o función para realizar la media. Como parámetro le pasamos el array de string
	//si el main es static, este método tiene que ser static
	static double media(String[] datos) {
		//variable para retornar
		double media=0;
					
		for (String n:datos) {
			//convertimos los string al tipo primitivo int para poder hacer operaciones matemáticas
			//sumamos todos los números ya convertidos a double
			// s es el valor que vamos recorriendo, cada vez una nota del array
			//guardamos en variable nota todas las conversiones (por limpieza de código)
			double nota = Double.parseDouble(n);
			
			media+=nota;		
		
		}
		
		
		return media/datos.length;
	
	
	

	}
	
	
	
	
	
	//método o función para ver el número de aprobados
	static int aprobados(String[] datos) {
		//variable para retornar
		int total=0;
		
		for (String n:datos) {
			if(Double.parseDouble(n)>=5) {
				total++;
			}
		}
		
		return total;
		
	}
	
	
	//método o función para ver la nota mayor
	static double mayor(String[] datos) {
		
		double m=Double.parseDouble(datos[0]);
		
		for(String s:datos) {
			if(Double.parseDouble(s)>m) {
				m=Double.parseDouble(s);				
			};
			
		}
		
		return m;
		
		
	}
	
	
	
	//método o función para ver la nota mayor
	static double menor(String[] datos) {
		double m=Double.parseDouble(datos[0]);
		
		for(String s:datos) {
			if(Double.parseDouble(s)<m) {
				m=Double.parseDouble(s);				
			};
			
		}
		
		return m;
		
		
	}
	
	
	
	
	
}

package principal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; //Sale también util.sql
import java.util.Locale;

public class Test1 {

	public static void main(String[] args) {
		// Hoy
		Date d1 = new Date();
		
		//Tiempo absoluto (lo último en la ele "l" de número long)
		Date d2 = new Date(233478907884l);
		
		//COMPARAMOS FECHAS con los métodos after o before. Devuelve true o false
		// si d1 en anterior que d2
		if(d1.before(d2)) {
			System.out.println("Fech más antigua: "+d1);
			System.out.println("Fech más moderna: "+d2);
		}else {
			System.out.println("Fecha más antigua: "+d2);
			System.out.println("Fecha más moderna: "+d1);
		}
		
		
		//Formateo de fechas:
		SimpleDateFormat fechaformateada = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(fechaformateada.format(d1));
		System.out.println(fechaformateada.format(d2));
		
		//Formateado con localización por defecto y formato largo de fecha
		//Esta clase no tiene constructor, no se puede usar "new". Patrón singleton
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
		System.out.println(df.format(d1));
		System.out.println(df.format(d2));
		
		
		//Parseado de fechas
		//leer una fecha que está en formato cadena y lo quieres convertir en Date
		String fechacadena = "30-05-2022";
		//hay que meter la cadena en un SimpleDateFormat que tenga ese patrón
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		//llamar al método parse. Como esto puede fallar, Java te obliga a poner un try catch
		try {
			Date d3 = sdf.parse(fechacadena);
			////sin formateo
			//System.out.println(d));
			//fecha Formateada con el df de arriba
			System.out.println(df.format(d3));
			
		} catch (ParseException e) {
			// Dejar el volcado de error para verlo
			e.printStackTrace();
			System.out.println("cadena de fecha no válida");
		}
		System.out.println();
		

		
		
		
		
		
		
		
		
		
	}

}

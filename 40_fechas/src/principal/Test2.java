package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fecha hoy:
		LocalDate f1=LocalDate.now();
		System.out.println("La fecha de hoy es: "+f1);
		
		//Fecha concreta (con 08 y 09 da error porque los toma como octal, hay que quitar el 0
		LocalDate ld1=LocalDate.of(2022,8,06);
		System.out.println("La fecha invent es: "+ld1);
		
		//Fecha concreta b2 (con 08 y 09 da error porque los toma como octal, hay que quitar el 0
		LocalDate ld2=LocalDate.of(2021,8,06);
		System.out.println("La fecha invent 2 es: "+ld2);
		
		
		//Comparar fechas. Las saca en formato ISO Standar
		if(ld1.isBefore(ld2)) {
			System.out.println("La más antigua es: "+ld1);
			System.out.println("La más reciente es: "+ld2);
		}else {
			System.out.println("La más antigua es: "+ld2);
			System.out.println("La más reciente es: "+ld1);
		}
		
		
		//Formatear fechas: DateTimeFormatter. hay que darle el patron
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Fecha formateada 1 a: "+ld1.format(dtf));
		System.out.println("Fecha formateada 2 a: "+ld2.format(dtf));
		
		
		//Parsear, dada una cadena string, pasarla a fecha LocalDate
		String cadenafec ="30/07/2023";
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaformateada= LocalDate.parse(cadenafec, dtf2);
		System.out.println("String parseado y pasado a fecha ISO standar: "+fechaformateada);
		
		
		//obtener valores individuales de la fecha
		LocalDate ld3=LocalDate.of(2022,8,06);
		System.out.println("Año: "+ld3.getYear());
		System.out.println("Mes: "+ld3.getMonthValue());
		System.out.println("Día: "+ld3.getDayOfMonth());
		
		
		//Obtener fechas posteriores y anteriores. El objeto es inmutable: 2022,8,06
		System.out.println("Sumamos 6 meses: "+ld3.plusMonths(6));
		System.out.println("Restamos 3 meses: "+ld3.minusMonths(3));
		
		
	}

}

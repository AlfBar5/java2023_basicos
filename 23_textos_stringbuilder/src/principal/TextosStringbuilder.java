package principal;

public class TextosStringbuilder {

	public static void main(String[] args) {
		
		String productos="Detergente,Vino,Pan,Agua,Leche,Harina,Mantequilla,Arroz";
		
		// hay que crea una nueva cadena de caracteres que contengan los productos que empiezan por a
		
		// creamos un array con cada uno de los productos en posiciones
		String[] datos = productos.split(",");
		
		//Aquí iremos añadiendo los productos que cumplen la condición
		StringBuilder resultado=new StringBuilder();
		
		//recorrer array foreach de strings no necesitamos la posición i
				for (String p:datos) {
					//comprobamos si los productos empiezan por a
					if(p.startsWith("A")) {
						//si empiezan por a modificamos el objeto string original
						resultado.append(p);
						resultado.append(",");

					}
					
				}
		
				//quitamos la , con delete(resultado.length()-1, resultado.length() -----que es -- delete(3,4)
				System.out.println(resultado.delete(resultado.length()-1, resultado.length()));
	}

}


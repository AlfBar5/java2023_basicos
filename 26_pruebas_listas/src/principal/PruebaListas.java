package principal;

//
import java.util.ArrayList;

public class PruebaListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hay que importar CTROL+MAY+O
		
		//Colección de string
		ArrayList<String> dias= new ArrayList<>();
		
		////Colección de string -- otra forma de declararlo
		//var otra= new ArrayList<String>();
		
		dias.add("Lunes");
		dias.add("Martes");
		dias.add(1,"Miercoles");
		
		System.out.println("Tamaño de la colección: "+dias.size());
		System.out.println("Posición dos: "+dias.get(2));
		
		dias.remove(0);
		System.out.println("Posición dos: "+dias.get(2));
		
	}

}

package model;

import java.time.LocalDate;

public record Pedido(String producto, LocalDate fechaPedido, double precio) {

	//solo con esto ya tenemos un javabean
	//El record simplifica este tipo de clases 
}

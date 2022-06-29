package n1Exercici1;

import java.util.ArrayList;

public class n1Exercici1 {

	public static void main(String[] args) {

		Venda venda1 = new Venda();
		
		venda1.calcularTotal(venda1.getProductes());
		System.out.println(venda1);
		
		venda1.getProductes().add(new Producte("Arròs", 1.7));
		venda1.getProductes().add(new Producte("Pa", 2.5));
		venda1.getProductes().add(new Producte("Suc", 3));
	
		
		System.out.println();
		venda1.calcularTotal(venda1.getProductes());
		System.out.println(venda1);

	}
	

}

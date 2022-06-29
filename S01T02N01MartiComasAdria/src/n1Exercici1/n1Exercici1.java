package n1Exercici1;

import java.util.ArrayList;

public class n1Exercici1 {

	public static void main(String[] args) {
		ArrayList<Producte> productes = new ArrayList<Producte>();
		
//		productes.add(new Producte("Arròs", 1.7));
//		productes.add(new Producte("Pa", 2.5));
//		productes.add(new Producte("Suc", 3));
		
		Venda venda1 = new Venda(productes);
		
		venda1.calcularTotal();

	}

}

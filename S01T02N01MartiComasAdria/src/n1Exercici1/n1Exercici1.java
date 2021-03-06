package n1Exercici1;

public class n1Exercici1 {

	public static void main(String[] args) {

		Venda venda1 = new Venda();

		// Excepció personalitzada VendaBuidaException
		venda1.calcularTotal(venda1.getProductes());
		System.out.println(venda1);

		venda1.getProductes().add(new Producte("Arròs", 1.7));
		venda1.getProductes().add(new Producte("Pa", 2.5));
		venda1.getProductes().add(new Producte("Suc", 3));

		// Metode funciona correctament
		System.out.println();
		venda1.calcularTotal(venda1.getProductes());
		System.out.println(venda1);

		// ArrayIndexOutOfBoundsException
		System.out.println();
		try {
			venda1.getProductes().get(3);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error! La posició buscada no existeix");

		}

	}

}

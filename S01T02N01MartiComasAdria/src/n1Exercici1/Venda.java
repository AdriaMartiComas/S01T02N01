package n1Exercici1;

import java.util.ArrayList;

public class Venda {
	private ArrayList<Producte> productes;
	private double preuTotal;
	
	public Venda() {
		this.productes = new ArrayList<Producte>();
	}

	public ArrayList<Producte> getProductes() {
		return productes;
	}

	public void setProductes(ArrayList<Producte> productes) {
		this.productes = productes;
	}

	public double getPreuTotal() {
		return preuTotal;
	}

	public void setPreuTotal(float preuTotal) {
		this.preuTotal = preuTotal;
	}

	@Override
	public String toString() {
		return "Venda [productes=" + productes + "\npreuTotal=" + preuTotal + "]";
	}
	
	public void calcularTotal(ArrayList<Producte> productes) {
		int size = productes.size();
		double total = 0;
		
		try {
		
			if (size == 0) {
				throw new VendaBuidaException();
			} else {
				for (int i = 0; i<size; i++) {
					total = total + productes.get(i).getPreu();
				}
			}
		} catch (VendaBuidaException vbe){
			System.out.println(vbe.getMessage());
		}
		
		this.preuTotal = total;

	}

}

package n1Exercici1;

import java.util.ArrayList;

public class Venda {
	private ArrayList<Producte> productes;
	private float preuTotal;
	
	public Venda(ArrayList<Producte> productes) {
		this.productes = new ArrayList<Producte>();
	}

	public ArrayList<Producte> getProductes() {
		return productes;
	}

	public void setProductes(ArrayList<Producte> productes) {
		this.productes = productes;
	}

	public float getPreuTotal() {
		return preuTotal;
	}

	public void setPreuTotal(float preuTotal) {
		this.preuTotal = preuTotal;
	}

	@Override
	public String toString() {
		return "Venda [productes=" + productes + ", preuTotal=" + preuTotal + "]";
	}
	
	public void calcularTotal() {
		System.out.println("Comença a funcionar");
	}
	
	

	
	

}

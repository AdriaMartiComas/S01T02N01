package n1Exercici1;

public class Producte {
	private String nom;
	private double preu;
	
	public Producte(String nom, double preu) {
		this.nom = nom;
		this.preu = preu;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Producte [nom=" + nom + ", preu=" + preu + "]";
	}

}

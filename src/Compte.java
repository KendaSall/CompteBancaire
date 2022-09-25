public class Compte {
	protected int numero;
	protected String nomTitulaire;
	protected double solde;
	
	public Compte(int numero, String nomTitulaire, double solde) {
		this.numero = numero;
		this.nomTitulaire = nomTitulaire;
		this.solde = solde;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomTitulaire() {
		return nomTitulaire;
	}

	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
	public double deposerArgent(double somme) {
		return this.solde + somme;
	}
	
	public double retirerArgent(double somme) {
		return this.solde - somme;
	}
	
	public double consulterArgent() {
		return this.solde;
	}
	
}
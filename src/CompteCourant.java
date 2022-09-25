
public class CompteCourant extends Compte {
	
	protected double decouvertAutorise = -5000.00;
	
	public CompteCourant(int numero, String nomTitulaire, double solde) {
		super(numero, nomTitulaire, solde);
		
	}

	public void retraitAutorise() {
		
	}
	
	
}

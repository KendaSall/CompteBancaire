
public class CompteEpargne extends Compte {
	
	protected double taux = 0.17;
	
	public CompteEpargne(int numero, String nomTitulaire, double solde) {
		super(numero, nomTitulaire, solde);
		
	}
	
	public double calculInteret( double taux) {
		solde = solde + taux;
		return solde;
	}
}

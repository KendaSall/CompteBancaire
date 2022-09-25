
public class TestCompte {

	public static void main(String[] args) {
		Compte monCompte = new Compte(011, "Moussa", 150000.00);
		System.out.println(monCompte.consulterArgent()); 
		System.out.println(monCompte.deposerArgent(50000.00)); 
		System.out.println(monCompte.retirerArgent(20000.00)); 
	}

}

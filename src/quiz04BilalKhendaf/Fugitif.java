package quiz04BilalKhendaf;

public class Fugitif implements IEtatPrisonnier {

	@Override
	public void enCavalle(Prisonnier p) {
		// TODO Auto-generated method stub
		System.out.println("Le prisonnier " + p.nom + ", " + p.nom + "est déjà en cavalle.");
	}

	@Override
	public void emprisonner(Prisonnier p) {
		// TODO Auto-generated method stub
		p.etat = new EnPrison();
	}

}

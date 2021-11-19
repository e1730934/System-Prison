package quiz04BilalKhendaf;

public class Fugitif implements IEtatPrisonnier {

	@Override
	public void enCavalle(Prisonnier p) {
		// TODO Auto-generated method stub
		System.out.println("Le prisonnier " + p.nom + ", " + p.prenom + " est déjà en cavalle.");
	}

	@Override
	public void emprisonner(Prisonnier p) {
		// TODO Auto-generated method stub
		p.etat = new EnPrison();
		p.message =("Le prisonnier " + p.nom + ", " + p.prenom + " a bien été emprisonner");
		p.NotifyAll();
	}

}

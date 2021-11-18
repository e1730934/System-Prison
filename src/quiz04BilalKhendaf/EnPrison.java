package quiz04BilalKhendaf;

public class EnPrison implements IEtatPrisonnier {

	@Override
	public void enCavalle(Prisonnier p) {
		// TODO Auto-generated method stub
		p.etat = new Fugitif();
		p.message = "Le prisonnier " + p.nom + ", " + p.nom + "est en cavalle." + "Sa dernière position connue est: " + p.position;
		p.NotifyAll();

	}

	@Override
	public void emprisonner(Prisonnier p) {
		// TODO Auto-generated method stub
		System.out.println("Le prisonnier " + p.nom + ", " + p.nom + "est déjà en prison.");
	}

}

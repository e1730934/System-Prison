package quiz04BilalKhendaf;

import java.io.IOException;

public class Fugitif implements IEtatPrisonnier {

	@Override
	public void enCavalle(Prisonnier p) {
		// TODO Auto-generated method stub
		System.out.println("Le prisonnier " + p.nom + ", " + p.prenom + " de l'�tablissement " + p.etablissementDetention.nomEtablissement + " est d�j� en cavalle.");
	}

	@Override
	public void emprisonner(Prisonnier p) throws IOException {
		// TODO Auto-generated method stub
		p.etat = new EnPrison();
		p.message =("Le prisonnier " + p.nom + ", " + p.prenom + " a bien �t� emprisonner.");
		p.NotifyAll();
	}



}

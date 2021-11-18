package quiz04BilalKhendaf;

import java.util.ArrayList;

public class Prisonnier implements IObservable {
	ArrayList<Observateur> observers;
	Coordonnee position;
	IEtatPrisonnier etat;
	String message, nom, prenom;
	Etablissement etablissementDetention;
	
	@Override
	public void inscrire(Observateur o) {
		// TODO Auto-generated method stub
		this.observers.add(o);
	}

	@Override
	public void desinscrire(Observateur o) {
		// TODO Auto-generated method stub
		for(Observateur x:this.observers)
			if(x.equals(o))
				this.observers.remove(o);
	}

	@Override
	public void NotifyAll() {
		// TODO Auto-generated method stub
		for(Observateur x:this.observers) {
			x.notifyMe(this.message);
		}
	}
	void enCavalle() {
		this.etat.enCavalle(this);
	}
	
	void emprisonner() {
		this.etat.emprisonner(this);
	}
	
	void nouvellePosition(Coordonnee nouveauP) {
		float boundX = this.etablissementDetention.position.x + this.etablissementDetention.largeur;
		float boundY = this.etablissementDetention.position.y + this.etablissementDetention.longeur;
//		CoordonneeDeuxDimension bound = new CoordonneeDeuxDimension(boundX,boundY);
		boolean conditionUn = (nouveauP.x >= boundX || nouveauP.x <= this.etablissementDetention.position.x);
		boolean conditionDeux = (nouveauP.y >= boundY || nouveauP.y <= this.etablissementDetention.position.y);
		if(conditionUn || conditionDeux) {
//			this.message= "Alerte! Le prisonnier " + this.nom + this.prenom ;
			enCavalle();
		}
	}

}

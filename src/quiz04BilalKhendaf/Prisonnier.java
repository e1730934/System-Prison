package quiz04BilalKhendaf;

import java.io.IOException;
import java.util.ArrayList;

public class Prisonnier implements IObservable {
	ArrayList<Observateur> observers;
	ICoordonnee position;
	IEtatPrisonnier etat;
	String message, nom, prenom;
	Etablissement etablissementDetention;
	Log logPosition;
	
	
	
	public Prisonnier(ICoordonnee position, String nom, String prenom, Etablissement etablissementDetention, Log logPosition) {
		super();
		this.observers = new ArrayList<>();
		this.position = position;
		this.etat = new EnPrison();
		this.message = "";
		this.nom = nom;
		this.prenom = prenom;
		this.etablissementDetention = etablissementDetention;
		this.logPosition = logPosition;
	}

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
	
	void changementPosition(ICoordonnee nouveauP) throws IOException {
		boolean conditionUn = (nouveauP.x >= this.etablissementDetention.boundX || nouveauP.x <= this.etablissementDetention.position.x);
		boolean conditionDeux = (nouveauP.y >= this.etablissementDetention.boundY || nouveauP.y <= this.etablissementDetention.position.y);
		this.position = nouveauP;
		if(conditionUn || conditionDeux) {
			this.logPosition.writeFile(("Prisonnier_" + this.nom+"_"+this.prenom),position.toString());
			enCavalle();
		}
		else {
			emprisonner();
		}
	}

}

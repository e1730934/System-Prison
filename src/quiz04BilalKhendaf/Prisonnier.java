package quiz04BilalKhendaf;

import java.util.ArrayList;

public class Prisonnier implements IObservable {
	ArrayList<Observateur> observers;
	Position emplacement;
	IEtatPrisonnier etat;
	String message, nom;
	
	
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

}

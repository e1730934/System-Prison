package quiz04BilalKhendaf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Prisonnier implements IObservable {
    ArrayList<Observateur> observers;
    ICoordonnee position;
    IEtatPrisonnier etat;
    String message, nom, prenom;
    Etablissement etablissementDetention;


    public Prisonnier(ICoordonnee position, String nom, String prenom, Etablissement etablissementDetention) {
        super();
        this.observers = new ArrayList<>();
        this.position = position;
        this.etat = new EnPrison();
        this.message = "";
        this.nom = nom;
        this.prenom = prenom;
        this.etablissementDetention = etablissementDetention;
    }

    @Override
    public void inscrire(Observateur o) {
        // TODO Auto-generated method stub
        this.observers.add(o);
    }

    @Override
    public void desinscrire(Observateur o) {
        // TODO Auto-generated method stub

//		for(Observateur x:this.observers)
//			if(x.equals(o))
//				this.observers.remove(o);
        List<Observateur> aEnlever = new ArrayList<>();
        for (Observateur x : this.observers)
            if (x.equals(o))
                aEnlever.add(x);
        this.observers.removeAll(aEnlever);
    }


    @Override
    public void NotifyAll() throws IOException {
        // TODO Auto-generated method stub
        for (Observateur x : this.observers) {
            x.notifyMe(this.message);
        }
    }

    void enCavalle() throws IOException {
        this.etat.enCavalle(this);
    }

    void emprisonner() throws IOException {
        this.etat.emprisonner(this);
    }

    void changementPosition(CoordonneeDeuxDimension nouveauP) throws IOException {
        CoordonneeDeuxDimension pos = (CoordonneeDeuxDimension) this.etablissementDetention.position;
        boolean conditionUn = (nouveauP.x >= this.etablissementDetention.boundX || nouveauP.x <= pos.x);
        boolean conditionDeux = (nouveauP.y >= this.etablissementDetention.boundY || nouveauP.y <= pos.y);
        this.position = nouveauP;
        if (conditionUn || conditionDeux) {
            enCavalle();
        } else {
            emprisonner();
        }
    }

}

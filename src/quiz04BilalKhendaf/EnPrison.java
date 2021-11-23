package quiz04BilalKhendaf;

import java.io.IOException;

public class EnPrison implements IEtatPrisonnier {

    @Override
    public void enCavalle(Prisonnier p) throws IOException {
        p.etat = new Fugitif();
        p.message = "Le prisonnier " + p.nom + ", " + p.prenom + " de l'�tablissement " + p.etablissementDetention.nomEtablissement + " est en cavalle." + " Sa derni�re position connue est: " + p.position;
        p.NotifyAll();
    }

    @Override
    public void emprisonner(Prisonnier p) {

        System.out.println("Le prisonnier " + p.nom + ", " + p.prenom + " est d�j� dans la prison " + p.etablissementDetention.nomEtablissement + ".");
    }

}

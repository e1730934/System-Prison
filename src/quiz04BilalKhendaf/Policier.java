package quiz04BilalKhendaf;

public class Policier extends Observateur {

    int matricule;

    public Policier(int matricule) {

        this.matricule = matricule;
    }

    @Override
    void notifyMe(String m) {
        System.out.println("Alerte pour " + this.getClass().getSimpleName() + " " + this.matricule + ": " + m);
    }
}

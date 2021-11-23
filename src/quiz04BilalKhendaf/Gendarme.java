package quiz04BilalKhendaf;

public class Gendarme extends Observateur {

    int matricule;

    public Gendarme(int matricule) {
        super();
        this.matricule = matricule;
    }


    @Override
    void notifyMe(String m) {

        System.out.println("Alerte pour " + this.getClass().getSimpleName() + " " + this.matricule + ": " + m);
    }
}

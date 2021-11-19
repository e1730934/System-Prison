package quiz04BilalKhendaf;

public abstract class Observateur {
	int matricule;
	void notifyMe(String m) {

		System.out.println("Alerte pour "+ this.getClass().getSimpleName() +" " + this.matricule +": "+ m);
	}
}

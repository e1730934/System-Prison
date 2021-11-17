package quiz04BilalKhendaf;

public interface IObservable {
	void inscrire(Observateur o);
	void desinscrire(Observateur o);
	void NotifyAll();
}

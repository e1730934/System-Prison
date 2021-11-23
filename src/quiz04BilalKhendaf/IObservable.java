package quiz04BilalKhendaf;

import java.io.IOException;

public interface IObservable {
    void inscrire(Observateur o);

    void desinscrire(Observateur o);

    void NotifyAll() throws IOException;
}

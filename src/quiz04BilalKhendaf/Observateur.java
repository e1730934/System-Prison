package quiz04BilalKhendaf;

import java.io.IOException;

public abstract class Observateur {

    abstract void notifyMe(String m) throws IOException;
}

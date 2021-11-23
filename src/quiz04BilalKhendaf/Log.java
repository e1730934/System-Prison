package quiz04BilalKhendaf;

import java.io.IOException;

public abstract class Log extends Observateur {
    String extension;

    abstract void notifyMe(String m) throws IOException;
}
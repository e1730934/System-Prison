package quiz04BilalKhendaf;

import java.io.IOException;

public abstract class Log {
    String extension;
    abstract  void writeFile(String filename, String input) throws IOException;
}

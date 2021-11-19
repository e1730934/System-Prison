package quiz04BilalKhendaf;

import java.io.IOException;

public abstract class log {
    String extension;
    abstract  void writeFile(String filename, String input) throws IOException;
}

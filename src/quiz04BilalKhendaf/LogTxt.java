package quiz04BilalKhendaf;

import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;


public class LogTxt extends Log {

    String filename;

    public LogTxt(String filename) {
        this.filename = filename;
        this.extension = ".txt";
    }

    @Override
    void notifyMe(String m) throws IOException {
        ZonedDateTime dateTime = ZonedDateTime.now();
        FileWriter fw = new FileWriter(this.filename + this.extension, true);
        fw.write(dateTime + ": " + m + "\n");
        fw.close();
    }

    String extension;
}

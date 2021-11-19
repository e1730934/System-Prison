package quiz04BilalKhendaf;

import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;

public class LogTxt extends Log {
    public LogTxt(){
        this.extension = ".txt";
    }


    @Override
      void writeFile(String filename, String input) throws IOException {
        ZonedDateTime dateTime = ZonedDateTime.now();
        FileWriter fw = new FileWriter(filename + this.extension,true);
        fw.write(dateTime + ": " +input + "\n");
        fw.close();
    }
}

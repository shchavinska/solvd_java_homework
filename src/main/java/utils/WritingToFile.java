package utils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFile {
    public void writeToFile (String fileName, String value) {

        try{
            File file = new File(fileName);
            if (!file.exists()){
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println(value);
            pw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

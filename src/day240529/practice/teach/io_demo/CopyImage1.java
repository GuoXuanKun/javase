package day240529.practice.teach.io_demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyImage1 {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("src/day240529/practice/teach/io_demo/from.png");
            outputStream = new FileWriter("src/day240529/practice/teach/io_demo/to.png");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

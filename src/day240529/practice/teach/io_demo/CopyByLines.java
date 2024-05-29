package day240529.practice.teach.io_demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CopyByLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        //PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("src/day240529/io_demo/from.txt"));
            //outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                System.out.println(l);
                //outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            /*if (outputStream != null) {
                outputStream.close();
            }*/
        }
    }
}

package day240529.practice.teach.io_demo;

import java.io.*;

public class CopyByLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("src/day240529/practice/teach/io_demo/from.png"));
            outputStream = new PrintWriter(new FileWriter("src/day240529/practice/teach/io_demo/to.png"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                //System.out.println(l);
                outputStream.println(l);
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

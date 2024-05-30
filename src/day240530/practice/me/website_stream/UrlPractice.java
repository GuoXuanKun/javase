package day240530.practice.me.website_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlPractice {
    public static void main(String[] args) throws IOException {
        URL oracle = new URL("https://www.baidu.com/");
        InputStream input = oracle.openStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(input));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }

        in.close();
    }
}

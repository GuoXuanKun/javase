package day240422.practice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.buidu.com/").get();

        System.out.println(doc.title());

    }

}

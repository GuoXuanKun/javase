package day240530.practice.teach;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class URLExplain {
    public static void main(String[] args) throws Exception {
        parseURL();
    }

    static void parseURL() throws MalformedURLException {
        URL aURL = new URL("http://example.com:80/docs/books/tutorial/index.html?name=networking#DOWNLOADING");

        System.out.println("protocol = " + aURL.getProtocol());
        System.out.println("authority = " + aURL.getAuthority());
        System.out.println("host = " + aURL.getHost());
        System.out.println("port = " + aURL.getPort());
        System.out.println("path = " + aURL.getPath());
        System.out.println("query = " + aURL.getQuery());
        System.out.println("filename = " + aURL.getFile());
        System.out.println("ref = " + aURL.getRef());
    }

    static void creatingAURL() throws MalformedURLException {
        String urlString = "http://example.com/";
        URL myURL = new URL(urlString);
        System.out.println(myURL);
    }

    static void creatingAURLRelativeToAnother() throws MalformedURLException {
        URL myURL = new URL("http://example.com/pages/");
        URL page1URL = new URL(myURL, "page1.html");
        URL page2URL = new URL(myURL, "page2.html");
        System.out.println("page1URL = " + page1URL);
        System.out.println("page2URL = " + page2URL);

        URL page1BottomURL = new URL(page1URL,"#BOTTOM");
        System.out.println("page1BottomURL = " + page1BottomURL);
    }

    static void otherURLConstructors() throws MalformedURLException {
        URL url = new URL("http", "example.com", "/pages/page1.html");
        System.out.println("url = " + url);
        /*
        // This is equivalent to
        // new URL("http://example.com/pages/page1.html");
         */

        URL gamelan = new URL("http", "example.com", 80, "/pages/page1.html");
        System.out.println("gamelan = " + gamelan);
        // telnet
    }

    static void urlAddressesWithSpecialCharacters() throws MalformedURLException {
        // http://example.com/hello world/
        // http://example.com/hello%20world
        URL url = new URL("http://example.com/hello%20world");
        System.out.println("url = " + url);
    }

    static void uri() throws URISyntaxException, MalformedURLException {
        URI uri = new URI("http", "example.com", "/hello world", null);
        System.out.println("uri = " + uri.toString());
        System.out.println("url from uri = " + uri.toURL().toString());
    }
}

package day240530.practice.project;

public class Test {
    public static void main(String[] args) {
        JsoupDownloader jsoupDownloader = new JsoupDownloader();
        System.out.println(jsoupDownloader.download("http://bbs.xmfish.com/thread-htm-fid-55.html"));
    }
}

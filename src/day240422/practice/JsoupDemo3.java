package day240422.practice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://bbs.xmfish.com/thread-htm-fid-55.html").get();

        // 获取所有链接 但是有部分不对
//        System.out.println(doc.select("td[class=subject] > a[class=subject_t f14]").text());

        String theText = "[闲置转让]"; // 需要查找的文本


        // 查找包含指定文本的第一个a标签
//        Element linkWithText = doc.select("a:containsOwn(" + theText + ")").first();
        // 获取该a标签的下一个兄弟元素（a标签）  注意: nextElementSibling() 方法返回的是下一个元素，不一定是 <a> 标签
//        Element nextLink = linkWithText.nextElementSibling();
        // 打印出来
//        System.out.println("Link with text: " + linkWithText.text());
//        System.out.println("Next link: " + nextLink.text());


        // 查找所有包含指定文本的a标签
        // Elements 类表示一组Element
        Elements linksWithText = doc.select("a:containsOwn(" + theText + ")");
        for (Element linkWithText : linksWithText) {
            // 获取该a标签的兄弟元素（下一个a标签）  注意: nextElementSibling() 方法返回的是下一个元素，不一定是 <a> 标签
            Element nextLink = linkWithText.nextElementSibling();
            // 打印 文本 并且含 地址
            System.out.println("Link with text: " + linkWithText.text() + ", Next link: " + nextLink.text() + ", Next link URL: " +"http://bbs.xmfish.com/" +nextLink.attr("href"));
        }

        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        // 查找所有包含指定文本的a标签
        // Elements 类表示一组Element
        Elements linksWithText0 = doc.select("a:containsOwn(" + theText + ")");
        for (Element linkWithText : linksWithText0) {
            // 获取该a标签的兄弟元素（下一个a标签）  注意: nextElementSibling() 方法返回的是下一个元素，不一定是 <a> 标签
            Element nextLink = linkWithText.nextElementSibling();
            // 打印 含"苹果"的文本 并且含 地址
            if (nextLink != null && "a".equals(nextLink.tagName()) && nextLink.text().contains("苹果")) {
                System.out.println("Link with text: " + linkWithText.text() + ", Next link :" + nextLink.text() + "' URL: " + "http://bbs.xmfish.com/" +nextLink.attr("href"));
            }
        }


    }

}

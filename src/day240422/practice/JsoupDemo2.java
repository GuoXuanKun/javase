package day240422.practice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://so.gushiwen.cn/gushi/shijing.aspx").get();

        // 怎么获取 span 标签 底下 a 标签 target 属性 = "-blank"
//        System.out.print(doc.select("span > a[target=_blank]"));

        // 怎么 计算 span 的个数 有没有什么方法可以直接用 ? 用循环 ?
        System.out.println(doc.select("span > a[target=_blank]").size() + doc.select("span > a[style=color:#999999;]").size());

        // 怎么获取 span 标签 里面的值
        System.out.print(doc.select("span > a[target=_blank]").text());

        // span 的数量对不上 肯定有其他.
        System.out.print(doc.select("span > a[style=color:#999999;]").text());

    }
}

package day240603.practice.teach.app.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.List;

public class XmfishParser implements Parser {
    @Override
    public List<String> parse(String html) {
        Document document = Jsoup.parse(html);
        // todo 解析
        List<String> titles = new ArrayList<>();
        titles.add("苹果5折");
        titles.add("xxx便宜转");
        titles.add("新的奋斗奋斗");
        return titles;
    }
}

package day240509.practice.util;

import org.jsoup.nodes.Document;

import java.io.IOException;

//分析网站算法的父类
public abstract class AnalysisWebsite {
    public abstract String Analysis(Document document, String key) throws IOException;
}

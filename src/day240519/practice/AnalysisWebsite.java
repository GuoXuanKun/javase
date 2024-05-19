package day240519.practice;

import org.jsoup.nodes.Document;

import java.io.IOException;

//分析网站算法的父类
public interface AnalysisWebsite {
    String Analysis(String key) throws IOException;
}

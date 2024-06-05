package day240603.practice.teach.app.parser;

import day240603.practice.teach.app.dto.CustomResult;

import java.util.List;

import static day240603.practice.teach.app.App.PROPERTIES;

public interface Parser {
    static Parser getInstance() {
        String parser = PROPERTIES.getProperty("parser");
        Parser ps = null;
        if ("xmfish".equals(parser)) {
            ps = new XmfishParser();
        } else {
            System.out.println("不支持的 Parser");
            System.exit(-1);
        }
        return ps;
    }

    List<CustomResult> parse(String html);
}

package day240603.practice.teach.app.parser;

import day240603.practice.teach.app.dto.CustomResult;
import day240603.practice.teach.app.util.MyReflectUtil;

import java.util.List;

import static day240603.practice.teach.app.App.PROPERTIES;

public interface Parser {
    static Parser getInstance() {
        return MyReflectUtil.getInstance(PROPERTIES.getProperty("parser"));
    }

    List<CustomResult> parse(String html);
}

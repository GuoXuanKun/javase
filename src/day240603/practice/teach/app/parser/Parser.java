package day240603.practice.teach.app.parser;

import day240603.practice.teach.app.dto.CustomResult;

import java.util.List;

public interface Parser {
    List<CustomResult> parse(String html);
}
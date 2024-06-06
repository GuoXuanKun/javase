package day240603.practice.teach.app.repository;

import day240603.practice.teach.app.dto.CustomResult;
import day240603.practice.teach.app.util.MyReflectUtil;

import java.util.List;

import static day240603.practice.teach.app.App.PROPERTIES;

public interface Repository {

    static Repository getInstance() {
        return MyReflectUtil.getInstance(PROPERTIES.getProperty("repository"));
    }

    void store(List<CustomResult> results);
}

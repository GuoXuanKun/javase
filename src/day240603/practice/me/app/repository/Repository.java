package day240603.practice.me.app.repository;

import day240603.practice.me.app.dto.CustomResult;
import day240603.practice.me.app.util.MyReflectUtil;

import java.sql.SQLException;
import java.util.List;

import static day240603.practice.teach.app.App.PROPERTIES;

public interface Repository {

    static Repository getInstance() {
        return MyReflectUtil.getInstance(PROPERTIES.getProperty("repository"));
    }

    void store(List<CustomResult> results) throws SQLException;
}

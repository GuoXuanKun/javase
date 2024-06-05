package day240603.practice.teach.app.repository;

import day240603.practice.teach.app.dto.CustomResult;

import java.util.List;

import static day240603.practice.teach.app.App.PROPERTIES;

public interface Repository {

    static Repository getInstance() {
        String repository = PROPERTIES.getProperty("repository");
        Repository r = null;
        if ("console".equalsIgnoreCase(repository)) {
            r = new ConsoleRepository();
        } else if ("file".equalsIgnoreCase(repository)) {
            r = new FileRepository();
        } else {
            System.out.println("不支持的 Repository");
            System.exit(-1);
        }
        return r;
    }

    void store(List<CustomResult> results);
}

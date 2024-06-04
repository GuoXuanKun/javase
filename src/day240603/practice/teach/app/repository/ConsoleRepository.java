package day240603.practice.teach.app.repository;

import day240603.practice.teach.app.dto.CustomResult;

import java.util.List;

public class ConsoleRepository implements Repository{
    @Override
    public void store(List<CustomResult> results) {
        for (CustomResult cr : results) {
            System.out.println(cr.getTitle());
            System.out.println(cr.getUrl());
            System.out.println(cr.getCreatedAt());
            System.out.println("--- --- ---");
        }
    }
}

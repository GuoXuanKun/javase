package day240603.practice.me.app.repository;

import day240603.practice.me.app.dto.CustomResult;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileRepository implements Repository {
    private static final String FILE = "src/day240603/practice/teach/app/repository.data";
    @Override
    public void store(List<CustomResult> results) {
        try (
                PrintWriter pw = new PrintWriter(new FileWriter(FILE));
        ) {
            for (CustomResult cr : results) {
                pw.println(cr.getTitle());
                pw.println(cr.getUrl());
                pw.println(cr.getCreatedAt());
                pw.println(cr.getUpdatedAt());
                pw.println("--- --- ---");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

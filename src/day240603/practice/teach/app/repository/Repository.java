package day240603.practice.teach.app.repository;

import day240603.practice.teach.app.dto.CustomResult;

import java.util.List;

public interface Repository {

    void store(List<CustomResult> results);
}
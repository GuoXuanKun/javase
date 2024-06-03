package day240603.practice.teach.random_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("王*方", "傅*浩", "王*杰", "李*浩", "江*涛", "郭*坤", "肖*龄", "吴*楠", "陈*聪", "林*城", "吴*泺", "陈*杰", "方z", "王*尧");
        Collections.shuffle(names);
        System.out.println(names);
    }
}

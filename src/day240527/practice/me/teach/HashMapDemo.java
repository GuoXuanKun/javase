package day240527.practice.me.teach;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> classGroup = new HashMap<>();
        classGroup.put("第一组", "4人");
        classGroup.put("第二组", "3人");
        classGroup.put("第三组", "4人");
        classGroup.put("第四组", "3人");
        System.out.println(classGroup);

        // 回顾之前的泛型练习：Group
        // F:\A1guomaoproject\java\j240401\javase\src\day240521\practice\teacher\group\Group.java
    }
}
package day240522.practice.teacher.interview1;

/**
 * extends 继承：is-a
 *
 * implements 实现：contract (合同、规范、契约)
 */
public class Student extends Person implements Comparable, StudyAbility {
    String school;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void study() {
        System.out.println("Learning Java...");
    }
}

interface StudyAbility {
    void study();
}

package day240429.practice.p1;

public class Cat {
    // 1. state
    String Kind;
    int age;
    // 2. behavior
    public String getKind() {
        return Kind;
    }
    public void setKind(String kind) {
        Kind = kind;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "Kind='" + Kind + '\'' +
                ", age=" + age +
                '}';
    }
    // 3. behavior
    public Cat(String kind, int age) {
        Kind = kind;
        this.age = age;
    }
}

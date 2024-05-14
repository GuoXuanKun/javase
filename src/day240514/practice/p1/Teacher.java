package day240514.practice.p1;

public class Teacher implements MyComparable {
    String name;
    char firstLetter;
    int age;

    public Teacher(String name, char firstLetter, int age) {
        this.name = name;
        this.firstLetter = firstLetter;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", firstLetter=" + firstLetter +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(MyComparable s) {
        if (s instanceof Teacher other) {
            if (this.age == other.age) {
                return 0;
            } if (this.age > other.age) {
                return 1;
            } else {
                return -1;
            }
        } else {
            // 后续学了异常之后，这里可以抛出异常
            System.out.println("类型不匹配");
            return -999;
        }
    }
}


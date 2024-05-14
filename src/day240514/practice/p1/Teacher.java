package day240514.practice.p1;

public class Teacher implements MyComparable {
    String name;
    char firstLetter;
    int age;
    long x;
    double y;
    MyComparator comparator = new TeacherFirstLetterComparator();

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
        // `谁`来`帮我处理`一下
        // `谁`.`帮我处理`
        // 👆复习 OOP 的思维

        // 👇抽象的思维
        // 根据之前的经验：哪里想实现`稳定`，同时`可扩展`，就在哪里应用抽象的思维
        // 抽象类、接口

        // xxx.compare(this, s);
        // 自己.compare(this, s);
        // 别人.compare(this, s);
        // 比较器.compare(this, s);
        // (按姓氏首字母排序)的比较器.compare(this, s);
        // (按x值排序)的比较器.compare(this, s);
        // (按y值排序)的比较器.compare(this, s);
        // (xxx)的比较器.compare(this, s);

        return comparator.compare(this, s);

        /*if (s instanceof Teacher other) {
            if (this.firstLetter == other.firstLetter) {
                return 0;
            } if (this.firstLetter > other.firstLetter) {
                return 1;
            } else {
                return -1;
            }
        } else {
            // 后续学了异常之后，这里可以抛出异常
            System.out.println("类型不匹配");
            return -999;
        }*/
    }
}

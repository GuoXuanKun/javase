package day240515.practice.p2.p2;

public class Test {
    public static void main(String[] args) {
        Teacher z = new Teacher("Z老师", 'Z', 19);
        Teacher x = new Teacher("X老师", 'X', 22);
        Teacher b = new Teacher("B老师", 'B', 18);
        Teacher y = new Teacher("Y老师", 'Y', 20);
        Teacher a = new Teacher("A老师", 'A', 21);

        Teacher[] teachers = new Teacher[] {z, x, b, y, a};

        MySortUtil.print(teachers);
        MySortUtil.sort(teachers, new TeacherFirstLetterComparator());
        MySortUtil.print(teachers);

        System.out.println("=== === ===");

        // 3. 支持 Dog[]
        int size = 5;
        Dog[] dogArr = new Dog[size];
        for (int i = 0; i < size; i++) {
            dogArr[i] = new Dog("狗-" + i, 10 - i);
        }
        MySortUtil.print(dogArr);
        MySortUtil.sort(dogArr, new DogAgeComparator());
        MySortUtil.print(dogArr);
    }
}

package day240509.practice.final_test_teacher;

public class FinalVariable {
    // Variable 'id' might not have been initialized
    final int id;
    public FinalVariable() {
        System.out.println("执行了 `空参构造器`");
        //id = 1;
    }
//
//    public FinalVariable(int id) {
//        this.id = id;
//    }

    {
        System.out.println("执行了 `block`");
        id = 3;
    }

    public static void main(String[] args) {
        new FinalVariable();
    }
}

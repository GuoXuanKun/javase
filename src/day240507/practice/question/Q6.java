package day240507.practice.question;

public class Q6 {
    public static void main(String[] args) {
        boolean b1 = false;
        int num1 = 1;
        if (b1 | (num1++ == 1)) {
            System.out.println("branch-1");
        } else {
            System.out.println("branch-2");
        }
        System.out.println("num1 = " + num1);
    }
}

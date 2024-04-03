package day240403;

public class AssignmentPractice {
    public static void main(String[] args) {
        short s = 3;
        //s = s + 2;
        //s +=2;

        //思考2:
        int i = 1;
        i *= 0.1;

        System.out.println(i);
        i++;
        System.out.println(i);

        //思考3
        int m = 2;
        int n = 3;
        n *= m++;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}

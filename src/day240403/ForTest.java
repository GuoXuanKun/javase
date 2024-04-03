package day240403;

public class ForTest {
    public static void main(String[] args) {
        //i行
        for (int i = 1; i < 10; i++) {
            //分行
            System.out.println();
            //列
            for (int j = 1; j <= i ; j++) {

                    System.out.print( i + "*" + j + "=" + i*j + " ");

            }

        }
    }
}

package day240407;

public class Loop {
    public static void main(String[] args) {

        // for 次数明确且次数有限
        for (int i = 1; i < 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("=== === ===");

        // while 次数模糊 且 次数可以无限(条件循环)
        int j = 1;
        while (j <= 5){
            System.out.println("Hello World");
            j++;
        }

        System.out.println("=== === ===");

        //do...while 次数模糊 且 次数可以无限(条件循环) do里面的内容必须做一次再进行条件判断
        int k = 1;
        do {
            System.out.println("Hello World");
            k++;
        }while (k <= 5);



    }
}

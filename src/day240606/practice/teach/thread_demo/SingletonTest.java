package day240606.practice.teach.thread_demo;

public class SingletonTest {
    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            System.out.println(Student.getInstance());
        }*/

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Student.getInstance());
                }
            }).start();
        }
    }
}
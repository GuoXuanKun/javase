package day240606.practice.thread;

public class MultipleThreadsDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("P1 === " + i);
                }
            }
        }).start();

        for (int i = 0; i < 100; i++) {
            System.out.println("P2 === " + i);
        }
    }
}

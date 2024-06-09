package day240606.practice.teach.thread_demo;

public class MultipleThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("P2===" + i);
                }
            }
        }).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("P1===" + i);
        }
    }
}

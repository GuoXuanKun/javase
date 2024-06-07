package day240607.practice.me;

public class ThreadNewPath {
    public static void main(String[] args) {
        Thread myThread1 = new MyThread1();
        myThread1.start();

        Thread myThread2 =new Thread(new MyThread2());
        myThread2.start();
    }
}
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + " -> " + i);
        }
    }
}
class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}
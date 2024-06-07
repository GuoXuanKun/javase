package day240607.practice.me.double_lock_Test;

public class DoubleLockTest {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t1();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t2();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
    public static void t1() throws InterruptedException {
        synchronized (DoubleLockTest.class){
            Thread.sleep(10);
            synchronized (Object.class){
                System.out.println("t1");
            }
        }
    }
    public static void t2() throws InterruptedException {
        synchronized (Object.class){
            Thread.sleep(10);
            synchronized (DoubleLockTest.class){
                System.out.println("t2");
            }
        }
    }
}

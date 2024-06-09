package day240607.practice.teach;

/**
 * 如果启动一个条新的执行路径？
 * <p>
 * 方式一：extends Thread && Override run() && start()
 * 方式二：implements Runnable && implement run() && new Thread(...).start()
 * 方法其他：还有其他方式，本例子暂时先介绍这两种，后续再补充
 */
public class ThreadNewPath {
    public static void main(String[] args) {
        Thread myThread1 = new MyThread1("Thread-path1");
        // 直接调用 run 方法，相当于普通的方法调用，而非启动一条新的执行路径
        myThread1.run();

        Thread myThread2 = new Thread(new MyThread2(), "Thread-path2");
        myThread2.start();
    }
}

class MyThread1 extends Thread {
    public MyThread1() {
    }

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + "---" + i);
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}

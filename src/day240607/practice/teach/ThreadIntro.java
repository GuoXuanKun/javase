package day240607.practice.teach;

/**
 * Thread introduction
 * <p>
 * A thread is a thread of execution in a program.
 * The Java virtual machine allows an application to have multiple threads of execution running concurrently.
 * <p>
 * 线程：程序的执行路径
 * 多线程：程序中有多条执行路径
 * <p>
 * 学习多线程之前，就已经接触过线程了，main 就是一条执行路径，也就是一个线程、主线程、主执行路径
 *
 * 在 Java 中，Thread 就是对线程的建模
 */
public class ThreadIntro {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("当前线程名称=" + Thread.currentThread().getName());
        System.out.println("2");
        Thread.currentThread().setName("newName");
        System.out.println("3");
        System.out.println("当前线程名称=" + Thread.currentThread().getName());
    }
}

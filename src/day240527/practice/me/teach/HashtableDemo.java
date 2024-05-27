package day240527.practice.me.teach;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        // 典型的命名不规范
        // Since: 1.0
        // synchronized => thread-safe
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");
        System.out.println(hashtable);

        // If a thread-safe implementation is not needed, it is recommended to use {@link HashMap}
        // 如果不需要线程安全的实现，建议使用{@link HashMap}
        // If a thread-safe highly-concurrent implementation is desired,
        // 如果需要一个线程安全的高并发实现，
        // then it is recommended to use {@link java.util.concurrent.ConcurrentHashMap}
        // 那么建议使用{@link java.util.concurrent.ConcurrentHashMap}
        }
}

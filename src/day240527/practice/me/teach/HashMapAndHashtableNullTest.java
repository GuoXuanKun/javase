package day240527.practice.me.teach;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapAndHashtableNullTest {
    public static void main(String[] args) {
        // Hash table based implementation of the Map interface.
        // This implementation provides all of the optional map operations, and permits null values and the null key.
        // 基于哈希表的Map接口实现。
        // 该实现提供了所有可选的map操作，并允许空值和空键。
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", null);
        hashMap.put(null, "value-2");
        System.out.println(hashMap.get("key1"));
        System.out.println(hashMap.get(null));
        System.out.println(hashMap);

        System.out.println("=== === ===");

        // This class implements a hash table, which maps keys to values.
        // Any non-null object can be used as a key or as a value.
        // 这个类实现了一个哈希表，它将键映射到值。
        // 任何非空对象都可以用作键或值。
        Hashtable<String, String> hashtable = new Hashtable<>();
        // java.lang.NullPointerException
        hashtable.put("key1", null);
        hashtable.put(null, "value-2");
        System.out.println(hashtable.get("key1"));
        System.out.println(hashtable.get(null));
        System.out.println(hashtable);
    }
}

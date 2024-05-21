package day240521.practice.teacher.group;

public class Group<K, V> {
    K key;
    V value;

    public Group(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V get(K key) {
        if (key.equals(this.key)) {
            return this.value;
        } else {
            return null;
        }
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

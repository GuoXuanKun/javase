package day240515.practice.p2.p2;

public interface MyComparable<T> {
    /**
     * 这里只定义规范，具体的由各自子类实现
     *
     * @param s T 类型
     * @return int (0 代表相等；1 代表大于；-1 代表小于；-999 代表类型不匹配)
     */
    int compareTo(T s);
}

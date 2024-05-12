package day240512.practice;

public abstract class Sortable  {
    /**
     * 如果返回值是 0，代表这两个对象相等
     * 如果返回值是 1，代表`当前对象`比较大
     * 如果返回值是 -1，代表`当前对象`比较小
     * @param sortable
     * @return
     */
    public abstract int compareTo(Sortable sortable);
}

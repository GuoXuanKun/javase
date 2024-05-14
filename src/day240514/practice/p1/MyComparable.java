package day240514.practice.p1;

public interface MyComparable {
    // 变量类型 变量名 = 变量值;
    // `变量类型` 好像不太容易确定
    /*final double xxx;

    /*public Sortable(double xxx) {
        this.xxx = xxx;
    }*/

    /**
     * 这里只定义规范，具体的由各自子类实现
     *
     * @param s MyComparable 类型
     * @return int (0 代表相等；1 代表大于；-1 代表小于；-999 代表类型不匹配)
     */
    int compareTo(MyComparable s);
}
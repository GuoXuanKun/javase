package day240515.practice.p2.p2;

public class Test2 {
    public static void main(String[] args) {
        //int[] intArr = new int[] {3, 5, 1, 2, 9};
        MyInt[] myIntArr = new MyInt[] {new MyInt(3), new MyInt(5), new MyInt(1), new MyInt(2), new MyInt(9)};
        // 让 int[] 可以传递到 print(Object[])
        MySortUtil.print(myIntArr);

        MySortUtil.sort(myIntArr, new MyComparator() {
            @Override
            public int compare(Object o1, Object o2) {
                MyInt t1 = (MyInt) o1;
                MyInt t2 = (MyInt) o2;
                if (t1.intValue() == t2.intValue()) {
                    return 0;
                } if (t1.intValue() > t2.intValue()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        MySortUtil.print(myIntArr);
    }
}

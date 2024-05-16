package day240515.practice.p2.p2;

public class Test3 {
    public static void main(String[] args) {
        int[] intArr = new int[] {3, 5, 1, 2, 9};
        // In OOP, we create objects to solve complex problems.
        // 自己创建：MyInt
        //MyInt[] myIntArr = new MyInt[] {new MyInt(3), new MyInt(5), new MyInt(1), new MyInt(2), new MyInt(9)};
        // JDK：Integer
//        Integer[] integerArr = new Integer[] {new Integer(3), new Integer(5), new Integer(1), new Integer(2), new Integer(9)};
        Integer[] integerArr = new Integer[] {3, 5, 1, 2, 9};
        Object[] oa = new Object[] {3, 5, 1, 2, 9};

        MySortUtil.sort(integerArr, new MyComparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer t1 = (Integer) o1;
                Integer t2 = (Integer) o2;
                if (t1.intValue() == t2.intValue()) {
                    return 0;
                } if (t1.intValue() > t2.intValue()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        MySortUtil.print(integerArr);

        System.out.println("=== === ===");

        int i1 = 5;

        //Integer i2 = new Integer(3);
        Integer i2 = Integer.valueOf(3);
        i2 = i1;

        Integer i3 = 5;
        Integer tmp3 = Integer.valueOf(5);

        Object o = i2;

        Object o2 = i1;


    }
}

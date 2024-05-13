package day240513.practice.test;

public class TV extends MyComparable {
    String name;
    double price;

    public TV(String name, double price) {
        /*// 具体子类中，哪个 state 要参与比较，该用通过 super(xxx) 的调用方式给它赋值
        super(price);*/
        this.name = name;
        this.price = price;
        // 具体的子类中，哪个 state 要参与比较，就把它赋值给从父类基础的那个 xxx
//        this.xxx = this.price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean compareTo(MyComparable s) {
        if (s instanceof TV) {
            TV other = (TV) s;
            if (this.price > other.price) {
                return true;
            } else {
                return false;
            }
        } else {
            // 后续学了异常之后，这里可以抛出异常
            System.out.println("类型不匹配");
            return false;
        }
    }

    @Override
    public double getXxx() {
        // 具体子类中，哪个 state 要参与比较，就通过这个方法返回出去
        return this.price;
    }
}

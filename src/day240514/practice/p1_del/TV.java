package day240514.practice.p1_del;

public class TV implements MyComparable {
    String name;
    double price;

    public TV(String name, double price) {
        /*// 具体子类中，哪个 state 要参与比较，该用通过 super(xxx) 的调用方式给它赋值
        super(price);*/
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(MyComparable s) {
        if (s instanceof TV other) {
            if (this.price == other.price) {
                return 0;
            } if (this.price > other.price) {
                return 1;
            } else {
                return -1;
            }
        } else {
            // 后续学了异常之后，这里可以抛出异常
            System.out.println("类型不匹配");
            return -999;
        }
    }
}

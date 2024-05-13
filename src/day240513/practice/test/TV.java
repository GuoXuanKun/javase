package day240513.practice.test;

public class TV extends Sortable {
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
    public boolean isLargerThan(Sortable s) {
        // 严格来说，这里要进行 instanceof 判断，确定了传进来的是 TV 类型，才能强制转成 TV
        TV other = (TV) s;
        if (this.price > other.price) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getXxx() {
        // 具体子类中，哪个 state 要参与比较，就通过这个方法返回出去
        return this.price;
    }
}

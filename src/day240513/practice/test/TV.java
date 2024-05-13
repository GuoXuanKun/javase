package day240513.practice.test;

public class TV extends Sortable {
    String name;
    double price;

    public TV(String name, double price) {
        this.name = name;
        this.price = price;
        // 具体的子类中，哪个 state 要参与比较，就把它赋值给从父类基础的那个 xxx
        this.xxx = this.price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

package day240513.practice.mysortutil;

public class TV extends Sortable {

    String name;
    double price;

    public TV(String name, double price) {
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
    public int compareTo(Sortable sortable) {
        TV tv = (TV) sortable;
        if (this.price > tv.price) {
            return 1;
        } else if (this.price < tv.price) {
            return -1;
        } else {
            return 0;
        }
    }
}

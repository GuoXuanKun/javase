package day240411;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.name = "Mi";
        phone.color = "black";
        phone.size = "13inches";
        phone.weight = "111g";

        System.out.println(phone.name + " " + phone.color + " " + phone.size + " " + phone.weight);


        phone.call();
        phone.find();
        phone.music();
        phone.play();
    }
}

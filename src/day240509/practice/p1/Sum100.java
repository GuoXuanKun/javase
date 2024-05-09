package day240509.practice.p1;

public class Sum100 extends Algorithm{
    public void justDoIt() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

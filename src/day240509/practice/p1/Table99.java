package day240509.practice.p1;

public class Table99 extends Algorithm{
    public void justDoIt() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}

package day240606.practice.me;

public class DayTest {
    public static void main(String[] args) {
        whatExactlyIsIt();
    }

    private static void whatExactlyIsIt() {
        Day thursday = Day.THURSDAY;
        System.out.println(thursday);

        System.out.println(thursday.toString());


        System.out.println(thursday.name());
        System.out.println(thursday.ordinal());
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.SUNDAY.ordinal());
    }
}

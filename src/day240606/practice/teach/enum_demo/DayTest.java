package day240606.practice.teach.enum_demo;

import day240606.practice.teach.enum_demo.Day;

public class DayTest {
    public static void main(String[] args) {
        whatExactlyIsIt();
    }

    private static void whatExactlyIsIt() {
        Day thursday = Day.THURSDAY;
        System.out.println(thursday);
        // All enums implicitly extend java.lang.Enum
        System.out.println(thursday.toString());

        System.out.println("=== === ===");
        Day[] values = Day.values();
        for (Day day : values) {
            System.out.println(day);
            System.out.println(day.name() + "-" + day.ordinal());
        }
    }
}

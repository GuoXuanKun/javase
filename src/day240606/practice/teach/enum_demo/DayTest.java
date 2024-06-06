package day240606.practice.teach.enum_demo;

import day240606.practice.teach.enum_demo.Day;

public class DayTest {
    public static void main(String[] args) {
        whatExactlyIsIt();
        System.out.println("===---===---===");
        useWithSwitch(Day.TUESDAY);
        System.out.println("===---===---===");
        enumImplementsInterface();
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
        System.out.println("=== === ===");
        System.out.println(Day.valueOf("FRIDAY"));
    }

    private static void useWithSwitch(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("一脸懵");
                break;
            case TUESDAY:
                System.out.println("前不着村，后不着店");
                break;
            case WEDNESDAY:
                System.out.println("Midweek days are so-so.");
                break;
            case THURSDAY:
                System.out.println("加把劲");
                break;
            case FRIDAY:
                System.out.println("心已放假");
                break;
            case SATURDAY:
                System.out.println("爽啊");
                break;
            case SUNDAY:
                System.out.println("握草，这就...");
                break;
        }
    }

    private static void enumImplementsInterface() {
        for (Day day : Day.values()) {
            day.desc();
        }
    }
}


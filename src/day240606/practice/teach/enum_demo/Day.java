package day240606.practice.teach.enum_demo;

public enum Day implements ForEnumDemo {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public void desc() {
        System.out.println("Day.desc");
    }
}

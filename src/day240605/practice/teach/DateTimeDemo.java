package day240605.practice.teach;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        now();
        System.out.println("---");
        of();
        System.out.println("---");
        getXxx();
        System.out.println("---");
        withXxx();
        System.out.println("---");
        plusXxx();
        System.out.println("---");
        minusXxx();
        System.out.println("===");
        instant();
        System.out.println("---");
        format();
    }

    /**
     * 当前
     */
    private static void now() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    /**
     * 指定
     */
    private static void of() {
        LocalDate localDate = LocalDate.of(2024, 6, 4);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(17, 18, 19);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(2024, 6, 4, 17, 18, 19);
        System.out.println(localDateTime);
    }

    /**
     * 获取 xxx
     */
    private static void getXxx() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getHour());
    }

    /**
     * 设置 xxx
     */
    private static void withXxx() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = localDateTime.withHour(5);
        System.out.println(localDateTime1);
    }

    /**
     * 增加 xxx
     */
    private static void plusXxx() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = localDateTime.plusDays(3);
        System.out.println(localDateTime1);
    }

    /**
     * 减少 xxx
     */
    private static void minusXxx() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = localDateTime.minusMonths(1);
        System.out.println(localDateTime1);
    }

    private static void instant() {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(ZoneId.getAvailableZoneIds());
        ZonedDateTime ctt = instant.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(ctt);
        ZonedDateTime ctt1 = instant.atZone(ZoneId.of(ZoneId.SHORT_IDS.get("CTT")));
        System.out.println(ctt1);
        LocalDateTime localDateTime = ctt1.toLocalDateTime();
        System.out.println(localDateTime);
    }

    /**
     * String to LocalDateTime
     * LocalDateTime to String
     */
    private static void format() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String updatedAtStr1 = "2024-06-05 09:05";
        String updatedAtStr2 = "2024-06-05 09:05";
        LocalDateTime localDateTime = LocalDateTime.parse(updatedAtStr1, formatter);
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.parse(updatedAtStr2, formatter);
        System.out.println(localDateTime1);

        Duration between = Duration.between(localDateTime, localDateTime1);
        System.out.println(between.toHours());

        System.out.println(localDateTime1.isAfter(localDateTime));
        System.out.println(localDateTime1.isBefore(localDateTime));
        System.out.println(localDateTime1.isEqual(localDateTime));
        System.out.println(localDateTime.getNano() >= localDateTime1.getNano());
        System.out.println(localDateTime.compareTo(localDateTime1));

        System.out.println(localDateTime.toString());
        System.out.println(formatter.format(localDateTime));
    }
}

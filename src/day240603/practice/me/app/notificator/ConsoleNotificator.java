package day240603.practice.me.app.notificator;

public class ConsoleNotificator implements Notificator {
    @Override
    public void send(String to, String msg) {
        System.out.println("--- --- ---");
        System.out.println("Hi, " + to);
        System.out.println();
        System.out.println(msg);
        System.out.println("--- --- ---");
    }
}
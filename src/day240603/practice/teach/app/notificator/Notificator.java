package day240603.practice.teach.app.notificator;

import static day240603.practice.teach.app.App.PROPERTIES;

public interface Notificator {
    static Notificator getInstance() {
        String notificator = PROPERTIES.getProperty("notificator");
        Notificator nf = null;
        if ("console".equalsIgnoreCase(notificator)) {
            nf = new ConsoleNotificator();
        } else if ("email".equalsIgnoreCase(notificator)) {
            nf = new EmailNotificator();
        } else {
            System.out.println("不支持的 Notificator");
            System.exit(-1);
        }
        return nf;
    }

    void send(String to, String msg);
}

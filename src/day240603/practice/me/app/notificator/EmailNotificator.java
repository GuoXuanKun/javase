package day240603.practice.me.app.notificator;

import day240603.practice.me.app.util.MyEmailUtil;

public class EmailNotificator implements Notificator {
    @Override
    public void send(String to, String msg) {
        try {
            msg = msg.replaceAll("\\n", "<br>");
            MyEmailUtil.send(to, msg);
        } catch (Exception e) {
            System.out.println("邮件发送失败！！！");
            throw new RuntimeException(e);
        }
    }
}
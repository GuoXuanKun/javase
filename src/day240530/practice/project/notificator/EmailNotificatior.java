package day240530.practice.project.notificator;

import day240530.practice.project.notificator.util.MyEmailUtil;

public class EmailNotificatior implements Notificatior{
    @Override
    public void notificator(String address, String content) {
        try {
            MyEmailUtil.send(address,content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

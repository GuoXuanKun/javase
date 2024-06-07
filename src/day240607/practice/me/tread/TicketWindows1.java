package day240607.practice.me.tread;

import java.util.ArrayList;
import java.util.List;

public class TicketWindows1 {
    static List<String> tickets = new ArrayList<>();

    static {
        for (int i = 0; i < 1000; i++) {
            tickets.add("车票编码---" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (Object.class){
                    while (!tickets.isEmpty()){
                        System.out.println("售出 === " + tickets.remove(0));
                    }
                    }
                }
            }).start();
        }
    }
}

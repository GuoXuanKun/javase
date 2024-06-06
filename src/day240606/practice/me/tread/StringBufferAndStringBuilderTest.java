package day240606.practice.me.tread;

public class StringBufferAndStringBuilderTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    stringBuffer.append(i);
                    stringBuilder.append(i);
                }
            }
        }).start();
        for (int i = 0; i < 10; i++) {
            stringBuffer.append(i);
            stringBuilder.append(i);
        }
        System.out.println("StringBuffer 的长度为 : " + stringBuffer.length());
        System.out.println("stringBuilder 的长度为 : " + stringBuilder.length());
    }
}

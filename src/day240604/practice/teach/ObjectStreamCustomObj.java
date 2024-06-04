package day240604.practice.teach;

import java.io.*;

public class ObjectStreamCustomObj {
    static final String FILE_NAME = "src/day240604/practice/teach/obj.txt";

    public static void main(String[] args) {
        out();
        in();
    }

    private static void out() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(new CustomObj("x1", 1, new MyObj()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void in() {
        ObjectInputStream oos = null;
        try {
            oos = new ObjectInputStream(new FileInputStream(FILE_NAME));
            CustomObj o = (CustomObj) oos.readObject();
            System.out.println(o);
        } catch (IOException | ClassNotFoundException e) {
            // 另一种 catch 合并写法：`Collapse 'catch' blocks`
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


package day240527.practice.me.teach;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String fileName = "src/day240527/config.properties";
        properties.load(new FileInputStream(fileName));
        properties.setProperty("username", "new-name");
        properties.setProperty("password", "new-password");
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));

        properties.store(new FileOutputStream(fileName), properties.toString());
    }
}

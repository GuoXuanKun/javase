package day240527.practice.me.teach;

import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("username", "admin");
        properties.setProperty("password", "123xyz");
        System.out.println(properties.get("username"));
    }
}

package day240603.practice.me.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    static Connection connection;
    static {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "这里放密码");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

package day240603.practice.me.app.repository;

import day240603.practice.me.app.dto.CustomResult;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class JDBCRepository implements Repository {

    @Override
    public void store(List<CustomResult> results) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "这里放密码");
    }
}

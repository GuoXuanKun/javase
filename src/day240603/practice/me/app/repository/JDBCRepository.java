package day240603.practice.me.app.repository;

import day240603.practice.me.app.dto.CustomResult;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class JDBCRepository implements Repository {

    @Override
    public void store(List<CustomResult> results) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "这里放密码");

        String insertSql = "insert into article(title,url,create_at,update_at) values(?, ?, ?, ?);";
        PreparedStatement ppstmt = connection.prepareStatement(insertSql);
        for (CustomResult cr : results) {
            ppstmt.setString(1, cr.getTitle());
            ppstmt.setString(2, cr.getUrl());
            ppstmt.setString(3, cr.getCreatedAt());
            ppstmt.setString(4, cr.getUpdatedAt());
            ppstmt.executeUpdate();
        }
    }
}

package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DbManagerTestSuite {

    @Test
    void testConnection() throws SQLException {
        //Given

        //When
        DbManager dbManager = DbManager.getInstance();

        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " + rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);

    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS NUMBER_POSTS " +
                "FROM USERS U, POSTS P " +
                "WHERE U.ID = P.USER_ID " +
                "GROUP BY U.LASTNAME " +
                "HAVING count(*)>1 " +
                "ORDER BY NUMBER_POSTS DESC;";

        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //When
        int counter = 0;
        StringBuilder sb = new StringBuilder("Users with at least two posts: \n");
        while (rs.next()) {
            sb.append(rs.getString("U.FIRSTNAME") + " ");
            sb.append(rs.getString("U.LASTNAME") + " ");
            sb.append(rs.getInt(3) + "\n");
            counter++;
        }
        rs.close();
        statement.close();
        System.out.println(sb);

        //Then
        assertEquals(2, counter);
    }

}
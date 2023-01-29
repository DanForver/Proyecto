package org.example.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DatabaseConfiguration {

    private static Connection connection = null;

    private static DatabaseConfiguration databaseConfiguration = null;

    public static DatabaseConfiguration getInstance() {
        if (databaseConfiguration == null) {
            databaseConfiguration = new DatabaseConfiguration();
        }
        return databaseConfiguration;
    }


    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/init","root", "");

            if (connection != null) {
                System.out.println("Connected");
                return connection;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}

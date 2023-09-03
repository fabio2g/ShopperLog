package org.example.repository;

import org.example.config.PostgreSQLConnection;
import org.example.model.User;

import java.sql.Connection;

public abstract class UserRepository {
    private User user;
    private static Connection connection;

    private static void getConnection() {
        connection = PostgreSQLConnection.getConnection();
    }

    private static void closeConnection() {
        PostgreSQLConnection.closeConnection(connection);
    }

    public static void insertUser(User user) {
        getConnection();

        System.out.println(user.toString());

        closeConnection();
    }

}

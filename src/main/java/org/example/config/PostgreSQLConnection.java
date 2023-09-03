package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";

    public static java.sql.Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão com o PostgreSQL estabelecida com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao PostgreSQL: " + e.getMessage());
        }
        return connection;
    }

    public static void closeConnection(java.sql.Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexão com o PostgreSQL fechada com sucesso.");
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão com o PostgreSQL: " + e.getMessage());
            }
        }
    }
}

package org.example;

import org.example.config.PostgreSQLConnection;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Connection conn = PostgreSQLConnection.getConnection();

        PostgreSQLConnection.closeConnection(conn);
    }
}

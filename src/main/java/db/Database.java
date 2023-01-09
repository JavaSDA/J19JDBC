package db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public static Connection DbConn() {
        // Declare the connection outside the try/catch block to allow you
        // return it after the commands have been executed.

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://lallah.db.elephantsql.com/kvjvflty",
                    "kvjvflty",
                    "LBCTRzx4dB4VqCTHfesWE1tejO3dOVe4");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }

    public static Session getHibSesh() {
        Session session = null;

        try {
            SessionFactory seshFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

            session = seshFactory.openSession();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return session;
    }

}

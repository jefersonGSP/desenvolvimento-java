package test;

import controller.MyConnection;
import java.sql.SQLException;

public class TestMyConnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MyConnection.getConnection();
    }
}

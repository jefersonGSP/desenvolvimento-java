package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/tarefa5", //Caminho da base de dados
            "root", //Usuário do MySql
            "" //Senha do MySql
        );
        System.out.println("Conexão bem sucedida!");
        return conn;
    }
}

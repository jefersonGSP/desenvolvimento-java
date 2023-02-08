package model;

import controller.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
    private static Connection conn;
    
    public UserDAO() throws SQLException, ClassNotFoundException {
        conn = MyConnection.getConnection();
    }
    
    public void insertUser(User user) throws SQLException {
        String sql = "INSERT INTO user_table (user_name, user_pass) VALUES (?, ?)";
        PreparedStatement prep = conn.prepareStatement(sql);
        
        prep.setString(1, user.getUserName());
        prep.setString(2, user.getUserPass());
        
        prep.execute();
        prep.close();
        
        System.out.println("Usuário "+user.getUserName()+" cadastrado com sucesso!");
    }
    
     public void updateUser(User user) throws SQLException {
        String sql = "UPDATE user_table SET user_name = ?, user_pass = ?, imc = ?, result_imc = ? WHERE user_cod = ?";
        PreparedStatement prep = conn.prepareStatement(sql);
        
        prep.setString(1, user.getUserName());
        prep.setString(2, user.getUserPass());
        prep.setDouble(3, user.getImc());
        prep.setString(4, user.getResultImc());
        prep.setInt(5, user.getUserCod());
        
        prep.execute();
        prep.close();
        
        System.out.println("Usuário "+user.getUserCod()+" atualizado com sucesso!");
    }
     
    public void deleteUser(User user) throws SQLException {
        String sql = "DELETE FROM user_table WHERE user_cod = ?";
        PreparedStatement prep = conn.prepareStatement(sql);
        
        prep.setInt(1, user.getUserCod());
        
        prep.execute();
        prep.close();
        
        System.out.println("Usuário "+user.getUserCod()+" excluído com sucesso!");
    }
    
    public ArrayList<User> selectUser() throws SQLException {
        //Criação de uma lista de dados (vazia)
        ArrayList<User> listUser = new ArrayList<>();
        
        String sql = "SELECT * FROM user_table";
        PreparedStatement prep = conn.prepareStatement(sql);
        ResultSet result = prep.executeQuery();
        
        while(result.next()) {
            User user = new User();
            user.setUserCod(result.getInt("user_cod"));
            user.setUserName(result.getString("user_name"));
            user.setUserPass(result.getString("user_pass"));
            listUser.add(user);
        }
                
        prep.execute();
        prep.close();
        
        System.out.println("Lista criada com sucesso!");
        
        return listUser;
    }
    
    public User selectOneUser(int index) throws SQLException {        
        String sql = "SELECT * FROM user_table WHERE user_cod = ?";
        PreparedStatement prep = conn.prepareStatement(sql);
        
        prep.setInt(1, index);
        
        ResultSet result = prep.executeQuery();
        
        User user = new User();
        
        while(result.next()) {
            user.setUserCod(result.getInt("user_cod"));
            user.setUserName(result.getString("user_name"));
            user.setUserPass(result.getString("user_pass"));
            user.setImc(result.getDouble("imc"));
            user.setResultImc(result.getString("result_imc"));
        }
                
        prep.execute();
        prep.close();
        
        System.out.println("Seleção realizada com sucesso!");
        
        return user;
    }
}


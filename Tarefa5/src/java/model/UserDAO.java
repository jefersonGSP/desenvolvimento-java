
package model;

import controller.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class UserDAO {
    private static Connection conn;
    
    public UserDAO() throws ClassNotFoundException,SQLException {
    conn = MyConnection.getConnection();
    }
    public ArrayList<User> selectUser() throws SQLException {
      
        ArrayList<User> listUser = new ArrayList<>();
        
        String sql = "SELECT * FROM `user_table` WHERE id=2";
        PreparedStatement prep = conn.prepareStatement(sql);
        ResultSet result = prep.executeQuery();
        
        while(result.next()) {
         User user = new User();
        
           user.setId(result.getInt("id"));
           user.setEmail(result.getString("email"));
           user.setPassword(result.getString("password"));
           listUser.add(user);
         
        }
                
        prep.execute();
        prep.close();
        
        System.out.println("Lista criada com sucesso!");
        return listUser;
    }
    
    
}

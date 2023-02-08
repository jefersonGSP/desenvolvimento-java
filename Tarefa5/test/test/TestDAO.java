
package test;

import controller.MyConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.User;
import model.UserDAO;

public class TestDAO {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         MyConnection.getConnection();
        testUser();
      
    }
  
    public static void testUser() throws SQLException, ClassNotFoundException {
        UserDAO userDao = new UserDAO();
        ArrayList<User> listUser = userDao.selectUser();
        for(User user : listUser) {
            System.out.println(user);
        }
    }
    
  
}

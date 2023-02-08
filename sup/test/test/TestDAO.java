
package test;

import java.sql.SQLException;
import java.util.ArrayList;
import model.User;
import model.UserDAO;

public class TestDAO {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       // testInsert();
        //testUpdate();
        //testDelete();
        testSelect();
        //testSelectOne();
    }
    
    public static void testInsert() throws SQLException, ClassNotFoundException {
        User user = new User("Teste", "1234");
        UserDAO userDao = new UserDAO();
        userDao.insertUser(user);
    }
    
    public static void testUpdate() throws SQLException, ClassNotFoundException {
        User user = new User(4, "TesteUpdate", "5555");
        user.setImc(49.9);
        user.setResultImc("Nem lá nem cá...");
        UserDAO userDao = new UserDAO();
        userDao.updateUser(user);
    }
    
    public static void testDelete() throws SQLException, ClassNotFoundException {
        User user = new User(); //Criando objeto vazio
        user.setUserCod(1); //Informando um código
        UserDAO userDao = new UserDAO(); //Instanciando UserDAO
        userDao.deleteUser(user); //Incovando a função deleteUser();
    }
    
    public static void testSelect() throws SQLException, ClassNotFoundException {
        UserDAO userDao = new UserDAO();
        ArrayList<User> listUser = userDao.selectUser();
        for(User user : listUser) {
            System.out.println(user);
        }
    }
    
    public static void testSelectOne() throws SQLException, ClassNotFoundException {
        UserDAO userDao = new UserDAO();
        System.out.println(userDao.selectOneUser(4));
    }
}

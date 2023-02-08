package model;

import java.sql.SQLException;
import java.util.ArrayList;

public class User {
    private int userCod;
    private String userName;
    private String userPass;
    private String resultImc;
    private double imc;

    public User() {}
    
    public User(int userCod, String userName, String userPass) {
        this.userCod = userCod;
        this.userName = userName;
        this.userPass = userPass;
    }

    public User(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public double getImc() {
        return this.imc;
    }
    
    public void setImc(double imc) {
        this.imc = imc;
    }
    
    public String getResultImc() {
        return this.resultImc;
    }
    
    public void setResultImc(String resultImc) {
        this.resultImc = resultImc;
    }
    
    public int getUserCod() {
        return userCod;
    }

    public void setUserCod(int userCod) {
        this.userCod = userCod;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
        
    public boolean isLogged() throws SQLException, ClassNotFoundException {
        boolean test = false;
        UserDAO userDao = new UserDAO();
        ArrayList<User> listUser = userDao.selectUser();
        for(User user : listUser) {
            if(user.userName.equals(this.userName) && user.userPass.equals(this.userPass)) {
                test = true;
            }
        }
        return test;
    }
    
    @Override
    public String toString() {
        return   "ID: "+this.userCod+" NOME: "+this.userName+" IMC: "+this.imc+" LAUDO: "+this.resultImc;
    }
}

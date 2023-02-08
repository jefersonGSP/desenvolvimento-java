package model;

import java.util.ArrayList;

public class User {
    private String name;
    private String ip;
    static ArrayList<User> listaUser = new ArrayList<>();

    public static User userInstance = new User();
    
    public void setName(String name) {
        this.name = name;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
//    public User(String name, String ip) {
//        this.name = name;
//        this.ip = ip;
//    }    
    
    public String getName(){
        return this.name;
    }
    
    public String getIp(){
        return this.ip;
    }
    
    public User getListaUser(int i){
        return listaUser.get(i);
    }
        
    public void setListaUser(User user){
        listaUser.add(user);
    }
    
    public int listSize(){
        return listaUser.size();
    }
    
    public boolean deleteListaUser(int userId){
        listaUser.remove(userId);
        return true;
    }
    
    @Override
    public String toString() {
        return "Nome: "+ this.name +" | IP: "+ this.ip;
    }
}

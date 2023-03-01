package Models;

import java.util.Objects;

public class User {

//    private String name;
//    private String occupation;
//    private int siblings;
//    private double height;
//    private boolean married;
//
//    public User(String name, String occupation, int siblings,
//                double height, boolean married) {
//
//        this.name = name;
//        this.occupation = occupation;
//        this.siblings = siblings;
//        this.height = height;
//        this.married = married;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getOccupation() {
//        return occupation;
//    }
//
//    public void setOccupation(String occupation) {
//        this.occupation = occupation;
//    }
//
//    public int getSiblings() {
//        return siblings;
//    }
//
//    public void setSiblings(int siblings) {
//        this.siblings = siblings;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    public boolean isMarried() {
//        return married;
//    }
//
//    public void setMarried(boolean married) {
//        this.married = married;
//    }
//
//
//
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("User{");
//        sb.append("name='").append(name).append('\'');
//        sb.append(", occupation='").append(occupation).append('\'');
//        sb.append(", siblings=").append(siblings);
//        sb.append(", height=").append(height);
//        sb.append(", married=").append(married);
//        sb.append('}');
//        return sb.toString();
//    }
//
//
//}
    protected int Id;
    protected String Login;
    protected String Password;
   // public User(){}
    public User(String log,String pas){
        this.Id=0;
        this.Login=log;
        this.Password=pas;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("Id=").append(Id);
        sb.append(", Login='").append(Login).append('\'');
        sb.append(", Password='").append(Password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

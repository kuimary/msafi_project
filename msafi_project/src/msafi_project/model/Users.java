package msafi_project.model;

import java.util.Date;

public class Users{

private int id,identification_number;
private String date_of_birth;
private String user_name,password,full_name,email,residence,mobile_number;

    public Users(int identification_number, String date_of_birth, String user_name, String password, String full_name, String email, String residence, String mobile_number) {
        this.id = id;
        this.identification_number = identification_number;
        this.date_of_birth = date_of_birth;
        this.user_name = user_name;
        this.password = password;
        this.full_name = full_name;
        this.email = email;
        this.residence = residence;
        this.mobile_number = mobile_number;
    }

    public int getId() {
        return id;
    }

    public int getIdentification_number() {
        return identification_number;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getEmail() {
        return email;
    }

    public String getResidence() {
        return residence;
    }

    public String getMobile_number() {
        return mobile_number;
    }
        
     
           
}
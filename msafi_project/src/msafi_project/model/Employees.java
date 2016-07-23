package msafi_project.model;

import java.util.Date;

public class Employees{
    
private int id,identification_number,nok_identification_number;
private Date date_of_birth;
private String user_name,password,full_name,email,residence,mobile_numbe,nok_name,nok_mobile,nok_residence;

    public Employees( int identification_number, int nok_identification_number, Date date_of_birth, String user_name, String password, String full_name, String email, String residence, String mobile_numbe, String nok_name, String nok_mobile, String nok_residence) {
       
        this.identification_number = identification_number;
        this.nok_identification_number = nok_identification_number;
        this.date_of_birth = date_of_birth;
        this.user_name = user_name;
        this.password = password;
        this.full_name = full_name;
        this.email = email;
        this.residence = residence;
        this.mobile_numbe = mobile_numbe;
        this.nok_name = nok_name;
        this.nok_mobile = nok_mobile;
        this.nok_residence = nok_residence;
    }

    public int getId() {
        return id;
    }

    public int getIdentification_number() {
        return identification_number;
    }

    public int getNok_identification_number() {
        return nok_identification_number;
    }

    public Date getDate_of_birth() {
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

    public String getMobile_numbe() {
        return mobile_numbe;
    }

    public String getNok_name() {
        return nok_name;
    }

    public String getNok_mobile() {
        return nok_mobile;
    }

    public String getNok_residence() {
        return nok_residence;
    }
    
    
}
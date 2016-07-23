/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msafi_project;

import java.util.Date;
import msafi_project.model.Employees;
import msafi_project.model.Orders;
import msafi_project.model.Service;
import msafi_project.model.Users;

/**
 *
 * @author Mary
 */
public class Msafi_project {


// TESTING Employees
private static int identification_number=567889,nok_identification_number=65778;
private static Date date_of_birth=new Date();
private static String user_name="marykui",password="qwerty123",full_name="mary wangui",email="wmary2@gmail.com",residence="githurai",mobile_number="0733567809",nok_name="jacone keya",nok_mobile="0721567890",nok_residence="kasarani";

//TESTING Orders

    
    public static void main(String[] args) {
                // TODO code application logic here
        
        System.out.println("Welcome to Msafi");
  
            employee_data();
    
    }
        public static void employee_data(){
              
   Employees empl = new Employees( identification_number, nok_identification_number, date_of_birth,  user_name,  password,  full_name,  email,  residence,  mobile_number,  nok_name,  nok_mobile,  nok_residence);
   
   System.out.println(" ******** EMPLOYEE DATA ********** ");
   System.out.println("Identification Number:" + empl.getIdentification_number());
   System.out.println("NOK Identification Number:" + empl.getNok_identification_number());
   System.out.println("User name: " + empl.getUser_name());
   System.out.println("Password: " + empl.getPassword());
   System.out.println("Full name: " + empl.getFull_name());
   System.out.println("Email: " + empl.getEmail());
   System.out.println("Residence: " + empl.getResidence());
   System.out.println("Mobile Number: " + empl.getMobile_numbe());
   System.out.println("NOK Name: " + empl.getNok_name());
   System.out.println("NOK Mobile: " + empl.getNok_mobile());
   System.out.println("NOK Residence: " + empl.getNok_residence());
    
        
        
        }
       public static void orders_data(){
       
       } 
       public static void service_data(){
       
       } 
       public static void users_data(){
       
       } 
        
    }
    
 

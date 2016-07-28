/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msafi_project;

import java.util.Date;
import msafi_project.db.Connect;
import msafi_project.db.Create;
import msafi_project.model.Employees;
import msafi_project.model.Orders;
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
private static int order_id=321;
private static Date date_time=new Date();
private static String client_name="kelvin otunga",customer_name="james mbogo",order_name="laundry",price="2000ksh",client_residence="Kasarani";
private static boolean confirmed;

// TESTING Users
private static int id,user_identification_number=90748;
private static String user_date_of_birth="today";
private static String new_user_name="jacone keya",user_password="wtfbitch2",user_full_name="jack k sakwaa",user_email="jackqw@gmail.com",user_residence="roysambu",user_mobile_number="0724727999";




    
    public static void main(String[] args) {
                // TODO code application logic here
        
        System.out.println("Welcome to Msafi");
  
//            employee_data();
//            orders_data();
            Connect connect = new Connect();
           
        
         
//            new Create(connect.db_connect());
                        connect.close_connection();
    
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
        Orders ord = new Orders(order_id, date_time,client_name, customer_name,order_name,price,client_residence, confirmed);

        System.out.println("*********ORDER DATA*********");
        System.out.println("Order Id:" + ord.getOrder_id());
        System.out.println("Date & Time:" + ord.getDate_time());
        System.out.println("Client Name:" + ord.getClient_name());
        System.out.println("Employee Name:" + ord.getEmployee_name());
        System.out.println("Order Name:" + ord.getOrder_name());
        System.out.println("Price:" + ord.getPrice());
         System.out.println("Client Residence:" + ord.getResidence());
        System.out.println("Confirm Order" + ord.isConfirmed());

       } 
       public static void service_data(){
           
       
       } 
       public static void users_data(){
           Users use = new Users(user_identification_number,user_date_of_birth,new_user_name,user_password,user_full_name,user_email,user_residence,user_mobile_number);

       
       } 
        
    }
    
 

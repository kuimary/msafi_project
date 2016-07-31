package msafi_project.model;

import java.util.Date;

public class Orders{
    
private int order_id;
private String date_time;
private String client_name,Employee_name,order_name,price,residence;
private String confirmed;

    public Orders(int order_id, String date_time, String client_name, String Employee_name, String order_name, String price, String residence, String confirmed) {
        this.order_id = order_id;
        this.date_time = date_time;
        this.client_name = client_name;
        this.Employee_name = Employee_name;
        this.order_name = order_name;
        this.price = price;
        this.residence = residence;
        this.confirmed = confirmed;
    }

    public int getOrder_id() {
        return order_id;
    }

    public String getDate_time() {
        return date_time;
    }

    public String getClient_name() {
        return client_name;
    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public String getOrder_name() {
        return order_name;
    }

    public String getPrice() {
        return price;
    }

    public String getResidence() {
        return residence;
    }

    public String isConfirmed() {
        return confirmed;
    }




}
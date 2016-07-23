package msafi_project.model;

import java.util.Date;

public class Orders{
    
private int order_id;
private Date date_time;
private String client_name,customer_name,order_name,price,residence;
private boolean confirmed;

    public Orders(int order_id, Date date_time, String client_name, String customer_name, String order_name, String price, String residence, boolean confirmed) {
        this.order_id = order_id;
        this.date_time = date_time;
        this.client_name = client_name;
        this.customer_name = customer_name;
        this.order_name = order_name;
        this.price = price;
        this.residence = residence;
        this.confirmed = confirmed;
    }

    public int getOrder_id() {
        return order_id;
    }

    public Date getDate_time() {
        return date_time;
    }

    public String getClient_name() {
        return client_name;
    }

    public String getCustomer_name() {
        return customer_name;
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

    public boolean isConfirmed() {
        return confirmed;
    }




}
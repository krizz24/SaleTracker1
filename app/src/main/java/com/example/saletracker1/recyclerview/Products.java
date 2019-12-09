package com.example.saletracker1.recyclerview;

public class Products {

    protected int id;
    private String productName;
    private long rate;
    private int quantity;
    private String manufacturer;


    public void Products(int id, String productName,
                         long rate, int quantity,
                         String manufacturer ){
        this.id = id;
        this.productName = productName;
        this.rate = rate;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }
    public String getProductName(){
        return productName;
    }
    public long getRate() {
        return rate;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getManufacturer(){
        return manufacturer;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setRate(long rate) {
        this.rate = rate;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}

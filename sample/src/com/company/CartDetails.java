package com.company;

public class CartDetails
{
    private double rating;
    private String title;
    private String brand;
    private int price;


    public CartDetails(String title, String brand, int price, double rating){
        this.title = title;
        this.brand = brand;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle(){
        return title;
    }

    public String getBrand(){
        return brand;
    }

    public int getPrice(){
        return price;
    }

    public double getRating(){
        return rating;
    }
}

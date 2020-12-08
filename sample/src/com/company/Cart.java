package com.company;

public class Cart
{
    public String item;
    public double price;
    public int quantity;
    private double discount;
    public Cart()
    {
        System.out.println("constructor...........");
    }
    public double CostDetails(double price)
    {
        return price*quantity;
    }
    public void setDiscount(double discount)
    {
        this.discount=discount;
    }
    public double getDiscount()
    {
        return this.discount;
    }
}

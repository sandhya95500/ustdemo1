package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cart c = new Cart();
        c.item="a";
        c.quantity=5;
        double cost = c.CostDetails(200);
        System.out.println(cost);
        if(cost>1500) {
          c.setDiscount(0.1*cost);
        }
    }
}

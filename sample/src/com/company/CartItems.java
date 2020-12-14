package com.company;
import java.util.Scanner;
public interface CartItems
{
    Scanner sc = new Scanner(System.in);
    public static void select()
    {
        System.out.println("Category : 1.Mobiles  2.Electronics");
        String category = sc.nextLine().toLowerCase();

        if(category.equals("mobiles"))
        {
            new CartView().mobile();
        }

        else if(category.equals("electronics"))
        {
            new CartView().electronics();
        }
        else
            System.out.println("Sorry, Not found");
    }
}

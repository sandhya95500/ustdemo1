package com.company;
import java.util.Scanner;
public class TaxConsole
{
    private static Scanner sc = new Scanner(System.in);

    public static double readTax(String prompt)
    {
        double value;
        while (true)
        {
            System.out.println(prompt);
            value = sc.nextFloat();
            if (value < 500000)
            {
                System.out.println("No need to pay insurance");
                break;
            }
            else
                System.out.println("Need to pay insurance");
            break;
        }
        return value;
    }
}

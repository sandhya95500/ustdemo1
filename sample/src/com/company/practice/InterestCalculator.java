package com.company.practice;

public class InterestCalculator
{
      public static void main(String[] args)
        {
            Interest i1 = new Interest(5000.0,5,3);
            System.out.println(i1.getInterest());
            Simple s = new Simple(6000,2,1);
            System.out.println(s.getInterest());
            System.out.println(((IInterest)s).getInterest());
        }
        private static void print(double interest)
        {
            System.out.println(String.format("",interest));
        }
}



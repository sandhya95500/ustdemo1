package com.company.practice;

public class Simple extends Interest implements IInterest
{
        public Simple(double principal,double rate,double years)
        {
            super(principal,years,rate);
        }
       public double getInterest()
        {
            return super.getInterest() / 100.0;
        }


}

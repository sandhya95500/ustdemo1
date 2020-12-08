package com.company.practice;

public class Interest
{
        double principal,rate,years;
        public Interest(double principal,double rate,double years)
        {
            this.principal = principal;
            this.rate = rate;
            this.years = years;
        }
        double getInterest()
        {
            return principal*rate*years;
        }


}

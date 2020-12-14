package com.company;

public class MortgageCalcRefractor
{
    public static void main(String[] args){

        int principal =(int) MainClass.readNumber("Principal:",1000,1000000);
        float annualInterest = (float) MainClass.readNumber("Annual Interest Rate:",1,30);
        byte years = (byte) MainClass.readNumber("Period (Years)",1,30);

        var calculator = new MortgageCalculator(principal,annualInterest,years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();

    }

}

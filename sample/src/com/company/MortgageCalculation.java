package com.company;

public interface MortgageCalculation
{
    double calculateBalance(
            short numberOfPaymentsMade
    );

    double calculateMortgage();

    double[] getRemainingBalance();
}

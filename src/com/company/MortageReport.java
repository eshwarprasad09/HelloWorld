package com.company;

import java.text.NumberFormat;

public class MortageReport {
    private final NumberFormat currency;
    private  MortageCalculator calculator;

    public MortageReport(MortageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        // calculate the mortgage value
        double mortgage = calculator.calculateMortgage();

        System.out.println("\nMORTGAGE \n----------");
        System.out.println("Monthly Payments: " + currency.format(mortgage));
    }

    public void printPaymentSchedule() {
        System.out.println("\nPAYMENT SCHEDULE \n------------");
        for (double remainingBalance: calculator.getRemainingBalances())
            System.out.println(currency.format(remainingBalance));
    }
}

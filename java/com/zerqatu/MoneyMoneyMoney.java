/*
Money, Money, Money (7 kyu)
https://www.codewars.com/kata/563f037412e5ada593000114

Mr. Scrooge has a sum of money 'P' that he wants to invest.
Before he does, he wants to know how many years 'Y' this sum 'P' has to be kept in the bank in order for it to amount to a desired sum of money 'D'.
The sum is kept for 'Y' years in the bank where interest 'I' is paid yearly.
After paying taxes 'T' for the year the new sum is re-invested.
Note to Tax: not the invested principal is taxed, but only the year's accrued interest

Your task is to complete the method provided and return the number of years 'Y' as a whole in order for Mr. Scrooge to get the desired sum.
*/

package com.zerqatu;

public class MoneyMoneyMoney {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int years = 0;
        double currentMoney = principal;
        while (currentMoney < desired) {
            double yearlyInterest = currentMoney * interest;
            double yearlyTax = yearlyInterest * tax;
            currentMoney += yearlyInterest - yearlyTax;
            years++;
        }
        return years;
    }
}

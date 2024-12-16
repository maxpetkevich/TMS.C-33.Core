package lesson6.homework;

import java.util.Scanner;

public class CreditCard {
    int accountNumber;
    double currentBalance;

    public CreditCard(int accountNumber, double currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }
public static Scanner getInput(){
        return new Scanner(System.in);
}

    public void depositCurrentBalance() {
        System.out.print("Enter the amount you want to put on the card: ");
        double amount = getInput().nextDouble();
        currentBalance += amount;
    }
    public void withdrawCurrentBalance() {
        System.out.print("Enter the amount you want to withdraw from the card: ");
        double amount = getInput().nextDouble();
        currentBalance -= amount;
    }
    @Override
    public String toString(){
        return "Account number: " + this.accountNumber + "\n" +
                "Current balance on your card: " + this.currentBalance + "\n" +
                "------------------------------------------";
    }
    }

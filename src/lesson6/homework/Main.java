package lesson6.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("Choose task: ");
            System.out.println("1. Task 1: create credit card");
            System.out.println("2. Task 2: create ATM");
            System.out.println("3. Exit");
            int choose = getInput().nextInt();
            switch (choose){
                case 1: getCreditCard();
                break;
                case 2: getATM();
                break;
                case 3: return;
                default:
                    System.out.println("Error");
            }
        }
    }
    public static Scanner getInput(){
        return new Scanner(System.in);
    }
    public static void getCreditCard(){

        CreditCard cardOne = new CreditCard(10001, 100.5);
        CreditCard cardTwo = new CreditCard(10002, 200);
        CreditCard cardThree = new CreditCard(10003, 300.8);
        while(true) {
            System.out.println("Menu:");
            System.out.println("1.Check info about all cards");
            System.out.println("2.Put money on the card 1");
            System.out.println("3.Put money on the card 2");
            System.out.println("4.Put money on the card 3");
            System.out.println("5.Withdraw money from the card 1");
            System.out.println("6.Withdraw money from the card 2");
            System.out.println("7.Withdraw money from the card 3");
            System.out.println("8.Exit from task");
            int choose = getInput().nextInt();

            switch (choose) {
                case 1:
                    System.out.println(cardOne);
                    System.out.println(cardTwo);
                    System.out.println(cardThree);
                    break;
                case 2:
                    cardOne.depositCurrentBalance();
                    break;
                case 3:
                    cardTwo.depositCurrentBalance();
                    break;
                case 4:
                    cardThree.depositCurrentBalance();
                    break;
                case 5:
                    cardOne.withdrawCurrentBalance();
                    break;
                case 6:
                    cardTwo.withdrawCurrentBalance();
                    break;
                case 7:
                    cardThree.withdrawCurrentBalance();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Error");
            }
        }


    }
    public static void getATM(){
        ATM ATM1 = new ATM(5,2,5);
        System.out.println(ATM1);
        ATM1.addMoney(5, 6, 5);
        System.out.println(ATM1);

        ATM1.withdrawMoney(370);
    }
}

package lesson6.homework;

public class ATM {
    int banknoteTwenty;
    int banknoteFifty;
    int banknoteOneHundred;

    public ATM(int banknoteOneHundred, int banknoteFifty, int banknoteTwenty) {
        this.banknoteOneHundred = banknoteOneHundred;
        this.banknoteFifty = banknoteFifty;
        this.banknoteTwenty = banknoteTwenty;
    }

    public void addMoney(int banknoteTwenty, int banknoteFifty, int banknoteOneHundred) {
        this.banknoteOneHundred += banknoteOneHundred;
        this.banknoteFifty += banknoteFifty;
        this.banknoteTwenty += banknoteTwenty;
        System.out.println("Banknote's was be added");
    }

    public boolean withdrawMoney(int amount) {
        System.out.println("Your withdrawal amount: " + amount);
               int banknote100 = amount / 100;
                if (banknote100 > this.banknoteOneHundred) {
                    banknote100 = this.banknoteOneHundred;

                }
                amount -= banknote100 * 100;

            int banknote50 = amount / 50;
            if (amount % 50 == 0 || amount % 50 == 20 || amount%50==40){
                if (banknote50 > this.banknoteFifty) {
                    banknote50 = this.banknoteFifty;
                }
                amount -= banknote50 * 50;
            }
         int banknote20 = amount / 20;
            if (amount % 20 == 0) {
                banknote20 = amount / 20;
                if (banknote20 > this.banknoteTwenty) {
                    banknote20 = this.banknoteTwenty;
                }
                amount -= banknote20 * 20;
            }
            if (amount == 0) {
                this.banknoteOneHundred -= banknote100;
                this.banknoteFifty -= banknote50;
                this.banknoteTwenty -= banknote20;
                System.out.println("The operation was successful");
                System.out.println("Issued in denomination 100: " + banknote100);
                System.out.println("Issued in denomination 50: " + banknote50);
                System.out.println("Issued in denomination 20: " + banknote20);
                return true;
            } else {
                System.out.println("The operation was not successful");
                System.out.println("Not enough banknotes");
                return false;
            }
        }

        @Override
        public String toString () {
            return "Count of banknote's in ATM: " + "\n" +
                    "Count of banknote 100 = " + banknoteOneHundred + "\n" +
                    "Count of banknote 50 = " + banknoteFifty + "\n" +
                    "Count of banknote 20 = " + banknoteTwenty + "\n" +
                    "--------------------------------";

        }

    }


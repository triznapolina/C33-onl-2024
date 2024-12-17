package lesson_6_oop_basic_homework;

import java.util.Scanner;

public class ATM {

    private int amountOfSetInTwenty;
    private int amountOfSetInFifty;
    private int amountOfSetInHundred;

    //constructor
    public ATM(int amountOfSetInTwenty, int amountOfSetInFifty, int amountOfSetInHundred) {
        this.amountOfSetInTwenty = amountOfSetInTwenty;
        this.amountOfSetInFifty = amountOfSetInFifty;
        this.amountOfSetInHundred = amountOfSetInHundred;
    }

    // method of adding
    public void addingMoney() {

        boolean isRunning = true;
        while (isRunning) {

            System.out.println("Choose banknote: 20, 50 or 100? \n0 enter for exit ");
            int input = new Scanner(System.in).nextInt();
            switch (input) {
                case 20:
                    System.out.println("What sum do you want to add? ");
                    int addAmountTwenty = new Scanner(System.in).nextInt();
                    System.out.println("Enter amount of 20: " + amountOfSetInTwenty);
                    int amountValueTwenty = addAmountTwenty / 20;
                    amountOfSetInTwenty += amountValueTwenty;
                    System.out.println("New amount of 20: " + amountOfSetInTwenty);
                    break;
                case 50:
                    System.out.println("What sum do you want to add? ");
                    int addAmountFifty = new Scanner(System.in).nextInt();
                    System.out.println("Enter amount of 50: " + amountOfSetInFifty);
                    int amountValueFifty = addAmountFifty / 50;
                    amountOfSetInFifty += amountValueFifty;
                    System.out.println("New amount of 50: " + amountOfSetInFifty);
                    break;
                case 100:
                    System.out.println("What sum do you want to add? ");
                    int addAmountHundred = new Scanner(System.in).nextInt();
                    System.out.println("Enter amount of 100: " + amountOfSetInHundred);
                    int amountValueHundred = addAmountHundred / 100;
                    amountOfSetInHundred += amountValueHundred;
                    System.out.println("New amount of 100: " + amountOfSetInHundred);
                    break;
                case 0:
                    isRunning = false;
                    System.out.println("Exit.......");
                    break;
                default:
                    System.out.println("Sorry we don't have such banknote...");
                    break;
            }

        }
    }

    // boolean method of withdrawing
    public boolean withdrawMoney(int amount) {
        if (amount % 10 == 0) {
            if (amount < 100) {
                if (amount % 20 == 0) {
                    int amountValue = amount / 20;
                    if (amountValue <= amountOfSetInTwenty) {
                        amountOfSetInTwenty -= amountValue;
                        System.out.println("Taken " + amountValue + " in amount of 20 banknotes");
                        return true;
                    } else {
                        System.out.println("Not enough 20$ banknotes");
                        return false;
                    }
                } else if (amount % 50 == 0) {
                    int amountValue = amount / 50;
                    if (amountValue <= amountOfSetInFifty) {
                        amountOfSetInFifty -= amountValue;
                        System.out.println("Taken " + amountValue + " in amount of 50 banknotes");
                        return true;
                    } else {
                        System.out.println("Not enough 50$ banknotes");
                        return false;
                    }
                } else {
                    System.out.println("Operation has not been completed...\nATM has banknotes in " +
                            "denominations of 20, 50 and 100 \nTry withdrawing money in parts...");
                    return false;
                }
            } else {
                if (amount % 100 == 0) {
                    int amountValue = amount / 100;
                    if (amountValue <= amountOfSetInHundred) {
                        amountOfSetInHundred -= amountValue;
                        System.out.println("Taken " + amountValue + " in amount of 100 banknotes");
                        return true;
                    } else {
                        System.out.println("Not enough 100$ banknotes");
                        return false;
                    }
                } else if (amount % 20 == 0) {
                    int amountValue = amount / 20;
                    if (amountValue <= amountOfSetInTwenty) {
                        amountOfSetInTwenty -= amountValue;
                        System.out.println("Taken " + amountValue + " in amount of 20 banknotes");
                        return true;
                    } else {
                        System.out.println("Not enough 20$ banknotes");
                        return false;
                    }
                } else if (amount % 50 == 0) {
                    int amountValue = amount / 50;
                    if (amountValue <= amountOfSetInFifty) {
                        amountOfSetInFifty -= amountValue;
                        System.out.println("Taken " + amountValue + " in amount of 50 banknotes");
                        return true;
                    } else {
                        System.out.println("Not enough 50$ banknotes");
                        return false;
                    }
                } else {
                    System.out.println("Operation has not been completed...\nATM has banknotes in denominations of 20, " +
                            "50 and 100 \nTry withdrawing money in parts...");
                    return false;
                }
            }
        } else {
            System.out.println("Operation has not been completed...\nATM has banknotes in denominations of 20, 50 and " +
                    "100 \nTry withdrawing money in parts...");
            return false;
        }
    }

    // method of total sum of money
    public int setTheTotalAmount() {
        return amountOfSetInTwenty * 20 + amountOfSetInFifty * 50 + amountOfSetInHundred * 100;
    }

    public static void main(String[] args) {

        ATM atm = new ATM(20, 30, 55);
        boolean isRunning = true;
        while (isRunning) {

            System.out.println("---------------------------------------------");
            System.out.println("Choose operations:\n 1 - show information \n 2 - add money \n 3 - withdraw money");
            int input = new Scanner(System.in).nextInt();

            switch (input) {
                case 1: System.out.println("--------------Information About--------------");
                    System.out.println("Current amount: " + atm.setTheTotalAmount() +
                            "\nAmount of 20 banknote: " + atm.amountOfSetInTwenty + "\nAmount of 50 banknote: "
                            + atm.amountOfSetInFifty + "\nAmount of 100 banknote: " + atm.amountOfSetInHundred);
                    break;
                case 2: System.out.println("--------------Adding money--------------");
                    System.out.println("Current amount: " + atm.setTheTotalAmount());
                    atm.addingMoney();
                    break;
                case 3: System.out.println("--------------Withdrawing money--------------");
                    System.out.println("Current amount: " + atm.setTheTotalAmount());
                    System.out.println("What amount do you want to withdraw? ");
                    int withdrawAmount = new Scanner(System.in).nextInt();
                    atm.withdrawMoney(withdrawAmount);
                    break;
                default:
                    isRunning = false;
                    System.out.println("Exit....");
                    break;
            }

        }

    }

}







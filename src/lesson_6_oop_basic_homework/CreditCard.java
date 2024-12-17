package lesson_6_oop_basic_homework;


public class CreditCard {

    // class fields or variables
    public String accountNumber;
    public double amountAccount;

    // constructor to initialize objects
    public CreditCard(String accountNumber, double amountAccount) {
        this.accountNumber = accountNumber;
        this.amountAccount = amountAccount;
    }

    // method, adding the amount
    public void addMoney (double someAmount) {
        System.out.println("--------------Adding money--------------\n" + "Card: " + accountNumber);
        System.out.println("Initial amount is " + amountAccount);
        this.amountAccount += someAmount;
        System.out.println("Adding "+ someAmount + "...");
        System.out.println("Result is "+ amountAccount);
    }

    // method, withdrawing the amount
    public void withdrawMoney (double someAmount) {
        System.out.println("----------Withdrawing money-----------\n" + "Card: " + accountNumber);
        System.out.println("Initial amount is " + amountAccount);
        this.amountAccount -= someAmount;
        System.out.println("Withdraw " + someAmount + "...");
        System.out.println("Result is " + amountAccount);

    }

    // method, getting card's information
    public void setInformationAboutCard (){
        System.out.println("---------------------------------------------");
        System.out.println("The number account card: " + accountNumber + "\nThe amount of money: " + amountAccount);
    }

    public static void main(String[] args) {

        // Creating three objects
        CreditCard firstNumberCard = new CreditCard("0000-2564-5265-2516",250.62);
        CreditCard secondNumberCard = new CreditCard("89546-5895-0125-2356", 111.17);
        CreditCard thirdNumberCard = new CreditCard("2564-0000-25648-0215", 1458.02);

        // operation with money
        firstNumberCard.addMoney(25.52);
        secondNumberCard.addMoney(13.4);
        thirdNumberCard.withdrawMoney(5.82);

        // get current card's information
        firstNumberCard.setInformationAboutCard();
        secondNumberCard.setInformationAboutCard();
        thirdNumberCard.setInformationAboutCard();


    }


}

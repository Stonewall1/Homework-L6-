package Task1;

public class Main {
    public static void main(String[] args) {
        CreditCard SilverCard = new CreditCard("YT2244UJ" , 2500);
        CreditCard GoldenCard = new CreditCard("5455JH" , 5000);
        CreditCard BlackCard = new CreditCard("XXX777X" , 100000);

        //Current balance on cards
        System.out.println("SilverCard balance = " + SilverCard.accountMoney + "\n" +
                           "GoldenCard balance = " + GoldenCard.accountMoney + "\n" +
                           "SilverCard balance = " + BlackCard.accountMoney);
        //Adding money on cards 1 and 2 and removing from third
        SilverCard.accountMoneyAddition(1500);
        GoldenCard.accountMoneyAddition(3000);
        BlackCard.setAccountMoneyRemoval(20000);
        //Current status
        System.out.println("Current balance");
        System.out.println("SilverCard " + SilverCard.accountNumber + " balance: " + SilverCard.accountMoney + "\n" +
                           "GoldenCard " + GoldenCard.accountNumber + " balance: " + GoldenCard.accountMoney + "\n" +
                           "BlackCard " + BlackCard.accountNumber + " balance: " + BlackCard.accountMoney + "\n");
    }
}

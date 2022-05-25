package Task1;

public class CreditCard {
    String accountNumber;
    double accountMoney;

    public CreditCard(String accountNumber, double accountMoney) {
        this.accountNumber = accountNumber;
        this.accountMoney = accountMoney;
    }

    public void accountMoneyAddition(double moneyAddition){
        this.accountMoney = this.accountMoney + moneyAddition;
    }
    public void setAccountMoneyRemoval(double moneyRemoval){
        this.accountMoney = this.accountMoney - moneyRemoval;
    }

}

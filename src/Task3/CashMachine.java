package Task3;

public class CashMachine {
    int denomination20Amount;
    int denomination50Amount;
    int denomination100Amount;

    public CashMachine(int denomination20, int denomination50, int denomination100) {
        this.denomination20Amount = denomination20;
        this.denomination50Amount = denomination50;
        this.denomination100Amount = denomination100;
    }

    public void cashMachineMoneyAddition(int d20 , int d50 , int d100){
        this.denomination20Amount = this.denomination20Amount + d20;
        this.denomination50Amount = this.denomination50Amount + d50;
        this.denomination100Amount = this.denomination100Amount + d100;
    }
    public void cashMachineMoneyRetrieving(int d20 , int d50 , int d100){
        this.denomination20Amount = this.denomination20Amount - d20;
        this.denomination50Amount = this.denomination50Amount - d50;
        this.denomination100Amount = this.denomination100Amount - d100;
    }
    public int currentATMMoney(){
        return this.denomination20Amount*20 + this.denomination50Amount*50 + this.denomination100Amount*100;
    }
    public void beingRobbed(){
        this.denomination20Amount = 0;
        this.denomination50Amount = 0;
        this.denomination100Amount = 0;
    }
}

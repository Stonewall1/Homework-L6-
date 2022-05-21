package Task3;

public class CashMachine {
    int denomination10Amount;
    int denomination20Amount;
    int denomination50Amount;
    int denomination100Amount;


    public CashMachine(int denomination10 , int denomination20, int denomination50, int denomination100) {
        this.denomination10Amount = denomination10;
        this.denomination20Amount = denomination20;
        this.denomination50Amount = denomination50;
        this.denomination100Amount = denomination100;
    }

    public void cashMachineMoneyAddition(int denomination){
        if(denomination == 10){
            this.denomination10Amount = this.denomination10Amount + 1;
        }
        else if(denomination == 20){
            this.denomination20Amount = this.denomination20Amount + 1;
        }
        else if(denomination == 50){
            this.denomination50Amount = this.denomination50Amount + 1;
        }
        else if(denomination == 100){
            this.denomination100Amount = this.denomination100Amount + 1;
        }
        else{
            System.out.println("ATM is not working with that denomination");
        }
    }
    public void cashMachineMoneyRetrieving(int money){ //670
       int sum = this.denomination10Amount*10 + this.denomination20Amount*20 + this.denomination50Amount*50 + this.denomination100Amount*100;
       if(money <= sum){
          while(money != 0){
              int hundreds = money / 100; //6
              if(hundreds <= this.denomination100Amount) {
                  this.denomination100Amount = this.denomination100Amount - hundreds;
                  money = money - hundreds*100;
              }
              else{
                  money = money - this.denomination100Amount*100; //470
                  this.denomination100Amount = 0;
              }
              int fiftys = money / 50; //9
              if(fiftys <= this.denomination50Amount) {
                  this.denomination50Amount = this.denomination50Amount - fiftys;
                  money = money - fiftys*50;//20
              }
              else{
                  money = money - this.denomination50Amount*50;
                  this.denomination50Amount = 0;
              }
              int twentys = money / 20;//1
              if(twentys <= this.denomination20Amount) {
                  this.denomination20Amount = this.denomination20Amount - twentys;
                  money = money - twentys*20; //0
              }
              else{
                  money = money - this.denomination20Amount*20;
                  this.denomination20Amount = 0;
              }
              int tens = money / 10;
              if(tens <= this.denomination10Amount) {
                  this.denomination10Amount = this.denomination10Amount - tens;
                  money = money - tens*10; //0
              }
              else{
                  money = money - this.denomination10Amount*10;
                  this.denomination10Amount = 0;
              }
          }
       }
       else{
           System.out.println("ATM dont have so much money");
       }
    }
    public int currentATMMoney(){
        return this.denomination10Amount*10 + this.denomination20Amount*20 + this.denomination50Amount*50 + this.denomination100Amount*100;
    }

}

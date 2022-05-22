package Task3;

import java.util.Scanner;

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
    public void cashMachineMoneyRetrieving(int money){
       int sum = this.denomination10Amount*10 + this.denomination20Amount*20 + this.denomination50Amount*50 + this.denomination100Amount*100;
       if(money <= sum){
          while(money != 0){
              int hundreds = money / 100;
              if(hundreds <= this.denomination100Amount) {
                  this.denomination100Amount = this.denomination100Amount - hundreds;
                  money = money - hundreds*100;
              }
              else{
                  money = money - this.denomination100Amount*100;
                  this.denomination100Amount = 0;
              }
              int fiftys = money / 50;
              if(fiftys <= this.denomination50Amount) {
                  this.denomination50Amount = this.denomination50Amount - fiftys;
                  money = money - fiftys*50;
              }
              else{
                  money = money - this.denomination50Amount*50;
                  this.denomination50Amount = 0;
              }
              int twentys = money / 20;
              if(twentys <= this.denomination20Amount) {
                  this.denomination20Amount = this.denomination20Amount - twentys;
                  money = money - twentys*20;
              }
              else{
                  money = money - this.denomination20Amount*20;
                  this.denomination20Amount = 0;
              }
              int tens = money / 10;
              if(tens <= this.denomination10Amount) {
                  this.denomination10Amount = this.denomination10Amount - tens;
                  money = money - tens*10;
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
    public void advancedCashMachineMoneyRetrieving(int money){
        int sum = this.denomination10Amount*10 + this.denomination20Amount*20 + this.denomination50Amount*50 + this.denomination100Amount*100;
        if(money <= sum){
            int hundreds = money / 100;
            int fiftys = money / 50;
            int twentys = money / 20;
            int tens = money / 10;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose one variant from available");

            String variant1;
            if(tens <= denomination10Amount){
                variant1 = (tens + "") + "*10";
                System.out.println("variant1=" + variant1);
            }
            String variant2;
            if(twentys <= denomination20Amount){
                if(money%20 == 0){
                    variant2 = (twentys + "") + "*20";
                    System.out.println("variant2=" + variant2);
                }
                 else if(denomination10Amount > 0){
                    variant2 = (twentys + "") + "*20" + "+" + "1*10";
                    System.out.println("variant2=" + variant2);
                }
            }
            String variant3;
            if(fiftys <= denomination50Amount){
                if(money%50 == 0){
                    variant3 = (fiftys + "") + "*50";
                    System.out.println("variant3=" + variant3);
                }
                else if(money%50 == 10){
                    if(denomination10Amount > 0){
                        variant3 = (fiftys + "") + "*50" + "+" + "1*10";
                        System.out.println("variant3=" + variant3);
                    }
                }
                else if(money%50 == 20){
                    if(denomination20Amount > 0){
                        variant3 = (fiftys + "") + "*50" + "+" + "1*20";
                        System.out.println("variant3=" + variant3);
                    }
                    else if(denomination10Amount > 1){
                        variant3 = (fiftys + "") + "*50" + "+" + "2*10";
                        System.out.println("variant3=" + variant3);
                    }
                }
                else if(money%50 == 30){
                    if(denomination20Amount > 0 && denomination10Amount > 0){
                        variant3 = (fiftys + "") + "*50" + "+" + "1*20" + "+" + "1*10";
                        System.out.println("variant3=" + variant3);
                    }
                }
                else if(money%50 == 40){
                    if(denomination20Amount > 1){
                        variant3 = (fiftys + "") + "*50" + "+" + "2*20";
                        System.out.println("variant3=" + variant3);
                    }
                    else if(denomination20Amount == 1 && denomination10Amount > 1){
                        variant3 = (fiftys + "") + "*50" + "+" + "1*20" + "+" + "2*10";
                        System.out.println("variant3=" + variant3);
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 3){
                        variant3 = (fiftys + "") + "*50" + "+" + "4*10";
                        System.out.println("variant3=" + variant3);
                    }
                }
            }
            String variant4;
            if(hundreds <= denomination100Amount){
                if(money%100 == 0){
                    variant4 = (hundreds + "") + "*100";
                    System.out.println("variant4=" + variant4);
                }
                else if(money%100 == 10){
                    if(denomination10Amount > 0){
                        variant4 = (hundreds + "") + "*100" + "+" + "1*10";
                        System.out.println("variant4=" + variant4);
                    }
                }
                else if(money%100 == 20){
                    if(denomination20Amount > 0){
                        variant4 = (hundreds + "") + "*100" + "+" + "1*20";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination10Amount > 1){
                        variant4 = (hundreds + "") + "*100" + "+" + "2*10";
                        System.out.println("variant4=" + variant4);
                    }
                }
                else if(money%100 == 30){
                    if(denomination20Amount > 0 && denomination10Amount > 0){
                        variant4 = (hundreds + "") + "*100" + "+" + "1*20" + "+" + "1*10";
                        System.out.println("variant4=" + variant4);
                    }
                }
                else if(money%100 == 40){
                    if(denomination20Amount > 1){
                        variant4 = (hundreds + "") + "*100" + "+" + "2*20";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination20Amount == 1 && denomination10Amount > 1){
                        variant4 = (hundreds + "") + "*100" + "+" + "1*20" + "+" + "2*10";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 3){
                        variant4 = (hundreds + "") + "*100" + "+" + "4*10";
                        System.out.println("variant4=" + variant4);
                    }
                }
                else if(money%100 == 50){
                    if(denomination50Amount > 0){
                        variant4 = (hundreds + "") + "*100" + "+" + "1*50";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination20Amount > 1 && denomination10Amount > 0){
                        variant4 = (hundreds + "") + "*100" + "+" + "2*20" + "+" + "1*10";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 4){
                        variant4 = (hundreds + "") + "*100" + "+" + "5*10";
                        System.out.println("variant4=" + variant4);
                    }
                }
                else if(money%100 == 60){
                    if(denomination50Amount > 0 && denomination10Amount > 0){
                        variant4 = (hundreds + "") + "*100" + "+" + "1*50" + "+" + "1*10";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination20Amount > 2){
                        variant4 = (hundreds + "") + "*100" + "+" + "3*20";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 5){
                        variant4 = (hundreds + "") + "*100" + "+" + "6*10";
                        System.out.println("variant4=" + variant4);
                    }
                }
                else if(money%100 == 70){
                    if(denomination50Amount > 0 && denomination20Amount > 0){
                        variant4 = (hundreds + "") + "*100" + "+" + "1*50" + "+" + "1*20";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination20Amount > 2 && denomination10Amount > 0){
                        variant4 = (hundreds + "") + "*100" + "+" + "3*20" + "+" + "1*10";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 6){
                        variant4 = (hundreds + "") + "*100" + "+" + "7*10";
                        System.out.println("variant4=" + variant4);
                    }
                }
                else if(money%100 == 80){
                    if(denomination50Amount > 0 && denomination20Amount > 0 && denomination10Amount > 0){
                        variant4 = (hundreds + "") + "*100" + "+" + "1*50" + "+" + "1*20" + "+" + "1*10";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination20Amount > 3){
                        variant4 = (hundreds + "") + "*100" + "+" + "4*20";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 7){
                        variant4 = (hundreds + "") + "*100" + "+" + "8*10";
                        System.out.println("variant4=" + variant4);
                    }
                }
                else if(money%100 == 90){
                    if(denomination50Amount > 0 && denomination20Amount > 1){
                        variant4 = (hundreds + "") + "*100" + "+" + "1*50" + "+" + "2*20";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination20Amount > 3 && denomination10Amount > 0){
                        variant4 = (hundreds + "") + "*100" + "+" + "4*20" + "+" + "1*10";
                        System.out.println("variant4=" + variant4);
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 8){
                        variant4 = (hundreds + "") + "*100" + "+" + "9*10";
                        System.out.println("variant4=" + variant4);
                    }
                }
            }

            String answer = scanner.nextLine();
            if(answer.equals("variant1")){
                this.denomination10Amount = this.denomination10Amount - tens;
            }
            else if(answer.equals("variant2")){
                this.denomination20Amount = this.denomination20Amount - twentys;
                if(money%20 != 0){
                    this.denomination10Amount = this.denomination10Amount - 1;
                }
            }
            else if(answer.equals("variant3")){
                this.denomination50Amount = this.denomination50Amount - fiftys;
                if(money%50 == 10){
                    this.denomination10Amount = this.denomination10Amount - 1;
                }
                else if(money%50 == 20){
                    if(denomination20Amount > 0){
                        this.denomination20Amount = this.denomination20Amount - 1;
                    }
                    else if(denomination10Amount > 1){
                        this.denomination10Amount = this.denomination10Amount - 2;
                    }
                }
                else if(money%50 == 30){
                    if(denomination20Amount > 0 && denomination10Amount > 0){
                        this.denomination20Amount = this.denomination20Amount - 1;
                        this.denomination10Amount = this.denomination10Amount - 1;
                    }
                }
                else if(money%50 == 40){
                    if(denomination20Amount > 1){
                        this.denomination20Amount = this.denomination20Amount - 2;
                    }
                    else if(denomination20Amount == 1 && denomination10Amount > 1){
                        this.denomination20Amount = 0;
                        this.denomination10Amount = this.denomination10Amount - 2;
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 3){
                        this.denomination10Amount = this.denomination10Amount - 4;
                    }
                }
            }
            else if(answer.equals("variant4")){
                this.denomination100Amount = this.denomination100Amount - hundreds;
                if(money%100 == 10){
                    this.denomination10Amount = this.denomination10Amount - 1;
                }
                else if(money%100 == 20){
                    if(denomination20Amount > 0){
                        this.denomination20Amount = this.denomination20Amount - 1;
                    }
                    else if(denomination10Amount > 1){
                        this.denomination10Amount = this.denomination10Amount - 2;
                    }
                }
                else if(money%100 == 30){
                    if(denomination20Amount > 0 && denomination10Amount > 0){
                        this.denomination20Amount = this.denomination20Amount - 1;
                        this.denomination10Amount = this.denomination10Amount - 1;
                    }
                }
                else if(money%100 == 40){
                    if(denomination20Amount > 1){
                        this.denomination20Amount = this.denomination20Amount - 2;
                    }
                    else if(denomination20Amount == 1 && denomination10Amount > 1){
                        this.denomination20Amount = 0;
                        this.denomination10Amount = this.denomination10Amount - 2;
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 3){
                        this.denomination10Amount = this.denomination10Amount - 4;
                    }
                }
                else if(money%100 == 50){
                    if(denomination50Amount > 0){
                        this.denomination50Amount = this.denomination50Amount - 1;
                    }
                    else if(denomination20Amount > 1 && denomination10Amount > 0){
                        this.denomination20Amount = this.denomination20Amount - 2;
                        this.denomination10Amount = this.denomination10Amount - 1;
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 4){
                        this.denomination10Amount = this.denomination10Amount - 5;
                    }
                }
                else if(money%100 == 60){
                    if(denomination50Amount > 0 && denomination10Amount > 0){
                        this.denomination50Amount = this.denomination50Amount - 1;
                        this.denomination10Amount = this.denomination10Amount - 1;
                    }
                    else if(denomination20Amount > 2){
                        this.denomination20Amount = this.denomination20Amount - 3;
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 5){
                        this.denomination10Amount = this.denomination10Amount - 6;
                    }
                }
                else if(money%100 == 70){
                    if(denomination50Amount > 0 && denomination20Amount > 0){
                        this.denomination50Amount = this.denomination50Amount - 1;
                        this.denomination20Amount = this.denomination20Amount - 1;
                    }
                    else if(denomination20Amount > 2 && denomination10Amount > 0){
                        this.denomination20Amount = this.denomination20Amount - 3;
                        this.denomination10Amount = this.denomination10Amount - 1;
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 6){
                        this.denomination10Amount = this.denomination10Amount - 7;
                    }
                }
                else if(money%100 == 80){
                    if(denomination50Amount > 0 && denomination20Amount > 0 && denomination10Amount > 0){
                        this.denomination50Amount = this.denomination50Amount - 1;
                        this.denomination20Amount = this.denomination20Amount - 1;
                        this.denomination10Amount = this.denomination10Amount - 1;
                    }
                    else if(denomination20Amount > 3){
                        this.denomination20Amount = this.denomination20Amount - 4;
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 7){
                        this.denomination10Amount = this.denomination10Amount - 8;
                    }
                }
                else if(money%100 == 90){
                    if(denomination50Amount > 0 && denomination20Amount > 1){
                        this.denomination50Amount = this.denomination50Amount - 1;
                        this.denomination20Amount = this.denomination20Amount - 2;
                    }
                    else if(denomination20Amount > 3 && denomination10Amount > 0){
                        this.denomination20Amount = this.denomination20Amount - 4;
                        this.denomination10Amount = this.denomination10Amount - 1;
                    }
                    else if(denomination20Amount == 0 && denomination10Amount > 8){
                        this.denomination10Amount = this.denomination10Amount - 9;
                    }
                }
            }
            else System.out.println("No such variant");
        }
        else System.out.println("ATM dont have so much money");
    }
    public int currentATMMoney(){
        return this.denomination10Amount*10 + this.denomination20Amount*20 + this.denomination50Amount*50 + this.denomination100Amount*100;
    }

}

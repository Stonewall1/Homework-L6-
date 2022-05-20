package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CashMachine Machine1 = new CashMachine(100 , 100 , 100);
        int result1 = Machine1.currentATMMoney();
        System.out.println("Current CashMachine money : " + result1);

        //Adding money
        Machine1.cashMachineMoneyAddition(100,50,10);
        int result2 = Machine1.currentATMMoney();
        System.out.println("CashMachine has been filled : " + result2);

        //Retrieving money
        Machine1.cashMachineMoneyRetrieving(12,45,88);
        int result3 = Machine1.currentATMMoney();
        System.out.println("CashMachine after money retrieving : " + result3);

        //Robbery
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to rob the ATM? Enter YES or NO");
        String decision = scanner.nextLine();
        if(decision.equalsIgnoreCase("YES")){
            Machine1.beingRobbed();
            int result4 = Machine1.currentATMMoney();
            System.out.println("CashMachine money after being robbed : " + result4);
        }
        else{
            int result5 = Machine1.currentATMMoney();
            System.out.println("CashMachine money left : " + result5);
        }
    }
}

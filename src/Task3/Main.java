package Task3;

public class Main {
    public static void main(String[] args) {
        CashMachine Machine1 = new CashMachine(100,100 , 100 , 100);
        int result1 = Machine1.currentATMMoney();
        System.out.println("Current CashMachine money : " + result1);

        //Adding money
        Machine1.cashMachineMoneyAddition(10);
        int result2 = Machine1.currentATMMoney();
        System.out.println("CashMachine has been filled : " + result2);

        System.out.println("Available denominations");
        System.out.println(Machine1.denomination10Amount + " tens");
        System.out.println(Machine1.denomination20Amount + " twentys");
        System.out.println(Machine1.denomination50Amount + " fiftys");
        System.out.println(Machine1.denomination100Amount + " hundreds");

        //Standard money retrieving
        Machine1.cashMachineMoneyRetrieving(330);
        int result3 = Machine1.currentATMMoney();
        System.out.println("CashMachine after money retrieving : " + result3);

        System.out.println("Available denominations");
        System.out.println(Machine1.denomination10Amount + " tens");
        System.out.println(Machine1.denomination20Amount + " twentys");
        System.out.println(Machine1.denomination50Amount + " fiftys");
        System.out.println(Machine1.denomination100Amount + " hundreds");

        //Advanced money retrieving
        Machine1.advancedCashMachineMoneyRetrieving(390);
        int result4 = Machine1.currentATMMoney();
        System.out.println("CashMachine after advanced money retrieving : " + result4);

        System.out.println("Available denominations");
        System.out.println(Machine1.denomination10Amount + " tens");
        System.out.println(Machine1.denomination20Amount + " twentys");
        System.out.println(Machine1.denomination50Amount + " fiftys");
        System.out.println(Machine1.denomination100Amount + " hundreds");
    }
}

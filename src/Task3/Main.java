package Task3;

public class Main {
    public static void main(String[] args) {
        CashMachine Machine1 = new CashMachine(10,10 , 10 , 10);
        int result1 = Machine1.currentATMMoney();
        System.out.println("Current CashMachine money : " + result1);

        //Adding money
        Machine1.cashMachineMoneyAddition(10);
        int result2 = Machine1.currentATMMoney();
        System.out.println("CashMachine has been filled : " + result2);

        //Retrieving money
        Machine1.cashMachineMoneyRetrieving(1790);
        int result3 = Machine1.currentATMMoney();
        System.out.println("CashMachine after money retrieving : " + result3);
    }
}

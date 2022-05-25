package Task2;

public class Computer {
    String model;
    int cost;
    RAM RAM;
    HDD HDD;

    public Computer(String model, int cost) {
        this.model = model;
        this.cost = cost;
    }

    public Computer(String model, int cost, RAM ram, HDD hdd) {
        this.model = model;
        this.cost = cost;
        this.RAM = ram;
        this.HDD = hdd;
    }
    public void computerInfo(){
        System.out.println("Computer model : " + this.model + "\n" + "Computer cost : " + this.cost);
        this.RAM.RAMInfo();
        this.HDD.HDDInfo();
    }
}

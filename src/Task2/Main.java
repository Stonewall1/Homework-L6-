package Task2;

public class Main {
    public static void main(String[] args) {
        //computer1 info
        Computer computer1 = new Computer("Acer" , 1000);

        RAM ram1 = new RAM();
        ram1.name = "GF4";
        ram1.memoryInGb = 8;
        computer1.RAM = ram1;

        HDD hdd1 = new HDD();
        hdd1.name = "KF4";
        hdd1.capacityInGb = 256;
        hdd1.type = "SAS";
        computer1.HDD = hdd1;

        System.out.println("/////First computer info/////");
        computer1.computerInfo();

        //computer2 info
        RAM ram2 = new RAM("32HG" , 512);
        HDD hdd2 = new HDD("16H" , 16 , "SATA");

        Computer computer2 = new Computer("Dell" , 1500 , ram2 , hdd2);
        System.out.println("/////Second computer info/////");
        computer2.computerInfo();
    }
}

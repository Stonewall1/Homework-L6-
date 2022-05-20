package Task2;

public class HDD {
    String name;
    int capacityInGb;
    String type;

    public HDD(String name, int capacityInGb, String type) {
        this.name = name;
        this.capacityInGb = capacityInGb;
        this.type = type;
    }
    public HDD(){

    }
    public void HDDInfo(){
        System.out.println("HDD name : " + this.name + "\n" +
                           "HDD capacity : " + this.capacityInGb + "\n" +
                           "HDD type : " + this.type);
    }
}

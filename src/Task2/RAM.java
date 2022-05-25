package Task2;

public class RAM {
    String name;
    int memoryInGb;

    public RAM(String name, int memoryInGb) {
        this.name = name;
        this.memoryInGb = memoryInGb;
    }
    public RAM(){

    }
    public void RAMInfo(){
        System.out.println("RAM name : " + this.name + "\n" + "RAM memory : " + this.memoryInGb);
    }
}

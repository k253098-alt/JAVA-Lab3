public class Computer {
    int ID;
    String prossesprType;
    double RamSize;
    String operatingSystem;

    Computer(int ID, String prossesprType, double RamSize, String operatingSystem){
        this.ID = ID;
        this.RamSize = RamSize;
        this.operatingSystem = operatingSystem;
        this.prossesprType = prossesprType;
    }

    void displayInfo(){
        System.out.println("System ID: " + ID);
        System.out.println("Ram size: " + RamSize);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Prossesor Type: " + prossesprType);
        System.out.println("----------------");


    }

    public static void main(String[] args){
        Computer c1 = new Computer(1001, "Octacore", 4, "Android");
        Computer c2 = new Computer(1002, "SnapDragon", 8, "Android");

        c1.displayInfo();
        c2.displayInfo();
    }

}

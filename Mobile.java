public class Mobile {
    String brand;
    int model;
    double price;

    // Default values
    Mobile(){
        this.brand = "unknown";
        this.model= 00;
        this.price = 0.0;
    }

    //Actual values
    Mobile(String brand, int model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Display Info
    void displayInfo(){
        System.out.println("Brand Name: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("-----------------");
    }

    public static void main(String[] args){
        Mobile m1 = new Mobile();
        Mobile m2 =  new Mobile("Apple", 2026, 70);

        m1.displayInfo();
        m2.displayInfo();
    }

}

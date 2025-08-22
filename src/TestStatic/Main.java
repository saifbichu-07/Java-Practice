package TestStatic;

public class Main {
    public static void main(String[] args) {
// Using the static inner class directly without object
     System.out.println(ToyotaCars.Brand.brandName);
     ToyotaCars.Brand.tagline();
        // Creating outer class object
     ToyotaCars toyotaCars = new ToyotaCars();
        // Using the non-static inner class via getter
     toyotaCars.nonStaticInner.model("Camry");


    }
}

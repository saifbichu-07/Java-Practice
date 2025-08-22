package TestStatic;

public class ToyotaCars {
    NonStaticInner nonStaticInner = new NonStaticInner();

    public static class Brand{
        public static String brandName = "Toyota";
        public static void tagline(){
            System.out.println("Reliable car");
        }
    }
    public class NonStaticInner{
        public void model(String Model){
            System.out.println("Make of the car : "+Model);
        }

    }

    public NonStaticInner getNonStaticInner() {
        return nonStaticInner;
    }

    public void setNonStaticInner(NonStaticInner nonStaticInner) {
        this.nonStaticInner = nonStaticInner;
    }
}
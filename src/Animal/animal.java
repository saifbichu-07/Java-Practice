package Animal;

public class animal {
    protected double height;
    protected double weight;
    protected String animalType;
    protected String bloodType;

    public void showInfo(){
        System.out.println("height" + height);
        System.out.println("weight" + weight);
        System.out.println("Animal Type" + animalType);
        System.out.println("Blood Type" + bloodType);

    }
}

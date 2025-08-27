import java.util.Scanner;
public class FuelConsumption {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of litres to fill the tank");
        double litres = sc.nextDouble();

        System.out.print("Enter the distance covered till the tank goes dry (in km): ");
        double distance = sc.nextDouble();

        if(litres <= 0 || distance <= 0){
            System.out.println("Invalid Input");
            return;
        }
        double consumption = (litres / distance) * 100;

        double miles = distance * 0.6214;
        double gallons = litres * 0.2642;
        double mpg = miles / gallons;

        System.out.println("Litres/100KM "+consumption);
        System.out.printf("Fuel consumption is %.2f miles per gallon%n", mpg);
    }
}
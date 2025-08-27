import java.util.Scanner;
public class movie {
    public static void main(String[]args){
        int total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        int pizzas = sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int puffs = sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int coolDrinks = sc.nextInt();

        pizzas = Math.abs(pizzas)*100;
         puffs = puffs*20;
         coolDrinks = coolDrinks*10;
         System.out.println("Bill Details/n");
         System.out.println("No of pizzas:"+pizzas);
        System.out.println("No of puffs:"+puffs);
        System.out.println("No of cooldrinks:"+coolDrinks);
        total = pizzas + puffs + coolDrinks;
        System.out.println("Total Price =" + total);




    }
}

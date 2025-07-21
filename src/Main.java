import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // String var1 = "10";
        //String var2 = "100";
        //int var = 10;
        //System.out.println(Integer.parseInt(var2)+var1);
       // System.out.println(var1 + var2);
        //int result = Integer.parseInt(var1) + Integer.parseInt(var2);
        //System.out.println(result);  // Output: 110
        /*
        int a = 25;
        float b = 42.159f;
        int value = (int)(a*a + 2*(a*b) + b*b);
        System.out.println(value);

         */
//        boolean x = true;
//        boolean y = false;
//
//        if(y || x){
//            System.out.println("Condition is true");
//        }else{
//            System.out.println("Condition is false");
//        }


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine();  // To consume leftover newline

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        sc.close();



    }
}
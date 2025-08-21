import java.util.Scanner;
public class user_input {
    public static void main(String[]args){
        // creating new scanner object
        Scanner sc = new Scanner(System.in);
        //Taking string as input
        System.out.println("Enter Your name :");
        String name = sc.nextLine();
        // Taking integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // Taking double input
        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();
        // Display The output
        System.out.println("Hello"+name+" ,Age :" +age+",Marks: "+marks);

    }
}


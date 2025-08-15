package Non_Static;

public class Outer {
    private String message = "Hello from Outer!";

    // Non-static inner class
    public class Inner{
       void showMessage(){
           System.out.println(message);//can access private members of outer
       }

    }
}

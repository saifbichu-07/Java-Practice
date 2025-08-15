package Non_Static;

public class Main {
    public static void main(String[]args){
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.showMessage();
    }
}

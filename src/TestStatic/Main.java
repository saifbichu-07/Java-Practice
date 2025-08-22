package TestStatic;

public class Main {
    public static void main(String[] args) {
        TestStatic obj01 = new TestStatic();
        System.out.println("obj1 staticvar = " + obj01.getStaticVar());
        obj01.setStaticVar(25);
        System.out.println("obj1 staticvar = " + obj01.getStaticVar());

        TestStatic obj02 = new TestStatic();
        System.out.println("obj2 staticvar = " + obj02.getStaticVar());
        obj02.setStaticVar(12);
        System.out.println("obj2 staticvar = " + obj02.getStaticVar());

    }
}

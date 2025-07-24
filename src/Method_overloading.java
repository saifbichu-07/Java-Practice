public class Method_overloading {
    public static void main(String[] args){
        sum(1,3);
        sum(9.1f,8);

    }
    public static void sum(int x,int y){
        System.out.println("Addidtion of 2 int's");
    }

    public static void sum(float x,int y){
        System.out.println("Addidtion of 1 float and 1 int");
    }

}

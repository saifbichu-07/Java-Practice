package Animal;

public class Main {
    public static void main(String[]args){
        System.out.println(" Crocodile Info ");
        Crocodile crocodile = new Crocodile();
        crocodile.showInfo();

        System.out.println("\n--- Eel Info ---");
        Eel eel = new Eel();
        eel.showInfo();


        System.out.println("\n--- Eagle Info ---");
        Eagle eagle = new Eagle();
        eagle.showInfo();
    }
}

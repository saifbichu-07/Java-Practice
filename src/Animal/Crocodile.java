package Animal;

public class Crocodile extends Reptile{
    private String crocodileEggs = "Hard-shelled eggs";

    public void showInfo(){
        super.showInfo();
        System.out.println("crocodile Eggs: " + crocodileEggs);

    }
}

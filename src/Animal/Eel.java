package Animal;

public class Eel extends Fish{
    private String specialAbility = "Releases electric charge";

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Special Ability: " + specialAbility);
    }
}

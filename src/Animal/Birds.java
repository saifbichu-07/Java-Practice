package Animal;

public class Birds extends animal{
    protected String feathers = "Has feathers";
    protected boolean canFly = true;

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Feathers: " + feathers);
        System.out.println("Can Fly: " + canFly);
    }
}

package Animal;

public class Fish extends animal{
    protected String habitat = "Lives in water";
    protected String gills = "Has gills";

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Habitat: " + habitat);
        System.out.println("Gills: " + gills);
    }
}

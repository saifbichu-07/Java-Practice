package Animal;

public class Reptile extends animal {
    protected String skin = "Dry Skin";
    protected String backbone = "has Backbone";
    protected String eggs = "Soft - shelled eggs";

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Skin: " + skin);
        System.out.println("Backbone: "+ backbone);
        System.out.println("Eggs: " +eggs);

    }


}

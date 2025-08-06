package Person;

public class student extends person {
    public String branch = "IT";
    public int roll = 27;

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Branch :"+branch);
        System.out.println("Roll no :" + roll);
    }
}

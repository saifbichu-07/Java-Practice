package Phone;

public  class iphone implements IOS{
    public void call() {
        System.out.println("SD 100512 from iPhone");
    }

    // Implementation of airDrop() method specific to iOS
    public String airdrop() {
        return "AirDrop activated";
    }

}

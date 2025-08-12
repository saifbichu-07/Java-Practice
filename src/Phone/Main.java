package Phone;

public class Main {
    public static  void main(String[]args){
        phone phone = new SamsungPhone();
        phone.call();

        Android androidPhone = (Android) phone;
        System.out.println(androidPhone.Whatsapp());

        // Similarly, if using iPhone, declare using iPhone reference to access airDrop()
        iphone myIphone = new iphone();
        myIphone.call();  // Calls iPhone's call method
        System.out.println(myIphone.airdrop());

    }
}

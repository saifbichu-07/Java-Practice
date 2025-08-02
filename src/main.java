public class main {
    public static void main(String[] args) {
        // Creating a Constructor object using the default constructor
        Constructor parkedConstructor = new Constructor();
        // Output will indicate that the Constructor is parked
        parkedConstructor.startConstructor();

        System.out.println("---------------------");

        // Creating a Constructor object using the parameterized constructor
        // The parameters simulate a running Constructor scenario: closed door, engine on, driver seated, and a speed of 10 km/h
        Constructor runningConstructor = new Constructor("closed", "on", "seated", 10);
        // Output will show the running Constructor state
        runningConstructor.startConstructor();
    }
}
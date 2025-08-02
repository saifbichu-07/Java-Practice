

public class Constructor {
    // Instance variables representing the state of the Constructor
    private String door;   // Represents door status: "open" or "closed"
    private String engine; // Represents engine state: "on" or "off"
    private String driver; // Represents driver status: "seated" or "away"
    private int speed;     // Represents the speed of the Constructor

    // Default constructor initializing a parked Constructor state
    public Constructor() {
        // A parked  typically has the door open, engine off, no driver, and zero speed
        this.door = "open";
        this.engine = "off";
        this.driver = "away";
        this.speed = 0;
    }

    // Parameterized constructor allowing user-defined initialization
    public Constructor(String door, String engine, String driver, int speed) {
        // Assigning explicit values provided by the user
        this.door = door;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    // Method to start the Constructor and display its state
    public void startConstructor() {
        System.out.println("Constructor Details:");
        System.out.println("Door Status: " + door);
        System.out.println("Engine Status: " + engine);
        System.out.println("Driver Status: " + driver);
        System.out.println("Speed: " + speed + " km/h");
    }
}
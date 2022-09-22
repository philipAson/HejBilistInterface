public class MilitaryTank implements Vehicle {

    private Driver driver;
    private String type;
    private int legalAge;
    private int milesToGo;
    private int milesPerDrive;

    public MilitaryTank () {
        this.driver = null;
        this.type = "Tank";
        this.legalAge = 25;
        this.milesToGo = 2000;
        this.milesPerDrive = 5;

        System.out.println(type + " created. " + milesToGo + " miles to go!");
    }
    @Override
    public void drive () {
        if (driver != null) {
            milesToGo = milesToGo - milesPerDrive;
            System.out.println(type + " Drove " + milesPerDrive + " miles - " + milesToGo + " miles to go");
        }
        else System.out.println(type + " didn't drive - there's no driver!");
    }

    @Override
    public void setDriver(Driver driver) {
        this.driver = driver;
        if (driver.getAge() >= legalAge)
            System.out.println("Driver changed to " + driver.getName());
        else
            System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() + ", but must be " + legalAge + " or older to drive " + type);
    }
}

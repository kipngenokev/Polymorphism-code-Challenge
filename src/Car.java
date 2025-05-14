public class Car{
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> Engine starting");
    }

    public void drive() {
        runEngine();
        System.out.println("Car-> moving,type is "+ getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.println("Car -> Engine running");
    }
}

class GasPoweredCar extends Car{
    double avgKmPerLitre;
    int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders fired up, Ready %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> Usage exceeds average : %.2f %n",avgKmPerLitre);
    }
}

class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description,double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready %n",batterySize);
    }

    @Override
    public void runEngine() {
        System.out.printf("BEV -> Usage under the average : %.2f %n",avgKmPerCharge);

    }

}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n",cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on .Ready!%n",batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> Usage below average: %.2f %n",avgKmPerLitre);
    }
}
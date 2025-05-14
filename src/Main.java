public class Main{
    public static void main(String[] args) {
        Car car = new Car("2018 gray MAzda Axela 1500cc");
        runRace(car);

        Car nissanGTR = new GasPoweredCar("black Nissan GTR",15.599,4);
        runRace(nissanGTR);

        Car tesla = new ElectricCar("2020 TeslaModel X",500,100);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 black Ferrari SF90 Stradale",30,8,8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
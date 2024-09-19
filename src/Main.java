public class Main {
    public static void main(String[] args) {
        Car car = new Mitsubishi(8,"Toyota");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

    }
}
public class Ford extends Car{

    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public int getCylinder() {
        return super.getCylinder();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String startEngine() {
        return (super.startEngine());
    }

    @Override
    public String accelerate() {
        return (super.accelerate());
    }

    @Override
    public String brake() {
        return (super.brake());
    }
}

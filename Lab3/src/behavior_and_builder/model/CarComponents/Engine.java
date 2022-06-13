package behavior_and_builder.model.CarComponents;

public class Engine {
    private final double volume;
    private int power;
    private Fuel fuel;

    public Engine(double volume, int power, Fuel fuel) {
        this.volume = volume;
        this.power = power;
        this.fuel = fuel;
    }

    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }

    public Fuel getFuel() {
        return fuel;
    }
}

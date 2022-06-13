package behavior_and_builder.model.CarComponents;


import behavior_and_builder.model.CarComponents.CarType;
import behavior_and_builder.model.CarComponents.Complectation;
import behavior_and_builder.model.CarComponents.Engine;
import behavior_and_builder.model.CarComponents.Transmission;

public class Cars {
    private final CarType carType;
    private final int seats;
    private final Complectation complectation;
    private final Engine engine;
    private final Transmission transmission;


    public Cars(CarType carType, Complectation complectation, Engine engine, Transmission transmission, int seats) {
        this.carType = carType;
        this.complectation = complectation;
        this.engine = engine;
        this.transmission = transmission;
        this.seats = seats;
        print();
    }

    public CarType getCarType() {
        return carType;
    }

    public Complectation getComplectation() {
        return complectation;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public int getSeats() {
        return seats;
    }

    public void print() {
        System.out.println("Type of car: " + carType + "\n" +
                "Complectation: " + complectation + "\n" +
                "Engine: volume - " + engine.getVolume() + "; power - " + engine.getPower() +
                "; fuel - " + engine.getFuel() + "\n" +
                "Transmission: " + transmission + "\n" +
                "Count of seats: " + seats + "\n");
    }
}


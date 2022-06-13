package behavior_and_builder.element;

import behavior_and_builder.model.CarComponents.*;


public class CarManualConstructor {
    private final CarType carType;
    private final Complectation complectation;
    private final Engine engine;
    private final Transmission transmission;
    private final int seats;


    public CarManualConstructor(CarType carType, Complectation complectation, Engine engine,
                                Transmission transmission, int seats) {
        this.carType = carType;
        this.complectation = complectation;
        this.engine = engine;
        this.transmission = transmission;
        this.seats = seats;
        print();
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

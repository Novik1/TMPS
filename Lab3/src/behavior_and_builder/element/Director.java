package behavior_and_builder.element;

import behavior_and_builder.model.CarComponents.*;
import behavior_and_builder.model.builder.CarBuilder;
import behavior_and_builder.visitor.visitorOne;

public class Director implements element{
    CarBuilder builder = new CarBuilder();

    public void constructSedan() {
        builder.setCarType(CarType.SEDAN);
        builder.setComplectation(Complectation.COMFORT);
        builder.setEngine(new Engine(2.0, 160, Fuel.diesel));
        builder.setTransmission(Transmission.ROBOT);
        builder.setSeats(5);
        builder.getResult();
    }

    public void constructWagon() {
        builder.setCarType(CarType.WAGON);
        builder.setComplectation(Complectation.COMFORT);
        builder.setEngine(new Engine(2.0, 160, Fuel.diesel));
        builder.setTransmission(Transmission.ROBOT);
        builder.setSeats(7);
        builder.getResult();
    }

    public void constructHatchback() {
        builder.setCarType(CarType.HATCHBACK);
        builder.setComplectation(Complectation.STANDARD);
        builder.setEngine(new Engine(1.2, 90, Fuel.gasoline));
        builder.setTransmission(Transmission.CVT);
        builder.setSeats(5);
        builder.getResult();
    }

    public void constructSUV() {
        builder.setCarType(CarType.SUV);
        builder.setComplectation(Complectation.COMFORT);
        builder.setEngine(new Engine(3.5, 249, Fuel.gasoline));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setSeats(7);
        builder.getResult();
    }

    public void constructCoupe() {
        builder.setCarType(CarType.CUOPE);
        builder.setComplectation(Complectation.LUXURY);
        builder.setEngine(new Engine(5.2, 450, Fuel.gasoline));
        builder.setTransmission(Transmission.MANUAL);
        builder.setSeats(4);
        builder.getResult();
    }

    @Override
    public void accept(visitorOne v) {
            v.visit(this);
    }
}

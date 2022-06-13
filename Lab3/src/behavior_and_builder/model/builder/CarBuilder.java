package behavior_and_builder.model.builder;

import behavior_and_builder.model.CarComponents.CarType;
import behavior_and_builder.model.CarComponents.Complectation;
import behavior_and_builder.model.CarComponents.Engine;
import behavior_and_builder.model.CarComponents.Transmission;
import behavior_and_builder.model.CarComponents.Cars;;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Complectation complectation;
    private Engine engine;
    private Transmission transmission;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setComplectation(Complectation complectation) {
        this.complectation = complectation;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }


    public Cars getResult() {
        return new Cars(type, complectation,  engine, transmission, seats);
    }

}

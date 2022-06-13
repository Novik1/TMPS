package behavior_and_builder.model.builder;

import behavior_and_builder.element.element;
import behavior_and_builder.model.CarComponents.CarType;
import behavior_and_builder.model.CarComponents.Complectation;
import behavior_and_builder.model.CarComponents.Engine;
import behavior_and_builder.model.CarComponents.Transmission;
import behavior_and_builder.element.CarManualConstructor;
import behavior_and_builder.visitor.visitorOne;

public class CarConstructor implements Builder, element {
    private CarType type;
    private int seats;
    private Complectation complectation;
    private Engine engine;
    private Transmission transmission;

    @Override
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

    public CarManualConstructor getResult() {
        return new CarManualConstructor(type, complectation, engine, transmission, seats);
    }

    @Override
    public void accept(visitorOne v) {
        v.visit(this);
    }
}

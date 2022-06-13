package behavior_and_builder.model.builder;

import behavior_and_builder.model.CarComponents.CarType;
import behavior_and_builder.model.CarComponents.Complectation;
import behavior_and_builder.model.CarComponents.Engine;
import behavior_and_builder.model.CarComponents.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setComplectation(Complectation complectation);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setSeats(int seats);
}
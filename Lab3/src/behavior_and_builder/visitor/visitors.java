package behavior_and_builder.visitor;

import behavior_and_builder.element.Director;
import behavior_and_builder.model.builder.CarConstructor;

public interface visitors {
    void visit(Director director);
    void visit(CarConstructor engineer);
}

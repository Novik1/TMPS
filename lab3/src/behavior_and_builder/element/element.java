package behavior_and_builder.element;

import behavior_and_builder.visitor.visitorOne;

public interface element {

    void accept(visitorOne v);
}

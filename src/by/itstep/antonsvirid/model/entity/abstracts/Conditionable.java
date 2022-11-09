package by.itstep.antonsvirid.model.entity.abstracts;

public interface Conditionable {
    String getName();
    int getPower();

    boolean isInSet();
    int getCost();

    boolean isTurnOnStatus();
    void turnOn();

    void turnOff();

    void connectPlug();

    void disConnectPlug();
}

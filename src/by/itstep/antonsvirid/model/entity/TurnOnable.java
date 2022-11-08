package by.itstep.antonsvirid.model.entity;

public interface TurnOnable {
    void turnOn();

    void turnOff();

    void connectPlug();

    void disConnectPlug();

    String getName();

    int getPower();

    int getCost();

}

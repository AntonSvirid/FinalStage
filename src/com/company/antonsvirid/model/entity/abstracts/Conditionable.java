package com.company.antonsvirid.model.entity.abstracts;

public interface Conditionable {
    String getName();
    int getPower();
    boolean isInSet();
    int getCost();
    boolean isTurnOnStatus() throws Exception;

    void turnOn() throws Exception;
    void turnOff() throws Exception;
    void connectPlug() throws Exception;
    void disConnectPlug() throws Exception;

    String getInfo();
}

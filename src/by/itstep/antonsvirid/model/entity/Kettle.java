package by.itstep.antonsvirid.model.entity;

import by.itstep.antonsvirid.model.entity.abstracts.KitchenEquipments;

public class Kettle extends KitchenEquipments {

    public Kettle() {
    }

    public Kettle(String name, int power, int cost, boolean inSet) {
        super(name, power, cost, inSet);
    }

    @Override
    public void turnOn() {
        if (isInSet() == true && isTurnOnStatus() == false) {
            setTurnOnStatus(true);
            System.out.println("Kettle was turnon...");
        } else {
            System.out.println("error, not correct status");
        }
    }

    @Override
    public void turnOff() {
        if (isInSet() == true && isTurnOnStatus() != false) {
            setTurnOnStatus(false);
            System.out.println("Kettle was turnoff...");
        } else {
            System.out.println("error, not correct status");
        }
    }
}

package by.itstep.antonsvirid.model.entity;

import by.itstep.antonsvirid.model.entity.abstracts.HouseEquipments;


public class Boombox extends HouseEquipments {

    public Boombox() {
    }

    public Boombox(String name, int power, int cost, boolean inSet) throws Exception {
        super(name, power, cost, inSet);
    }

    @Override
    public void turnOn() {
        if (isInSet() && isTurnOnStatus() == false) {
            setTurnOnStatus(true);
            System.out.println("Boombox was turnon...");
        } else {
            System.out.println("error, not correct status");
        }
    }

    @Override
    public void turnOff() {
        if (isInSet() && isTurnOnStatus() != false) {
            setTurnOnStatus(false);
            System.out.println("Boombox was turnoff...");
        } else {
            System.out.println("error, not correct status");
        }
    }
}

package by.itstep.antonsvirid.model.entity;

import by.itstep.antonsvirid.model.entity.abstracts.HouseEquipments;

public class Mixer extends HouseEquipments {
    public Mixer() {
    }

    public Mixer(String name, int power, int cost, boolean inSet) throws Exception {
        super(name, power, cost, inSet);
    }

    @Override
    public void turnOn() {
        if (isInSet() == true && isTurnOnStatus() == false) {
            setTurnOnStatus(true);
            System.out.println("Mixer was turnon...");
        } else {
            System.out.println("error, not correct status");
        }
    }

    @Override
    public void turnOff() {
        if (isInSet() == true && isTurnOnStatus() != false) {
            setTurnOnStatus(false);
            System.out.println("Mixer was turnoff...");
        } else {
            System.out.println("error, not correct status");
        }
    }
}

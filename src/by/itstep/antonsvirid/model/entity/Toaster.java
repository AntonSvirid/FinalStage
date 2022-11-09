package by.itstep.antonsvirid.model.entity;

import by.itstep.antonsvirid.model.entity.abstracts.KitchenEquipments;

public class Toaster extends KitchenEquipments {
    public Toaster() {
    }
    public Toaster(String name, int power, int cost, boolean inSet) throws Exception {
        super(name, power, cost, inSet);
    }

    @Override
    public void turnOn() {
        if (isInSet() == true && isTurnOnStatus() == false) {
            setTurnOnStatus(true);
            System.out.println("Toaster was turnon...");
        } else {
            System.out.println("error, not correct status");
        }
    }

    @Override
    public void turnOff() {
        if (isInSet() == true && isTurnOnStatus() != false) {
            setTurnOnStatus(false);
            System.out.println("Toaster was turnoff...");
        } else {
            System.out.println("error, not correct status");
        }
    }
}

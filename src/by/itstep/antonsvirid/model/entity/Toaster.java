package by.itstep.antonsvirid.model.entity;

import by.itstep.antonsvirid.model.entity.abstracts.KitchenEquipments;

public class Toaster extends KitchenEquipments {
    public Toaster() {
    }

    public Toaster(String name, int power, int cost, boolean inSet) throws Exception {
        super(name, power, cost, inSet);
    }

    @Override
    public void turnOn() throws Exception{
        if (isInSet() && isTurnOnStatus() == false) {
            setTurnOnStatus(true);
            System.out.println("Toaster was turnon...");
        } else {
            System.out.println("error, not correct status");
            throw new Exception();
        }
    }

    @Override
    public void turnOff()  throws Exception{
        if (isInSet() && isTurnOnStatus()) {
            setTurnOnStatus(false);
            System.out.println("Toaster was turnoff...");
        } else {
            System.out.println("error, not correct status");
            throw new Exception();
        }
    }
}

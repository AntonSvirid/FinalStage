package com.company.antonsvirid.model.entity;

import com.company.antonsvirid.model.entity.abstracts.KitchenEquipments;

public class Kettle extends KitchenEquipments {

    public Kettle() {
    }

    public Kettle(String name, int power, int cost, boolean inSet) throws Exception {
        super(name, power, cost, inSet);
    }

    @Override
    public void turnOn() throws Exception{
        if (isInSet() && !isTurnOnStatus()) {
            setTurnOnStatus(true);
            System.out.println("Kettle was turnon...");
        } else {
            System.out.println("error, not correct status");
            throw new Exception();
        }
    }

    @Override
    public void turnOff()  throws Exception{
        if (isInSet() && isTurnOnStatus()) {
            setTurnOnStatus(false);
            System.out.println("Kettle was turnoff...");
        } else {
            System.out.println("error, not correct status");
            throw new Exception();
        }
    }

}

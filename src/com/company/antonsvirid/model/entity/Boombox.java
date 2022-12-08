package com.company.antonsvirid.model.entity;

import com.company.antonsvirid.model.entity.abstracts.HouseEquipments;


public class Boombox extends HouseEquipments {
    int volume;

    public Boombox() {
    }

    public Boombox(String name, int power, int cost, boolean inSet, int volume) throws Exception {
        super(name, power, cost, inSet);
        if (volume >= 0 && volume < 100) {
            this.volume = volume;
        } else {
            throw new Exception();
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) throws Exception {
        if (volume >= 0 && volume < 100) {
            this.volume = volume;
        } else {
            throw new Exception();
        }
    }

    @Override
    public String getInfo() {
        String msg = "Device name: " + getName() + "\nmax power Wt: " + getPower() + "\ncost $: "
                + getCost() + "\nconnect to set status: " + isInSet() + "\ndevice is on?: "
                + isTurnOnStatus() + "\n" + "max volume is: " + volume + "\n";
        return msg;
    }

    @Override
    public void turnOn() throws Exception{
        if (isInSet() && !isTurnOnStatus()) {
            setTurnOnStatus(true);
            System.out.println("Boombox was turnon...");
        } else {
            System.out.println("error, not correct status");
            throw new Exception();
        }
    }

    @Override
    public void turnOff() throws Exception{
        if (isInSet() && isTurnOnStatus()) {
            setTurnOnStatus(false);
            System.out.println("Boombox was turnoff...");
        } else {
            System.out.println("error, not correct status");
            throw new Exception();
        }
    }
}

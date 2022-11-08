package by.itstep.antonsvirid.model.entity.abstracts;

import by.itstep.antonsvirid.model.entity.TurnOnable;

import java.sql.SQLOutput;

public abstract class HouseEquipments implements TurnOnable{
    private String name;
    private int power;
    private int cost;
    private boolean inSet;
    private boolean turnOnStatus;

    public HouseEquipments() {
    }

    public HouseEquipments(String name, int power, int cost, boolean inSet) {
        this.name = name;
        this.power = power;
        this.cost = cost;
        this.inSet = inSet;
        this.turnOnStatus = false;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getCost() {
        return cost;
    }

    public void setInSet(boolean inSet) {
        inSet = inSet;
    }

    public boolean isInSet() {
        return inSet;
    }

    public boolean isTurnOnStatus() {
        return turnOnStatus;
    }

    public void setTurnOnStatus(boolean turnOnStatus) {
        this.turnOnStatus = turnOnStatus;
    }

    public String getInfo() {
        String msg = "Device name: " + name + "\nmax power Wt: " + power + "\ncost $: "
                + cost + "\nconnect to set status: " + inSet + "\ndevice is on?: " + turnOnStatus + "\n";
        return msg;
    }


    public void connectPlug() {
        if (inSet == false) {
            inSet = true;
            System.out.println("Plug was connected...");
        } else {
            System.out.println("error, not correct status");
        }
    }
    public void disConnectPlug() {
        if (inSet != false) {
            inSet = false;
            turnOnStatus = false;
            System.out.println("Plug was disconnected...");
        } else {
            System.out.println("error, not correct status");
        }
    }

    public void turnOn() {
        if (inSet == true && turnOnStatus == false) {
            turnOnStatus = true;
            System.out.println("Device was turnon...");
        } else {
            System.out.println("error, not correct status");
        }
    }
    public  void turnOff() {
        if (inSet == true && turnOnStatus != false) {
            turnOnStatus = false;
            System.out.println("Device was turnoff...");
        } else {
            System.out.println("error, not correct status");
        }
    }

//    public abstract void povedenie();
}

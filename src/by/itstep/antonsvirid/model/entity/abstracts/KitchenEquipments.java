package by.itstep.antonsvirid.model.entity.abstracts;


public abstract class KitchenEquipments implements Conditionable {
    private String name;
    private int power;
    private int cost;
    private boolean inSet;
    private boolean turnOnStatus;
    private boolean waterProof;

    public KitchenEquipments() {
    }

    public KitchenEquipments(String name, int power, int cost, boolean inSet) throws Exception {
        this.name = name;
        if (power > 0 && power < 12_000) {
            this.power = power;
        } else {
            throw new Exception();
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            throw new Exception();
        }
        this.inSet = inSet;
        this.turnOnStatus = false;      // all equipments are not turnOn as default
        this.waterProof = true;         // all Kitchen equipments are waterProof as default
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

    public boolean isWaterProof() {
        return waterProof;
    }

    public String getInfo() {
        String msg = "Device name: " + name + "\nmax power Wt: " + power + "\ncost $: "
                + cost + "\nconnect to set status: " + inSet + "\ndevice is on?: " + turnOnStatus
                + "\nis waterproof?: " + waterProof + "\n";
        return msg;
    }

    public void connectPlug() throws Exception {
        if (inSet == false) {
            inSet = true;
            System.out.println("Plug was connected...");
        } else {
            System.out.println("error, not correct status");
            throw new Exception();
        }
    }

    public void disConnectPlug() throws Exception {
        if (inSet) {
            inSet = false;
            turnOnStatus = false;
            System.out.println("Plug was disconnected...");
        } else {
            System.out.println("error, not correct status");
            throw new Exception();
        }
    }

    public abstract void turnOn() throws Exception;

    public abstract void turnOff() throws Exception;

}


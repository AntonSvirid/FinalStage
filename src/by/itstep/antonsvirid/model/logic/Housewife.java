package by.itstep.antonsvirid.model.logic;

// import by.itstep.antonsvirid.model.entity.AllInterfaceses;

import by.itstep.antonsvirid.model.entity.abstracts.Conditionable;


public class Housewife {

    public static int calculatedTotalPower(Conditionable conditionable[]) throws Exception {

        if (conditionable == null || conditionable.length == 0) {
            throw new Exception();
        }

        int totalPower = 0;
        for (int i = 0; i < conditionable.length; i++) {
            totalPower += conditionable[i].getPower();
        }
        return totalPower;
    }

    public static int calculatedPowerWhoInset(Conditionable conditionable[]) throws Exception  {

        if (conditionable == null || conditionable.length == 0) {
            throw new Exception();
        }

        int totalPower = 0;

        for (int i = 0; i < conditionable.length; i++) {
            if (conditionable[i].isTurnOnStatus()) {
                totalPower += conditionable[i].getPower();
            }
        }
        return totalPower;
    }

    public static String sortEquipmentsForCost(Conditionable conditionable[]) throws Exception  {

        if (conditionable == null || conditionable.length == 0) {
            throw new Exception();
        }

        String sort = "";
        boolean isSorted = false;
        Conditionable temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < conditionable.length - 1; i++) {
                if (conditionable[i].getCost() > conditionable[i + 1].getCost()) {
                    isSorted = false;

                    temp = conditionable[i];
                    conditionable[i] = conditionable[i + 1];
                    conditionable[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < conditionable.length; i++) {
            sort += conditionable[i].getName() + "\n";
        }
        return sort;

    }

    public static String whoIsMaxPowerEquipment(Conditionable conditionable[]) throws Exception  {

        if (conditionable == null || conditionable.length == 0) {
            throw new Exception();
        }

        int maxIndex = 0;
        int temp = 0;
        for (int i = 0; i < conditionable.length; i++) {
            if (conditionable[i].getPower() > temp) {
                temp = conditionable[i].getPower();
                maxIndex = i;
            }
        }
        String equipment = conditionable[maxIndex].getName();
        return equipment;
    }

}



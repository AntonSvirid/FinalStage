package by.itstep.antonsvirid.controller;


import by.itstep.antonsvirid.model.entity.Boombox;
import by.itstep.antonsvirid.model.entity.Kettle;

import by.itstep.antonsvirid.model.entity.Mixer;
import by.itstep.antonsvirid.model.entity.abstracts.Conditionable;
import by.itstep.antonsvirid.model.entity.abstracts.HouseEquipments;
import by.itstep.antonsvirid.model.entity.abstracts.KitchenEquipments;

import by.itstep.antonsvirid.model.logic.Housewife;
import by.itstep.antonsvirid.view.Printer;

public class Main {
    public static void main(String[] args) throws Exception {

//        KitchenEquipments kettle1 = new Kettle("bosch", 1800, 150, true);
//        KitchenEquipments kettle2 = new Kettle("xiaomi", 1500, 700, false);
//
//        HouseEquipments boombox1 = new Boombox("sony", 300, 210, true);
//
//        Mixer mixer = new Mixer("Kenwood", 500, 70, true);

        Conditionable[] equipments = new Conditionable[]{
                new Kettle("bosch", 1800, 150, true),
                new Boombox("sony", 300, 210, true),
                new Kettle("xiaomi", 1500, 700, false),
                new Mixer("Kenwood", 500, 70, true)
        };

        equipments[1].turnOn();

        int totalPower = Housewife.calculatedTotalPower(equipments);
        System.out.println("Общая мощность подключенных к сети приборов: " + totalPower + "\n");

        int totalPowerWhoOn = Housewife.calculatedPowerWhoInset(equipments);
        System.out.println("Общая мощность включённых приборов: " + totalPowerWhoOn + "\n");

        String sortNamesOfCost = Housewife.sortEquipmentsForCost(equipments);
        System.out.println("Отсортированный список по цене: \n" + sortNamesOfCost);

        String whoIsMaxPowerEquipmunt = Housewife.whoIsMaxPowerEquipment(equipments);
        System.out.println("Самый мощный прибор: " + whoIsMaxPowerEquipmunt);


    }

}

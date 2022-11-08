package by.itstep.antonsvirid.controller;


import by.itstep.antonsvirid.model.entity.Boombox;
import by.itstep.antonsvirid.model.entity.Kettle;

import by.itstep.antonsvirid.model.entity.abstracts.HouseEquipments;
import by.itstep.antonsvirid.model.entity.abstracts.KitchenEquipments;

import by.itstep.antonsvirid.model.logic.Housewife;
import by.itstep.antonsvirid.view.Printer;

public class Main {
    public static void main(String[] args) {

//        Kettle kettle1 = new Kettle("Xiaomi", 1500, 70, true);
//
//        System.out.println("message was set");           // debug

        //  String msg = kettle1.getInfo();

        //   Housewife.turnOn(new Boombox);
        // Housewife.turnOn(new Kettle("Xiaomi", 1500, 70, true));

        KitchenEquipments kettle1 = new Kettle("bosch", 1800, 150, true);
        KitchenEquipments kettle2 = new Kettle("xiaomi", 1500, 700, false);

        HouseEquipments boombox1 = new Boombox("sony", 300, 210, true);

        int totalPower = Housewife.calculatedTotalPower(kettle1);

        String msg = totalPower + "";
        Printer.print(msg);


    }

}

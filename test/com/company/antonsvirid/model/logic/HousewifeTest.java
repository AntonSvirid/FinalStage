package com.company.antonsvirid.model.logic;

import com.company.antonsvirid.model.entity.*;
import com.company.antonsvirid.model.entity.abstracts.Conditionable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HousewifeTest {
    @Test
    public void testHousewifeAllEquipmentsPower() throws Exception {
        Conditionable[] equipments = new Conditionable[]{
                new Kettle("bosch", 1800, 150, false),
                new Mixer("Kenwood", 500, 70, true),
                new Toaster("Philips", 900, 55, true),
                new Boombox("LG", 210, 180, false, 70)
        };

        int expected = 3410;

        int actual = Housewife.calculatedTotalPower(equipments);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testHousewifeSumSwitchedOnEquipmentsPowerWithAllTurnOff() throws Exception {
        Conditionable[] equipments = new Conditionable[]{
                new Kettle("bosch", 1800, 150, false),
                new Boombox("sony", 300, 210, true, 99),
                new Kettle("xiaomi", 1500, 75, false),
                new Mixer("Kenwood", 500, 70, true),
                new Toaster("Philips", 900, 55, true),
                new Boombox("LG", 210, 180, false, 70),
                new Vacuumcleaner("Dyson", 2500, 1200, false)
        };

        int expected = 0;

        int actual = Housewife.calculatedPowerWhoInset(equipments);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testHousewifeSumSwitchedOnEquipmentsPowerWithSwitchedTurnOnSomeDevices() throws Exception {
        Conditionable[] equipments = new Conditionable[]{
                new Kettle("bosch", 1800, 150, false),
                new Boombox("sony", 300, 210, true, 99),
                new Kettle("xiaomi", 1500, 75, false),
                new Mixer("Kenwood", 500, 70, true),
                new Toaster("Philips", 900, 55, true),
                new Boombox("LG", 210, 180, false, 70),
                new Vacuumcleaner("Dyson", 2500, 1200, false)

        };
        equipments[0].connectPlug();
        equipments[0].turnOn();
        equipments[1].turnOn();

        int expected = 2100;

        int actual = Housewife.calculatedPowerWhoInset(equipments);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testHousewifeSortEquipmentsForCostDESC() throws Exception {
        Conditionable[] equipments = new Conditionable[]{
                new Kettle("bosch", 1800, 150, false),
                new Boombox("sony", 300, 210, true, 99),
                new Kettle("xiaomi", 1500, 75, false),
                new Mixer("Kenwood", 500, 70, true),
                new Toaster("Philips", 900, 55, true),
                new Boombox("LG", 210, 180, false, 70)
        };

        String expected = "Philips Kenwood xiaomi bosch LG sony ";

        String actual = Housewife.sortEquipmentsForCost(equipments);

        assertEquals(expected, actual);
    }

    @Test
    public void testHousewifeWhoIsMaxPowerEquipmunt() throws Exception {
        Conditionable[] equipments = new Conditionable[]{
                new Kettle("bosch", 1800, 150, false),
                new Boombox("sony", 300, 210, true, 99),
                new Kettle("xiaomi", 1500, 75, false),
                new Mixer("Kenwood", 2100, 70, true),
                new Toaster("Philips", 900, 55, true),
                new Boombox("LG", 210, 180, false, 70)
        };

        String expected = "Kenwood";

        String actual = Housewife.whoIsMaxPowerEquipment(equipments);

        assertEquals(expected, actual);
    }

    @Test (expected = Exception.class)
    public void testHousewifeFoolProofWithNullArray() throws Exception {
        Conditionable[] equipments = new Conditionable[Integer.parseInt(null)];

        String actual = Housewife.whoIsMaxPowerEquipment(equipments);         // test is work without "actual" unit...
    }

    @Test (expected = Exception.class)
    public void testHousewifeFoolProofWithEmptyArray() throws Exception {
        Conditionable[] equipments = new Conditionable[0];

        int actual = Housewife.calculatedTotalPower(equipments);
    }

}

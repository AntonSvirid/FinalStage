package com.company.antonsvirid.model.entity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KettleTest {
    @Test
    public void testKettleGetPower() throws Exception{
        Kettle kettle1 = new Kettle("xiaomi", 1500, 700, true);

        int expected = 1500;

        int actual = kettle1.getPower();

        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testKettleGetCost() throws Exception{
        Kettle kettle1 = new Kettle("xiaomi", 1500, 700, true);

        int expected = 700;

        int actual = kettle1.getCost();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testKettleGetName() throws Exception{
        Kettle kettle1 = new Kettle("xiaomi", 1500, 700, true);

        String expected = "xiaomi";

        String actual = kettle1.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testKettleGetInSet() throws Exception{
        Kettle kettle1 = new Kettle("xiaomi", 1500, 700, true);

        boolean expected = true;

        boolean actual = kettle1.isInSet();

        assertEquals(String.valueOf(expected), String.valueOf(actual));
    }

    @Test
    public void testKettleGetturnOnStatus() throws Exception{
        Kettle kettle1 = new Kettle("xiaomi", 1500, 700, true);

        boolean expected = false;

        boolean actual = kettle1.isTurnOnStatus();

        assertEquals(String.valueOf(expected), String.valueOf(actual));
    }

    @Test
    public void testKettleSwithAndGetturnOnStatus() throws Exception{
        Kettle kettle1 = new Kettle("xiaomi", 1500, 700, true);
        kettle1.turnOn();
        kettle1.turnOff();

        boolean expected = false;

        boolean actual = kettle1.isTurnOnStatus();

        assertEquals(String.valueOf(expected), String.valueOf(actual));
    }



    @Test (expected = Exception.class)
    public void testKettleWithUncorrectPower() throws Exception{
        Kettle kettle1 = new Kettle("bosch", 16500, 700, true);

       int actual = kettle1.getPower();
    }

    @Test (expected = Exception.class)
    public void testKettleWithNegativPower() throws Exception{
        Kettle kettle1 = new Kettle("bosch", -1500, 700, true);

        int actual = kettle1.getPower();
    }

    @Test (expected = Exception.class)
    public void testKettleWithNegativetCost() throws Exception{
        Kettle kettle1 = new Kettle("bosch", 1900, -700, true);

        int actual = kettle1.getPower();
    }

}

package com.company.antonsvirid.model.entity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoomboxTest {
    @Test
    public void testBoomboxGetPower() throws Exception {
        Boombox boombox1 = new Boombox("sony", 300, 210, true, 99);

        int expected = 300;

        int actual = boombox1.getPower();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testBoomboxGetCost() throws Exception {
        Boombox boombox1 = new Boombox("sony", 300, 210, true, 99);

        int expected = 210;

        int actual = boombox1.getCost();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testBoomboxGetName() throws Exception {
        Boombox boombox1 = new Boombox("sony", 300, 210, true, 99);

        String expected = "sony";

        String actual = boombox1.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testBoomboxGetInSet() throws Exception {
        Boombox boombox1 = new Boombox("sony", 300, 210, true, 99);

        boolean expected = true;

        boolean actual = boombox1.isInSet();

        assertEquals(String.valueOf(expected), String.valueOf(actual));
    }

    @Test
    public void testBoomboxSwitchInSetAndGetInSet() throws Exception {
        Boombox boombox1 = new Boombox("sony", 300, 210, false, 99);
        boombox1.setInSet(true);

        boolean expected = true;

        boolean actual = boombox1.isInSet();

        assertEquals(String.valueOf(expected), String.valueOf(actual));
    }

    @Test
    public void testBoomboxGetturnOnStatus() throws Exception {
        Boombox boombox1 = new Boombox("sony", 300, 210, true, 99);

        boolean expected = false;

        boolean actual = boombox1.isTurnOnStatus();

        assertEquals(String.valueOf(expected), String.valueOf(actual));
    }

    @Test
    public void testBoomboxSwitchAndGetturnOnStatus() throws Exception {
        Boombox boombox1 = new Boombox("sony", 300, 210, true, 99);
        boombox1.turnOn();

        boolean expected = true;

        boolean actual = boombox1.isTurnOnStatus();

        assertEquals(String.valueOf(expected), String.valueOf(actual));
    }

    @Test
    public void testBoomboxSwitchVolumeAndGetVolume() throws Exception {
        Boombox boombox1 = new Boombox("sony", 300, 210, true, 99);
        boombox1.setVolume(54);

        int expected = 54;

        int actual = boombox1.getVolume();

        assertEquals(expected, actual, 0.001);
    }

    @Test(expected = Exception.class)
    public void testBoomboxWithUncorrectPower() throws Exception {
        Boombox boombox1 = new Boombox("sony", 20_000, 210, true, 99);

        int actual = boombox1.getPower();
    }

    @Test(expected = Exception.class)
    public void testBoomboxWithNegativPower() throws Exception {
        Boombox boombox1 = new Boombox("sony", -300, 210, true, 99);

        int actual = boombox1.getPower();
    }

    @Test(expected = Exception.class)
    public void testBoomboxWithNegativetCost() throws Exception {
        Boombox boombox1 = new Boombox("sony", 300, -210, true, 99);

        int actual = boombox1.getPower();
    }

    @Test(expected = Exception.class)
    public void testBoomboxTurnOnWithUnconnectPlug() throws Exception {
        Boombox boombox1 = new Boombox("sony", 300, 210, true, 99);
        boombox1.disConnectPlug();
        boombox1.turnOn();

    }

}

package by.itstep.antonsvirid.model.entity;

import by.itstep.antonsvirid.model.entity.abstracts.HouseEquipments;
import by.itstep.antonsvirid.model.entity.abstracts.TurnOnable;
import by.itstep.antonsvirid.model.entity.Kettle;


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
}

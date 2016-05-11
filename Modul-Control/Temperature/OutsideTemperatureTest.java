package com.example.nicoletatanasa.internetofthings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nicoleta Tanasa on 11-May-16.
 */
public class OutsideTemperatureTest {

    @Test
    public void testGetCurrentTemperature() throws Exception {
        System.out.println("getTemperature(outside)");
        OutsideTemperature instance = new OutsideTemperature();
        instance.setCurrentTemperature(20);
        int currentTemperature = 20;
        int result = instance.getCurrentTemperature();
        int expResult = 20;
        assertEquals(expResult, result);
    }
}
package com.example.nicoletatanasa.internetofthings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nicoleta Tanasa on 11-May-16.
 */
public class InsideTemperatureTest {

    /* test returnare valoare corecta a temperaturii */
    @Test
    public void testGetCurrentTemperature() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(20);
        int result = instance.getCurrentTemperature();
        int expResult = 20;
        assertEquals(expResult, result);
    }

    /* test setare corecta a noii valori */
    @Test
    public void testSetTemperatureUp() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(20);
        int currentTemperature = 10;
        instance.setTemperatureUp(currentTemperature);
        int result = instance.getCurrentTemperature();
        int expResult = 30;
        assertEquals(expResult, result);
    }

    /* test setare corecta a noii valori */
    @Test
    public void testSetTemperatureDown() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(20);
        int currentTemperature = 10;
        instance.setTemperatureDown(currentTemperature);
        int result = instance.getCurrentTemperature();
        int expResult = 10;
        assertEquals(expResult, result);
    }

    /* test setare corecta a noii valori */
    @Test
    public void testSetTemperatureUpProcent() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(10);
        int currentTemperature = 30;
        instance.setTemperatureUpProcent(currentTemperature);
        int result = instance.getCurrentTemperature();
        int expResult = 13;
        assertEquals(expResult, result);
    }

    /* test setare corecta a noii valori */
    @Test
    public void testSetTemperatureDownProcent() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(20);
        int currentTemperature = 10;
        instance.setTemperatureDownProcent(currentTemperature);
        int result = instance.getCurrentTemperature();
        int expResult = 18;
        assertEquals(expResult, result);
    }

    /* test executie in caz de primire valoare corecta*/
    @Test
    public void testSetTemperatureUpBool() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(20);
        int currentTemperature = 10;
        boolean result = instance.setTemperatureUp(currentTemperature);
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    /* test executie in caz de primire valoare corecta*/
    @Test
    public void testSetTemperatureDownBool() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(20);
        int currentTemperature = 10;
        boolean result = instance.setTemperatureDown(currentTemperature);
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    /* test executie in caz de primire valoare corecta*/
    @Test
    public void testSetTemperatureUpProcentBool() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(10);
        int currentTemperature = 30;
        boolean result = instance.setTemperatureUpProcent(currentTemperature);
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    /* test executie in caz de primire valoare corecta*/
    @Test
    public void testSetTemperatureDownProcentBool() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(20);
        int currentTemperature = 10;
        boolean result = instance.setTemperatureDownProcent(currentTemperature);
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    /* test executie in caz de primire valoare incorecta(prea mica/mare)*/
    @Test
    public void testSetTemperatureUpBoolFalse() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(20);
        int currentTemperature = 30;
        boolean result = instance.setTemperatureUp(currentTemperature);
        boolean expResult = false;
        assertEquals(expResult, result);
    }

    /* test executie in caz de primire valoare incorecta(prea mica/mare)*/
    @Test
    public void testSetTemperatureDownBoolFalse() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(20);
        int currentTemperature = 30;
        boolean result = instance.setTemperatureDown(currentTemperature);
        boolean expResult = false;
        assertEquals(expResult, result);
    }

    /* test executie in caz de primire valoare incorecta(prea mica/mare)*/
    @Test
    public void testSetTemperatureUpProcentBoolFalse() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(10);
        int currentTemperature = 70;
        boolean result = instance.setTemperatureUpProcent(currentTemperature);
        boolean expResult = false;
        assertEquals(expResult, result);
    }

    /* test executie in caz de primire valoare incorecta(prea mica/mare)*/
    @Test
    public void testSetTemperatureDownProcentBoolFalse() throws Exception {
        InsideTemperature instance = new InsideTemperature();
        instance.setCurrentTemperature(20);
        int currentTemperature = 70;
        boolean result = instance.setTemperatureDownProcent(currentTemperature);
        boolean expResult = false;
        assertEquals(expResult, result);
    }
}
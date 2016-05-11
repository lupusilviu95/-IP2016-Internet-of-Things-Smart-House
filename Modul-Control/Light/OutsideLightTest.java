package com.example.proiectIP

import org.junit.Test;

import static org.junit.Assert.*;

public class OutsideLightTest {

    
    @Test
    public void testGetCurrentLight() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(20);
        int result = instance.getCurrentLight();
        int expResult = 20;
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLightUp() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(20);
        int currentLight = 10;
        instance.setLightUp(currentLight);
        int result = instance.getCurrentLight();
        int expResult = 30;
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLightDown() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(20);
        int currentLight = 10;
        instance.setLightDown(currentLight);
        int result = instance.getCurrentLight();
        int expResult = 10;
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLightUpProcent() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(10);
        int currentLight = 30;
        instance.setLightUpProcent(currentLight);
        int result = instance.getCurrentLight();
        int expResult = 13;
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLightDownProcent() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(20);
        int currentLight = 10;
        instance.setLightDownProcent(currentLight);
        int result = instance.getCurrentLight();
        int expResult = 18;
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLightUpBool() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(20);
        int currentLight = 10;
        boolean result = instance.setLightUp(currentLight);
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLightDownBool() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(20);
        int currentLight = 10;
        boolean result = instance.setLightDown(currentLight);
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLightUpProcentBool() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(10);
        int currentLight = 30;
        boolean result = instance.setLightUpProcent(currentLight);
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLightDownProcentBool() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(20);
        int currentLight = 10;
        boolean result = instance.setLightDownProcent(currentLight);
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLightUpBoolFalse() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(20);
        int currentLight = 30;
        boolean result = instance.setLightUp(currentLight);
        boolean expResult = false;
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLightDownBoolFalse() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(20);
        int currentLight = 30;
        boolean result = instance.setLightDown(currentLight);
        boolean expResult = false;
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLightUpProcentBoolFalse() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(10);
        int currentLight = 70;
        boolean result = instance.setLightUpProcent(currentLight);
        boolean expResult = false;
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetLightDownProcentBoolFalse() throws Exception {
        OutsideLight instance = new OutsideLight();
        instance.setCurrentLight(20);
        int currentLight = 70;
        boolean result = instance.setLightDownProcent(currentLight);
        boolean expResult = false;
        assertEquals(expResult, result);
    }
}
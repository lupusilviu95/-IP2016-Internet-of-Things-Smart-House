package com.example.madalina.internetofthings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Madalina on 11-May-16.
 */
public class InsideHumidityTest {

    @Test
    public void testGetCurrentStatus() throws Exception {
        System.out.println("getCurrentStatus");
        InsideHumidity insideHumidity = new InsideHumidity();

        boolean expectedResult = true;
        boolean result = insideHumidity.getCurrentStatus();
        assertEquals(expectedResult, result);
    }
    @Test
    public void testSetCurrentStatus() throws Exception {
        System.out.println("setCurrentStatus");
        InsideHumidity insideHumidity = new InsideHumidity();

        insideHumidity.setCurrentStatus(false);
        boolean expectedResult = false;
        boolean result = insideHumidity.getCurrentStatus();
        assertEquals(expectedResult, result);
    }
    @Test
    public void testSetStatus() throws Exception {
        System.out.println("setStatus");
        InsideHumidity insideHumidity = new InsideHumidity();

        boolean currentStatus = insideHumidity.getCurrentStatus();
        boolean result = insideHumidity.setStatus(true);
        if(currentStatus){
            boolean expectedResult = false;
            assertEquals(expectedResult, result);
        }
        else{
            boolean expectedResult = true;
            assertEquals(expectedResult, result);
        }
    }
}
package com.example.madalina.internetofthings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Madalina on 11-May-16.
 */
public class HouseDoorTest {

    @Test
    public void testGetCurrentStatus() throws Exception {
        System.out.println("getCurrentStatus");
        HouseDoor houseDoor = new HouseDoor();

        boolean expectedResult = true;
        boolean result = houseDoor.getCurrentStatus();
        assertEquals(expectedResult, result);
    }
    @Test
    public void testSetCurrentStatus() throws Exception {
        System.out.println("setCurrentStatus");
        HouseDoor houseDoor = new HouseDoor();

        houseDoor.setCurrentStatus(false);
        boolean expectedResult = false;
        boolean result = houseDoor.getCurrentStatus();
        assertEquals(expectedResult, result);
    }
    @Test
    public void testSetStatus() throws Exception {
        System.out.println("setStatus");
        HouseDoor houseDoor = new HouseDoor();

        boolean currentStatus = houseDoor.getCurrentStatus();
        boolean result = houseDoor.setStatus(true);
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
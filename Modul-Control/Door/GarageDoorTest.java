package com.example.madalina.internetofthings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Madalina on 11-May-16.
 */
public class GarageDoorTest {

    @Test
    public void testGetCurrentStatus() throws Exception {
        System.out.println("getCurrentStatus");
        GarageDoor garageDoor = new GarageDoor();

        boolean expectedResult = true;
        boolean result = garageDoor.getCurrentStatus();
        assertEquals(expectedResult, result);
    }
    @Test
    public void testSetCurrentStatus() throws Exception {
        System.out.println("setCurrentStatus");
        GarageDoor garageDoor = new GarageDoor();

        garageDoor.setCurrentStatus(false);
        boolean expectedResult = false;
        boolean result = garageDoor.getCurrentStatus();
        assertEquals(expectedResult, result);
    }
    @Test
    public void testSetStatus() throws Exception {
        System.out.println("setStatus");
        GarageDoor garageDoor = new GarageDoor();

        boolean currentStatus = garageDoor.getCurrentStatus();
        boolean result = garageDoor.setStatus(true);
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
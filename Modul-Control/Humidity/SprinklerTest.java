package com.example.madalina.internetofthings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Madalina on 11-May-16.
 */
public class SprinklerTest {
    @Test
    public void testGetCurrentStatus() throws Exception {
        System.out.println("getCurrentStatus");
        Sprinkler sprinkler = new Sprinkler();

        boolean expectedResult = true;
        boolean result = sprinkler.getCurrentStatus();
        assertEquals(expectedResult, result);
    }
    @Test
    public void testSetCurrentStatus() throws Exception {
        System.out.println("setCurrentStatus");
        Sprinkler sprinkler = new Sprinkler();

        sprinkler.setCurrentStatus(false);
        boolean expectedResult = false;
        boolean result = sprinkler.getCurrentStatus();
        assertEquals(expectedResult, result);
    }
    @Test
    public void testSetStatus() throws Exception {
        System.out.println("setStatus");
        Sprinkler sprinkler = new Sprinkler();

        boolean currentStatus = sprinkler.getCurrentStatus();
        boolean result = sprinkler.setStatus(true);
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
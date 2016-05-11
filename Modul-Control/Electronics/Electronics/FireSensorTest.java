/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iptest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acasa
 */
public class FireSensorTest {
    @Test
    public void testSetOn() {
        System.out.println("setOn");
        
        FireSensor fireSensor = new FireSensor();
        fireSensor.setStatus(false);
        
        boolean expResult = true;
        boolean result = fireSensor.setOn();
        
        assertEquals(expResult, result);
    }

    @Test
    public void testSetOff() {
        System.out.println("setOff");
        
        FireSensor fireSensor = new FireSensor();
        fireSensor.setStatus(true);
        
        boolean expectedResult = true;
        boolean result = fireSensor.setOff();
        
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        
        FireSensor fireSensor = new FireSensor();
        
        boolean statusCurent = fireSensor.getStatus();
        fireSensor.setStatus(statusCurent);
        
        boolean result = fireSensor.getStatus();
        
        if(statusCurent = true){
            boolean expectedResult = true;
            assertEquals(expectedResult, result);
        }
        else{
            boolean expectedResult = false;
            assertEquals(expectedResult, result);
        }
    }

    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        
        FireSensor fireSensor = new FireSensor();
        
        boolean expectedResult = true;
        boolean result = fireSensor.getStatus();
        
        assertEquals(expectedResult, result);
    }
    
}

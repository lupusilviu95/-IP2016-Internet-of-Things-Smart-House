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
public class MotionSensorTest {
    
    @Test
    public void testSetOn() {
        System.out.println("setOn");
        
        MotionSensor motionSensor = new MotionSensor();
        motionSensor.setStatus(false);
        
        boolean expResult = true;
        boolean result = motionSensor.setOn();
        
        assertEquals(expResult, result);
    }

    @Test
    public void testSetOff() {
        System.out.println("setOff");
        
        MotionSensor motionSensor = new MotionSensor();
        motionSensor.setStatus(true);
        
        boolean expResult = true;
        boolean result = motionSensor.setOff();
        
        assertEquals(expResult, result);
    }

    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
             
        MotionSensor motionSensor = new MotionSensor();
        
        boolean statusCurent =  motionSensor.getStatus();
        motionSensor.setStatus(statusCurent);
        boolean result = motionSensor.getStatus();
        
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
        
        MotionSensor motionSensor = new MotionSensor();
        
        boolean expResult = true;
        boolean result = motionSensor.getStatus();
        
        assertEquals(expResult, result);
    }
    
}

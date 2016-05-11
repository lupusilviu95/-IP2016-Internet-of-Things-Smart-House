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
public class LawnMowerTest {
    
    @Test
    public void testSetOn() {
        System.out.println("setOn");
        
        LawnMower lawnMower = new LawnMower();
        lawnMower.setStatus(false);
        
        boolean expResult = true;
        boolean result = lawnMower.setOn();
        
        assertEquals(expResult, result);
    }

    @Test
    public void testSetOff() {
        System.out.println("setOff");
        
        LawnMower lawnMower = new LawnMower();
        lawnMower.setStatus(true);
        
        boolean expResult = true;
        boolean result = lawnMower.setOff();
        
        assertEquals(expResult, result);
    }

    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
              
        LawnMower lawnMower = new LawnMower();
        
        boolean statusCurent = lawnMower.getStatus();
        lawnMower.setStatus(statusCurent);
        boolean result = lawnMower.getStatus();
        
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
        
        LawnMower lawnMower = new LawnMower();
        
        boolean expectedResult = true;
        boolean result = lawnMower.getStatus();
        
        assertEquals(expectedResult, result);
    }
    
}

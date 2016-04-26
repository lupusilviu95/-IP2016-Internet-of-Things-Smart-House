package com.example.nicoletatanasa.internetofthings;
/**
 * Created by Nicoleta Tanasa on 24-Apr-16.
 */
public class InsideTemperature implements Temperature {
    public int currentTemp;

    @Override
    public int getCurrentTemperature(){
        return currentTemp;
    }

    public boolean setTemepratureUp(int nrGrade) {
        if(nrGrade <= 15){
            currentTemp += getCurrentTemperature();
            return true; // The temperature is changed!
        }
        else return false; // The value should be smaller than 15 because increasing/decreasing temperature with more than 15 degrees at once is not normal!
    }

    public boolean setTemepratureDown(int nrGrade) {
        if(nrGrade <= 15){
            currentTemp -= getCurrentTemperature();
            return true; // The temperature is changed!
        }
        else return false; // The value should be smaller than 15 because increasing/decreasing temperature with more than 15 degrees at once is not normal!
    }

    public boolean setTemepratureUpProcent(int procent) {
        if(procent <= 50) {
            currentTemp += currentTemp * (procent / 100);
            return true; // The temperature is changed!
        }
        else return false; // The value should be smaller than 50% because increasing/decreasing temperature with more than 50% at once is not normal!
    }

    public boolean setTemepratureDownProcent(int procent) {
        if(procent <= 50) {
            currentTemp -= currentTemp * (procent / 100);
            return true; // The temperature is changed!
        }
        else return false; // The value should be smaller than 50% because increasing/decreasing temperature with more than 50% at once is not normal!
    }
}

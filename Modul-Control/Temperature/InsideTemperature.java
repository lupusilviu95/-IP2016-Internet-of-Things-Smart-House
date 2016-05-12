package com.example.nicoletatanasa.internetofthings;
/**
 * Created by Nicoleta Tanasa on 24-Apr-16.
 */
public class InsideTemperature implements Temperature {
    public int currentTemp;
    public int currentTempHelp;
    public int limit = 15;
    public int limitProcent = 50;

    public void setCurrentTemperature(int initialTemp){
        currentTemp = initialTemp;
    }

    @Override
    public int getCurrentTemperature(){
        return currentTemp;
    }

    public boolean setTemperatureUp(int nrGrade) {
        if(nrGrade <= limit){
            currentTemp = this.getCurrentTemperature();
            currentTemp += nrGrade;
            return true; // The temperature is changed!
        }
        else return false; // The value should be smaller than 15 because increasing/decreasing temperature with more than 15 degrees at once is not normal!
    }

    public boolean setTemperatureDown(int nrGrade) {
        if(nrGrade <= limit){
            currentTemp = this.getCurrentTemperature();
            currentTemp -= nrGrade;
            return true; // The temperature is changed!
        }
        else return false; // The value should be smaller than 15 because increasing/decreasing temperature with more than 15 degrees at once is not normal!
    }

    public boolean setTemperatureUpProcent(int procent) {
        if(procent <= limitProcent) {
            currentTempHelp = this.getCurrentTemperature();
            currentTemp = currentTempHelp + (currentTempHelp * procent / 100);
            return true; // The temperature is changed!
        }
        else return false; // The value should be smaller than 50% because increasing/decreasing temperature with more than 50% at once is not normal!
    }

    public boolean setTemperatureDownProcent(int procent) {
        if(procent <= limitProcent) {
            currentTempHelp = this.getCurrentTemperature();
            currentTemp = currentTempHelp - (currentTempHelp * procent / 100);
            return true; // The temperature is changed!
        }
        else return false; // The value should be smaller than 50% because increasing/decreasing temperature with more than 50% at once is not normal!
    }
}

package com.example.nicoletatanasa.internetofthings;
/**
 * Created by Nicoleta Tanasa on 24-Apr-16.
 */
public class OutsideTemperature implements Temperature {
    public int currentTemp;

    @Override
    public int getCurrentTemperature(){
        return currentTemp;
    }

}

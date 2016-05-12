package com.example.madalina.internetofthings;

/**
 * Created by Madalina on 24-Apr-16.
 */
public interface Door {
    public void setCurrentStatus(boolean status);
    public boolean setStatus(boolean status); // return true if status has changed
}

/**
 * Created by acasa on 24.04.2016.
 */
public class MotionSensor implements Electronics{
    //currentStatus = true => OPEN
    //currentStatus = false => CLOSE
    private boolean currentStatus = true;
    
    public boolean setOn(){
        if(this.currentStatus == false) {//Motion sensor closed=> open=Operation successfully completed
            this.currentStatus = true;
            return true;
        }
        else {//Motion sensor is already open=> false=Operation failed
            return false;
        }
    }

    public boolean setOff(){
        if(this.currentStatus == true) {//Motion sensor open=> closed=Operation successfully completed
            this.currentStatus = false;
            return true;
        }
        else {//Motion sensor is already closed=> false=Operation failed
            return false;
        }
    }
    public void setStatus(boolean statusInit){
        this.currentStatus=statusInit;
    }

    public boolean getStatus(){
        return this.currentStatus;
    }
}
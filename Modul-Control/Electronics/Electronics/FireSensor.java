/**
 * Created by acasa on 24.04.2016.
 */
public class FireSensor implements Electronics {
    //currentStatus = true => OPEN
    //currentStatus = false => CLOSE

    private boolean currentStatus = true;

    public boolean setOn() {

        if (this.currentStatus == false) {
            this.currentStatus = true; //Fire sensor closed=> open=Operation successfully completed
            return true;
        } else { //Fire sensor is already open=> false=Operation failed
            return false;
        }
    }

    public boolean setOff() {

        if (this.currentStatus == true) {
            this.currentStatus = false;//Fire sensor open=> closed=Operation successfully completed
            return true;
        } else {//Fire sensor is already closed=> false=Operation failed
            return false;
        }
    }

    public void setStatus(boolean statusInit) {
        if (this.currentStatus != statusInit) {
            this.currentStatus = statusInit;
        }
    }

    public boolean getStatus() {
        return this.currentStatus;
    }
}
/**
 * Created by Madalina on 24-Apr-16.
 */
public class HouseDoor implements Door {
    boolean currentStatus = true;

    boolean getCurrentStatus(){
        return currentStatus;
    }

    @Override
    public void setCurrentStatus(boolean status) {
        this.currentStatus = status;
    }

    @Override
    public boolean setStatus(boolean status) {
        if(status != currentStatus){
            currentStatus = status;
            return true;
        }
        else{
            return false;
        }
    }
}

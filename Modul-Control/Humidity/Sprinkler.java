/**
 * Created by Madalina on 24-Apr-16.
 */
public class Sprinkler implements HumidityController {
    boolean currentStatus = true;

    @Override
    public void setCurrentStatus(boolean currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public boolean setStatus(boolean status){
        //return true if the currentStatus has changed
        if(status != currentStatus){
            currentStatus = status;
            return true;
        }
        else{
            return false;
        }
    }
}

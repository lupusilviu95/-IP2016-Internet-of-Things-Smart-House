/**
 * Created by Madalina on 24-Apr-16.
 */
public class InsideHumidity implements HumidityController {
    boolean currentStatus = true;

    boolean getHumidity(){
        return currentStatus;
    }

    @Override
    public void setCurrentStatus(boolean currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public boolean setStatus(boolean status) {
        if(status != currentStatus) {
            currentStatus = status;
            return true;
        }
        else{
            return false;
        }
    }
}

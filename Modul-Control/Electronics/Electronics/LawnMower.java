/**
 * Created by acasa on 24.04.2016.
 */
public class LawnMower implements Electronics{
    //currentStatus = true => OPEN
    //currentStatus = false => CLOSE
    private boolean currentStatus = true;
    
    public boolean setOn(){
       if(this.currentStatus == false) {//LawnMower closed=> open=Operation successfully completed
           this.currentStatus = true;
           return true;
       }
       else {//LawnMower is already open=> false=Operation failed
           return false;
       }
    }
    
    public boolean setOff(){
        if(this.currentStatus == true) {//Lawn Mower open=> closed=Operation successfully completed
            this.currentStatus = false;
            return true;
        }
         else {//LawnMower is already closed=> false=Operation failed
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
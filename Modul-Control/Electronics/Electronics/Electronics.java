/**
 * Created by acasa on 24.04.2016.
 */
interface Electronics {
    public boolean setOn();//open up the device
    public boolean setOff();//close up the device

    //pentru teste
    public void setStatus(boolean statusInit);
    public boolean getStatus();
}
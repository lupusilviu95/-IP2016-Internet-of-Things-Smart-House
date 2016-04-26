
public class InsideLight implements Light{

    public int lightStatus = 0;
    public int helpValue; // usefull in the calculus
    public String updateMessageIncrease = "The lights have increased!";
    public String updateMessageDecrease = "The lights have decreased!";
    public String maxLight = "The light is already at full bright";
    public String minLight = "The light is already turned off";
    public String onMessage = "The lights have been turned on";
    public String offMessage = "The light has been shut off";


    @Override
    public String setLightIncreasePercent(int percentValue) {
        if(getLightStatus()==0)
            return minLight;
        else
        {
            helpValue=getLightStatus();
            setLightStatus( helpValue + helpValue * (percentValue/100));
            return updateMessageIncrease;
        }
    }

    @Override
    public String setLightDecreasePercent(int percentValue) {

        if(getLightStatus()==0)
            return minLight;
        else
        {
            setLightStatus( helpValue - helpValue * (percentValue/100));
            return updateMessageDecrease;
        }
    }

    @Override
    public String setLightOff() {

        if(getLightStatus()==0)
            return minLight;
        else {
            setLightStatus(0);
            return offMessage;
        }
    }

    @Override
    public String setLightOn() {

        if(getLightStatus()==100)
            return maxLight;
        else {
            setLightStatus(100);
            return onMessage;
        }

    }

    @Override
    public int getLightStatus() {
        return lightStatus;
    }


    public void setLightStatus(int value){
        lightStatus = value;
    }
}

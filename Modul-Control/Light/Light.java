
public interface Light {
    public String setLightIncreasePercent(int percentValue);

    public String setLightDecreasePercent(int percentValue);

    public String setLightOff();

    public String setLightOn();

    public int getLightStatus();

    public void setLightStatus(int value);
}

package AirCondition;

public class AirConditioner {
    private boolean isOn;
    private int currentTemperature = 16;


    public boolean isOn(){

             return  isOn;
    }
public void setOn(boolean isOn){

             this.isOn = isOn;
}

    public int getCurrentTemperature() {

              return currentTemperature;
    }

    public void increaseTemperature() {
        if(currentTemperature<30)
    currentTemperature = currentTemperature +1;
    }
}

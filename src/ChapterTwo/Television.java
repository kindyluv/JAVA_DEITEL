package ChapterTwo;

public class Television {
    private boolean isOn;
    private int channel;
    private int volume;

    public Television() {
        channel = 12;
        volume = 3;
    }


    public void turnOn(boolean powerOn) {
        if (powerOn = true) {
            isOn = false;
        }
    }

    public boolean isOn() {

        return isOn;
    }

    public void nextChannel() {

        channel++;
    }

    public int getChannel() {

          return channel;
    }

    public void previousChannel() {

        channel--;
    }

    public void increaseVolume() {
        if (volume <=100) {volume++;}
        if (volume > 100) {volume = 100;}
    }

    public int getVolume() {

          return volume;
    }

    public void decreaseVolume() {
    if (volume >= 0) {volume--;}
    if (volume < 0) {volume = 0;}
    }
}

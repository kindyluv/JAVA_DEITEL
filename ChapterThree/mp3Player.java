package mp3PlayerProject;

public class mp3Player {
private boolean isOn;
private boolean isOff;
    private int volume;
    private boolean player;
    private int songNumber;

    public mp3Player(){
    volume = 10;
    songNumber = 2;
}
    public void turnOn() {
        isOn = true;
    }
    public boolean isOn(){
        return isOn;
    }

    public void turnOff() {
        isOff = false;
    }
    public boolean isOff(){
        return isOff;
    }

    public void increaseVolume() {
        if (volume <= 100) {
            volume++;
        }
        if (volume > 100) {
        volume = 100;
        }
    }
    public void decreaseVolume() {
        if (volume >= 0){
            volume--;
        }
        if (volume < 0){
            volume = 0;
        }
    }

    public int getVolume() {
    return volume;
    }


    public void playMusic() {
     player = true;
    }

    public boolean getPlayer() {
        return player;
    }

    public void nextMusic() {
        songNumber = songNumber +1;
    }

    public void previousMusic(){
        songNumber = songNumber -1;
    }

    public int getSongNumber() {
        return songNumber;
    }

    public void playRadio() {
        player = true;
    }

    public void memoryCard() {
        player = true;
    }

    public void bluetoothConnect() {
            player = true;
    }
}

package RemoteProject;

public class Remote {
    private boolean isOn;
    private int channel;
    private boolean playMusic;
    private boolean pauseMusic;
    private boolean muteMusic;

    public Remote(){

        channel = 5;
    }

    public void turnOn(boolean turnedOn) {
        this.isOn = turnedOn;
        if (turnedOn = true){
            isOn = false;
        }
    }
    public boolean isOn(){

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

    public void playMusic(boolean play) {
        this.playMusic = playMusic;
        if (play = true){
            playMusic = false;
        }
    }
        public boolean getPlayMusic() {
            return playMusic;
        }
        public void pauseMusic() {
            this.pauseMusic = pauseMusic;
            if (pauseMusic == false) {
                pauseMusic = true;
            }
        }
    public boolean getPauseMusic() {
        return pauseMusic;
    }

    public void muteMusic(boolean turnOn) {
        this.muteMusic = muteMusic;
        muteMusic = true;
    }
    public boolean getMuteMusic(){
        return muteMusic;
    }
}
package Mp3Project;

import static Mp3Project.MusicState.*;
import static Mp3Project.PlayMode.*;
import static Mp3Project.Power.*;
import static Mp3Project.Volume.*;

public class Mp3Player {
    private Power power = OFF;
    private MusicState musicState = STOP;
    private Volume volume ;
    private PlayList playList = new PlayList();
    private PlayMode playMode = LINEAR;


    public Power getPower() {
        return power;
    }

    public void isOn() {
        if (power == OFF)
            power = ON;
    }

    public void isOff() {
        if (power == ON) power = OFF;
    }

    public void playMusic() {
        boolean isNotPlaying = musicState != PLAY;
        if (isNotPlaying) changeMusicStateTo(PLAY);
    }


    public void pauseMusic() {
        boolean isPlaying = musicState != STOP;
        if (isPlaying) changeMusicStateTo(PAUSE);
    }

//    private void changeMusicStateTo(MusicState musicMode) {
//        musicState = musicMode;
//    }
//
//    public MusicState getMusicState() {
//        return musicState;
//    }
//
//
//    public PlayList getPlayList() {
//        return playList;
//    }
//
//    public void shuttleMusic() {
//        if (playMode == LINEAR) changePlayModeTo(SHUFFLE);
//    }
//
//    private void changePlayModeTo(PlayMode random) {
//        playMode = random;
//    }
//
//    public PlayMode getPlayMode() {
//        return playMode;
//    }
//
//    public void linearMusic() {
//        if (playMode == SHUFFLE) changePlayModeTo(LINEAR);
//    }
//
//    public void increaseVolume() {
//        Volume.increaseVolumeLevel();
//    }
//
//    public void decreaseVolume() {
//        Volume.decreaseVolumeLevel();
//    }
}

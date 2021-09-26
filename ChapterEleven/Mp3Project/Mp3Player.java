package ChapterEleven;

import static ChapterEleven.MusicState.*;
import static ChapterEleven.PlayMusic.*;
import static ChapterEleven.PlaySong.*;
import static ChapterEleven.Power.*;


public class Mp3Player {
    private PlayList playList;
    private Power power = OFF;
    private MusicState musicState = STOP;
    private Volume volume;
    private PlaySong playSong;
    private PlayMusic playMusic = LINER;
    private Music music;

    public Power isOff() {
        if (power == ON) changePowerTo(OFF);

        return power;
    }

    private void changePowerTo(Power powerMode) {
        power = powerMode;
    }

    public Power isOn() {
        if (power == OFF) changePowerTo(ON);
        return power;
    }
//
//    public Power getPower() {
//        return power;
//    }
//
//    public void playMusic() {
//        boolean isNotPlaying = musicState != PLAY;
//        if (isNotPlaying) changeMusicStateTo(PLAY);
//
//    }
//
//    private void changeMusicStateTo(MusicState musicMode) {
//        musicState = musicMode;
//    }
//
//    public void pauseMusic() {
//        if (musicState == PLAY) changeMusicStateTo(PAUSE);
//
//    }
//
//    public void increaseVolume() {
//        VolumeLevel.increaseLevel();
//    }
//
//    public void decreaseVolume() {
//        VolumeLevel.decreaseLevel();
//    }
//
//    public PlaySong nextMusic() {
//        return NEXT;
//    }
//
//    private void changeMusicPlayingStateTo(PlaySong playingMode) {
//        playSong = playingMode;
//    }
//
//
//    public PlaySong previousMusic() {
//        return PREVIOUS;
//    }
//
//    public MusicState getMusicState() {
//        return musicState;
//
//    }
//
//    public Volume getVolume() {
//        return volume;
//    }
//
//    public void musicList() {
//
//    }
//
//    public PlayList addMusic() {
//
//        return playList;
//    }
//
//    public void shufflePlaying() {
//        if (playMusic == LINER) changePlayMusicTo(SHUFFLEPLAYING);
//    }
//
//    public void linerPlaying() {
//        if (playMusic == SHUFFLEPLAYING) changePlayMusicTo(LINER);
//
//    }
//
//    public void changePlayMusicTo(PlayMusic random) {
//        playMusic = random;
//    }
//
//    public PlayMusic getPlayMusic() {
//        return playMusic;
//    }
//
//    public Music getMusic() {
//        return music;
//    }

//    public PlaySong getPlaySong() {
//        return playSong;
//    }
}



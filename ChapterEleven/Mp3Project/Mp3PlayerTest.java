package ChapterEleven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp3PlayerTest {
    Mp3Player oraimo = new Mp3Player();
    Power power = oraimo.getPower();

    @BeforeEach
    public void displayBeforeEach(){
        Mp3Player oraimo = new Mp3Player();
        Power power = oraimo.getPower();

    }

    @Test
    public void testThatMp3IsOffByDefault() {
        //given
        assertEquals(Power.OFF, oraimo.getPower());
    }

    @Test
    public void testThatMp3CanBeTurnedOn(){
        //given
//        oraimo.isOff();
        assertEquals(Power.OFF, oraimo.getPower());
        //when
        oraimo.isOn();
        //assert
        assertEquals(Power.ON, oraimo.getPower());
    }

    @Test
    public void testThatMp3CanBeTurnedOff(){
        //given
//        oraimo.isOff();
        oraimo.isOn();
        assertEquals(Power.ON, oraimo.getPower());
        //when
        oraimo.isOff();
        //assert
        assertEquals(Power.OFF, oraimo.getPower());
    }

    @Test
    public void testThatMp3CanPlayMusic(){
        //given
        assertEquals(MusicState.STOP, oraimo.getMusicState());
        //when
        oraimo.playMusic();
        //assert
        assertEquals(MusicState.PLAY, oraimo.getMusicState());
    }

//    @Test
//    public void testThatMp3CanPauseMusic(){
//        //given
//        oraimo.playMusic();
//        assertEquals(MusicState.PLAY, oraimo.getMusicState());
//        //when
//        oraimo.pauseMusic();
//        //assert
//        assertEquals(MusicState.PAUSE, oraimo.getMusicState());
//    }
//
//    @Test
//    public void testThatMp3CanIncreaseVolume(){
//        //given
//        //when
//        oraimo.increaseVolume();
//        oraimo.increaseVolume();
//        oraimo.increaseVolume();
//        oraimo.increaseVolume();
//        oraimo.increaseVolume();
//        oraimo.increaseVolume();
//        oraimo.increaseVolume();
//        oraimo.increaseVolume();
//
//        //assert
//        assertEquals(40, VolumeLevel.getVolumeLevel());
//    }
//
//    @Test
//    public void testThatMp3CanDecreaseVolume(){
//        //given
//        oraimo.increaseVolume();
//        oraimo.increaseVolume();
//
//        assertEquals(10, VolumeLevel.getVolumeLevel());
//        //when
//        oraimo.decreaseVolume();
//        //assert
//        assertEquals(5, VolumeLevel.getVolumeLevel());
//    }
//
//    @Test
//    public void testThatMp3CannotIncreaseVolumeBeyond100(){
//        //given
//        //when
//        for (int i = 0; i <= 29; i++) {
//            oraimo.increaseVolume();
//        }
//        //assert
//        assertEquals(100, VolumeLevel.getVolumeLevel());
//    }
//
//    @Test
//    public void testThatMp3CannotDecreaseVolumeBelowZero(){
//        //given
//        oraimo.increaseVolume();
//        assertEquals(5, VolumeLevel.getVolumeLevel());
//        //when
//        for (int i = 0; i < 15; i++) {
//            oraimo.decreaseVolume();
//        }
//        //assert
//        assertEquals(0, VolumeLevel.getVolumeLevel());
//    }
//
//    @Test
//    public void testThatMp3CanNextMusic(){
//        //given
//        oraimo.playMusic();
//        assertEquals(MusicState.PLAY, oraimo.getMusicState());
//        //when
//        oraimo.nextMusic();
//        //assert
//        assertEquals(PlaySong.NEXT, oraimo.nextMusic());
//    }
//
//    @Test
//    public void testThatMp3CanPreviousMusic(){
//        //given
//        oraimo.playMusic();
//        assertEquals(MusicState.PLAY, oraimo.getMusicState());
//        //when
//        oraimo.previousMusic();
//        //assert
//        assertEquals(PlaySong.PREVIOUS, oraimo.previousMusic());
//    }
//
//    @Test
//    public void testThatMp3CanPlayMusicAtLinear(){
//        //given
//        oraimo.playMusic();
//        assertEquals(MusicState.PLAY, oraimo.getMusicState());
//        oraimo.shufflePlaying();
//        assertEquals(PlayMusic.SHUFFLEPLAYING, oraimo.getPlayMusic());
//        //when
//        oraimo.linerPlaying();
//        //assert
//        assertEquals(PlayMusic.LINER, oraimo.getPlayMusic());
//    }
//
//    @Test
//    public void testThatMp3CanPlayMusicAtRandom(){
//        //given
//        oraimo.playMusic();
//        assertEquals(MusicState.PLAY, oraimo.getMusicState());
//        oraimo.linerPlaying();
//        assertEquals(PlayMusic.LINER, oraimo.getPlayMusic());
//        //when
//        oraimo.shufflePlaying();
//        //assert
//        assertEquals(PlayMusic.SHUFFLEPLAYING, oraimo.getPlayMusic());
//    }
////    @Test
////    public void testThatMp3CanAddMusicToPlayList(){
////        //given
////        oraimo.musicList();
////        //when
////        PlayList playList = oraimo.addMusic();
////        //assert
////        assertEquals(PlayList.music, oraimo.getMusic());
////    }
//
//}
package Mp3Project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp3PlayerTest {
    PlayList playList;
    Mp3Player oraimo = new Mp3Player();
    Power power = oraimo.getPower();

    @BeforeEach
    public void displayBeforeEach(){
        Mp3Player oraimo = new Mp3Player();
        Power power = oraimo.getPower();
        playList = oraimo.getPlayList();
    }

    @Test
    public void testThatMp3IsOff(){
        //assert
        assertEquals(Power.OFF, oraimo.getPower());
    }

//    @Test
//    public void testThatMp3CanBeTurnedOn(){
//        //given
//        assertEquals(Power.OFF, oraimo.getPower());
//        //when
//        oraimo.isOn();
//        //assert
//        assertEquals(Power.ON, oraimo.getPower());
//    }
//
//    @Test
//    public void testThatMp3CanBeTurnedOff(){
//        //given
//        oraimo.isOn();
//        assertEquals(Power.ON, oraimo.getPower());
//        //when
//        oraimo.isOff();
//        //assert
//        assertEquals(Power.OFF, oraimo.getPower());
//    }
//
//    @Test
//    public void testThatMp3CanPlayMusic(){
//        //given
//        oraimo.isOn();
//        assertEquals(Power.ON, oraimo.getPower());
//        //when
//        oraimo.playMusic();
//        //assert
//        assertEquals(MusicState.PLAY, oraimo.getMusicState());
//    }
//
//    @Test
//    public void testThatMp3CanPauseMusic(){
//        //given
//        oraimo.isOn();
//        assertEquals(Power.ON, oraimo.getPower());
//        oraimo.playMusic();
//        assertEquals(MusicState.PLAY, oraimo.getMusicState());
//        //when
//        oraimo.pauseMusic();
//        //assert
//        assertEquals(MusicState.PAUSE, oraimo.getMusicState());
//    }
//
//    @Test
//    void testThatMp3CanIncreaseMusicVolume(){
//        //given
//        oraimo.isOn();
//        assertEquals(Power.ON, oraimo.getPower());
//        //when
//        oraimo.increaseVolume();
//        oraimo.increaseVolume();
//        //assert
//        assertEquals(15, Volume.getVolumeLevel());
//    }
//
//    @Test
//    void testThatMp3CanDecreaseMusicVolume(){
//        //given
//        oraimo.increaseVolume();
//        oraimo.increaseVolume();
//        assertEquals(15, Volume.getVolumeLevel());
//        //when
//        oraimo.decreaseVolume();
//        //assert
//        assertEquals(10, Volume.getVolumeLevel());
//    }
//
//    @Test
//    void testThatMp3CanHavePlayList(){
//        //given
//        PlayList playList = oraimo.getPlayList();
//        //assert
//        assertNotNull(playList);
//    }
//
//    @Test
//    void testThatMp3CanAddMusicToPlayList(){
//        //given
//        assertEquals(0, playList.getSizeOfPlaylist());
//        //when
//        PlayList.addMusic();
//        PlayList.addMusic();
//        PlayList.addMusic();
//        //assert
//        assertEquals(3, playList.getSizeOfPlaylist());
//    }
//
//    @Test
//    void testThatMp3CanRemoveMusicToPlayList(){
//        //given
//        PlayList.addMusic();
//        PlayList.addMusic();
//        PlayList.addMusic();
//        assertEquals(3, playList.getSizeOfPlaylist());
//        //when
//        PlayList.removeMusic();
//        //assert
//        assertEquals(2, playList.getSizeOfPlaylist());
//    }
//
//    @Test
//    void testThatMp3CanPlayMusicAtALinearMode(){
//        //given
//        oraimo.playMusic();
//        assertEquals(MusicState.PLAY, oraimo.getMusicState());
//        //when
//        oraimo.linearMusic();
//        //assert
//        assertEquals(PlayMode.LINEAR, oraimo.getPlayMode());
//    }
//
//    @Test
//    void testThatMp3CanPlayMusicAtAShuffleMode(){
//        //given
//        oraimo.playMusic();
//        assertEquals(MusicState.PLAY, oraimo.getMusicState());
//        //when
//            oraimo.shuttleMusic();
//        //assert
//        assertEquals(PlayMode.SHUFFLE, oraimo.getPlayMode());
//    }
//
//    @Test
//    void testThatMp3HasMusicList(){
//        //given
//        PlayList.music();
//        //when
//
//        //assert
//
//    }

}
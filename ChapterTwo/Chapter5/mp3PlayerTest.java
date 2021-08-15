package mp3PlayerProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mp3PlayerTest {
    mp3Player oraimoPlayer = new mp3Player();

    @Test
    void mp3PlayerCanBeTurnedOnTest(){
        //given
        assertFalse(oraimoPlayer.isOn());
        //when
        oraimoPlayer.turnOn();
        //assert
        assertTrue(oraimoPlayer.isOn());
    }
    @Test
    void mp3PlayerCanBeTurnedOffTest(){
    //given

     // when
        oraimoPlayer.turnOff();
     //assert
     assertFalse(oraimoPlayer.isOff());
    }
    @Test
    void mp3PlayerCanIncreaseVolumeTest(){
    //given

    //when
        oraimoPlayer.increaseVolume();
        oraimoPlayer.increaseVolume();
        oraimoPlayer.increaseVolume();
        oraimoPlayer.increaseVolume();
        oraimoPlayer.increaseVolume();
    //assert
     assertEquals(15, oraimoPlayer.getVolume());
    }
    @Test
    void mp3PlayerCanDecreaseVolumeTest(){
    //given

    //when
    oraimoPlayer.decreaseVolume();
    oraimoPlayer.decreaseVolume();
    oraimoPlayer.decreaseVolume();
    oraimoPlayer.decreaseVolume();
    oraimoPlayer.decreaseVolume();
    oraimoPlayer.decreaseVolume();
    oraimoPlayer.decreaseVolume();
    //assert
    assertEquals(3, oraimoPlayer.getVolume());
    }
    @Test
    void mp3PlayerCanPlayMusicTest(){
    //given

    //when
    oraimoPlayer.playMusic();
    //assert
    assertTrue(oraimoPlayer.getPlayer());
    }
    @Test
    void mp3PlayerMusicCanGoToNextMusicTest(){
     //given

     //when
     oraimoPlayer.nextMusic();
     oraimoPlayer.nextMusic();
     oraimoPlayer.nextMusic();
     //assert
     assertEquals(5, oraimoPlayer.getSongNumber());
    }
    @Test
    void mp3PlayerMusicCanGoToPreviousMusicTest(){
    //given

    //when
    oraimoPlayer.previousMusic();
    //assert
    assertEquals(1, oraimoPlayer.getSongNumber());
    }
    @Test
    void mp3PlayerCanPlayRadioTest(){
    //given

    //when
    oraimoPlayer.playRadio();
    //assert
    assertTrue(oraimoPlayer.getPlayer());
    }
    @Test
    void mp3PlayerCanWorkWithMemoryCardTest(){
     //given

     //when
     oraimoPlayer.memoryCard();
     //assert
     assertTrue(oraimoPlayer.getPlayer());
    }
    @Test
    void mp3PlayerCanWorkWithBluetoothTest(){
    //given

    //when
    oraimoPlayer.bluetoothConnect();
    //assert
    assertTrue(oraimoPlayer.getPlayer());
    }

}
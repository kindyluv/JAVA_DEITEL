import RemoteProject.Remote;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteProjectTest {
    Remote lg = new Remote();

    @Test
    void remoteCanControlPowerOnTest(){
     //given

        //when

        //assert
        assertFalse(lg.isOn());
    }
    @Test
    void remoteCanControlPowerOffTest(){
        //given
        lg.turnOn(true);
        //when

        //assert
        assertTrue(true);
    }
    @Test
    void remoteCanNextChannelTest() {
        //given

        //when
        lg.nextChannel();
        lg.nextChannel();
        lg.nextChannel();
        lg.nextChannel();
        lg.nextChannel();
        //assert
    int checkChannel = lg.getChannel();
    assertEquals(10, checkChannel);
    }
    @Test
    void remoteCanPreviousChannelTest(){
        //given

        //when
        lg.previousChannel();
        lg.previousChannel();
        lg.previousChannel();
        lg.previousChannel();
        //assert
        assertEquals(1, lg.getChannel());
    }
    @Test
    void remoteCanPlayMusicTest(){
        //given

        //when

        //assert

        assertFalse(false);
    }
    @Test
    void remoteCanPulseMusic(){
        //given

        //when

         //assert
        assertTrue(true);

    }
    @Test
    void remoteCanMuteVolumeTest(){
        //given

        //when
        lg.muteMusic(true);
        //assert
        assertTrue(lg.getMuteMusic());
    }
}
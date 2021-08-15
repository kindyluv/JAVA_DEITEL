package TelevisionPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    Television lg = new Television();


    @Test
    void televisionCanBeTurnedOnTest() {
        //given

        //when

        //assert
        assertFalse(lg.isOn());

    }

    @Test
    void televisionCanBeTurnedOffTest() {
        //given
        lg.isOn();
        //when

        //assert
        assertFalse(lg.isOn());
    }

    @Test
    void televisionCanChangeToNextChannelTest() {
        //given
        lg.nextChannel();
        lg.nextChannel();
        lg.nextChannel();
        lg.nextChannel();
        lg.nextChannel();
        //when

        //assert
        assertEquals(17, lg.getChannel());
    }

    @Test
    void televisionCanChangeToPreviousChannelTest() {
        //given
        lg.previousChannel();
        lg.previousChannel();
        lg.previousChannel();

        //when

        //assert
        assertEquals(9, lg.getChannel());
    }

    @Test
    void televisionCanChangeVolumeUpTest() {
        //given
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        //when

        //assert
        assertEquals(7,lg.getVolume());
    }
    @Test
    void televisionCanChangeVolumeDownTest() {
        //given
        lg.decreaseVolume();
        lg.decreaseVolume();
        lg.decreaseVolume();
        lg.decreaseVolume();
        //when

        //assert
        assertEquals(0,lg.getVolume());
    }

}
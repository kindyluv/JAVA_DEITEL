package AirCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    @Test
    public void acIsOnByDefault() {
        //given
        AirConditioner loisAc = new AirConditioner();
        //when

        //assert
        assertEquals(true, loisAc.isOn());
    }

    @Test
    public void acIsOffByDefault() {
        //given
        AirConditioner loisAc = new AirConditioner();
        //when
        loisAc.isOn();

        //assert
        boolean acCheck = loisAc.isOn();
        assertEquals(false, acCheck);


    }
    @Test
    public void acCanBeTurnedOnTest() {
        //given
        AirConditioner lg = new AirConditioner();
        assertFalse(lg.isOn());
        assertEquals(false, lg.isOn());

        //when


    }
    @Test
    public void acCanBeTurnedOffTest(){
        AirConditioner lg = new AirConditioner();
        //when
        lg.setOn(true);
        //check
        assertFalse(true,lg.isOn());
    }
    @Test
    public void acCanBeIncreasedTest(){
        AirConditioner myAc = new AirConditioner();
        myAc.setOn(true);
        myAc.increaseTemperature();
        //assert
        assertEquals(17, myAc.getCurrentTemperature());

    }
}
package ChapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {

    @Test
    public void calculateFactorialTest() {
        Kata input = new Kata();
        int result = input.calculateFactorsOf(6);

        assertEquals(720, result);
        int lois = result + input.calculateFactorsOf(4);
    }

    @Test
    public void calculateSquareTest() {
        Kata input = new Kata();
        int result = input.calculateSquareOf(3);

        assertEquals(9, result);
    }

    @Test
    void calculateTestDrillerForOneToFourTest() {
        Kata input = new Kata();
        int price = input.calculateTestDrillerOf(4);

        assertEquals(6000, price);
    }

    @Test
    void calculateTestDrillerForFiveToNineTest() {
        Kata input = new Kata();
        assertEquals(1500, input.calculateTestDrillerOf(1));
        assertEquals(4500, input.calculateTestDrillerOf(3));
        assertEquals(6000, input.calculateTestDrillerOf(4));
    }
    @Test
    void calculateTestDrillerForTenToTwentyNineTest(){
        Kata input = new Kata();
        assertEquals(12000, input.calculateTestDrillerOf(10));
        assertEquals(15600, input.calculateTestDrillerOf(13));
        assertEquals(28800, input.calculateTestDrillerOf(24));
        assertEquals(34800, input.calculateTestDrillerOf(29));
    }
    @Test
    void calculateTestDrillerForThirtyToFortyNineTest(){
        Kata input = new Kata();
        assertEquals(33000, input.calculateTestDrillerOf(30));
        assertEquals(40700, input.calculateTestDrillerOf(37));
        assertEquals(45100, input.calculateTestDrillerOf(41));
        assertEquals(53900, input.calculateTestDrillerOf(49));;
    }
    @Test
    void calculateTestDrillerForFiftyToNinetyNineTest(){
        Kata input = new Kata();
        assertEquals(50000, input.calculateTestDrillerOf(50));
        assertEquals(63000, input.calculateTestDrillerOf(63));
        assertEquals(74000, input.calculateTestDrillerOf(74));
        assertEquals(99000, input.calculateTestDrillerOf(99));
    }
    @Test
    void calculateTestDrillerForHundredToOneHundredAndNinetyNineTest(){
        Kata input = new Kata();
        assertEquals(90000, input.calculateTestDrillerOf(100));
        assertEquals(108000, input.calculateTestDrillerOf(120));
        assertEquals(135000, input.calculateTestDrillerOf(150));
        assertEquals(179100, input.calculateTestDrillerOf(199));
    }
    @Test
    void calculateTestDrillerForTwoHundredAndAboveTest(){
        Kata input = new Kata();
        assertEquals(160000, input.calculateTestDrillerOf(200));
        assertEquals(2167200, input.calculateTestDrillerOf(2709));
        assertEquals(2400000, input.calculateTestDrillerOf(3000));
        assertEquals(4799200, input.calculateTestDrillerOf(5999));
    }
}
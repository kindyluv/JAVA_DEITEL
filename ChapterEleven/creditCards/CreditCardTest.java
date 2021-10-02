package creditCard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {


    @BeforeEach
    void setUp() {
        CreditCard card = new CreditCard();
    }

    @Test
    void testThatCreditCardCanOnlyBeBetween13And16DigitsLong(){
        assertTrue(CreditCard.digit(1111111111111111L));
    }

    @Test
    void testThatCreditCardCanCalculateSumOfOddPlaces(){
        assertEquals(41,CreditCard.sumOfOddPlaces(4388576018410707L));
    }

    @Test
    void testThatCreditCardCanCalculateSumOfDoubleEvenPlace(){
        assertEquals(37,CreditCard.sumOfDoubleEvenPlace(4388576018402626L));
    }

    @Test
    void testThatCreditCardNumberCanBeValidated(){
        assertTrue(CreditCard.isValid( 4388576018410707L));
    }

    @Test
    void testThatCreditCardTypeVisaCardStartsWithFour4(long number){
       assertTrue(CreditCard.checkVisaCard(4388576018410707L));
    }

//    @Test
//    void testThatCreditCardTypeVisaCardStartsWithFive5(){
//        assertTrue(CreditCard.checkMasterCard(5388576018456788L));
//    }
}
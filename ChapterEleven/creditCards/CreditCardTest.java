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
    void testThatCreditCardCanNotBeBelow13DigitsLong(){
        assertFalse(CreditCardValidation.digit(123456789012L));
    }

    @Test
    void testThatCreditCardCanNotBeAbove16DigitsLong(){
        assertFalse(CreditCardValidation.digit(111111111111111111L));
    }

    @Test
    void testThatCreditCardCanOnlyBeBetween13And16DigitsLong(){
        assertTrue(CreditCardValidation.digit(12345678901234L));
        assertTrue(CreditCardValidation.digit(123456789012345L));
    }

    @Test
    void testThatCreditCardCanOnlyBe13And16DigitsLong(){
        assertTrue(CreditCardValidation.digit(1234567890123L));
        assertTrue(CreditCardValidation.digit(1234567890123456L));
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
        assertTrue(CreditCardValidation.isValid( 4388576018410707L));
    }

    @Test
    void testThatCreditCardTypeVisaCardStartsWithFour4(){

       assertEquals(CreditCardType.VISA_CARD,CreditCard.checkCardType(4388576018410707L));
    }

    @Test
    void testThatCreditCardTypeVisaCardStartsWithFive5(){
        assertEquals(CreditCardType.MASTER_CARD,CreditCard.checkCardType(5388576018456788L));
    }

    @Test
    void testThatCreditCardTypeAmericanExpressCardStartsWith37(){
        assertEquals(CreditCardType.AMERICA_EXPRESS,CreditCard.checkCardType(3788576018456788L));
    }

    @Test
    void testThatCreditCardTypeDiscoverCardStartsWith6(){
        assertEquals(CreditCardType.DISCOVER_CARD,CreditCard.checkCardType(6388576018456788L));
    }
}
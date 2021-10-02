package creditCard;

public class CreditCardValidation {

    public static boolean isValid(long number) {
        int even = CreditCard.sumOfDoubleEvenPlace(number);
        int odd = CreditCard.sumOfOddPlaces(number);
        int sum = even + odd;
        return sum % 10 == 0;
    }

//    public static boolean digit(long size) {
//        String cardDigitLength = String.valueOf(size);
//        return cardDigitLength.length() >= 13 && cardDigitLength.length() <= 16;
//    }
}

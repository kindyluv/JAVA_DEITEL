package creditCard;


public class CreditCard {
    private static CreditCardType creditCardType;

//    public static CreditCardType checkCardType(long number) {
//        String number_ = String.valueOf(number);
//        String prefix = String.valueOf(number_.charAt(0));
//        switch (prefix) {
//            case "4":
//                creditCardType = CreditCardType.VISA_CARD;
//                break;
//            case "5":
//                creditCardType = CreditCardType.MASTER_CARD;
//                break;
//            case "6":
//                creditCardType = CreditCardType.DISCOVER_CARD;
//                break;
//            case "3":
//                if (String.valueOf(number_.charAt(1)).equals("7"))
//                    creditCardType = CreditCardType.AMERICA_EXPRESS;
//        }
//        return creditCardType;
//    }

//    public static boolean checkMasterCard(long number) {
//        String masterCard = String.valueOf(number);
//        return masterCard.charAt(0) == '5';
//    }
//
//    public static boolean checkCardAmericanExpress(long number) {
//        String masterCard = String.valueOf(number);
//        return masterCard.charAt(0) == '3' && masterCard.charAt(1) == '7';
//    }
//
//    public static boolean checkCardDiscover(long number) {
//        String discoverCard = String.valueOf(number);
//        return discoverCard.charAt(0) == '6';
//    }
//
//    public static CreditCardType getCreditCardType() {
//        return creditCardType;
//    }

//    public static boolean digit(long size) {
//        String cardDigitLength = String.valueOf(size);
//        return cardDigitLength.length() >= 13 && cardDigitLength.length() <= 16;
//    }

    public static int sumOfOddPlaces(long number) {
        int sum = 0;
        String numb = String.valueOf(number);
        int lengthOfNumber = numb.length();
        for (int i = lengthOfNumber - 1; i >= 0; i -= 2) sum += Integer.parseInt(String.valueOf(numb.charAt(i)));
        return sum;

    }

//    public static int getDigit(int number) {
//        int digit;
//        int multiplication = number * 2;
//            if (multiplication < 10) {
//                digit = multiplication;
//            } else {
//                String value = String.valueOf(multiplication);
//                digit = Character.getNumericValue(value.charAt(0)) + Character.getNumericValue(value.charAt(1));
//            }
//        return digit;
//    }

//    public static int sumOfDoubleEvenPlace(long number) {
//        int sum = 0;
//        String numb = String.valueOf(number);
//        for (int i = numb.length() - 2; i >= 0 ; i -= 2) {
//            sum += getDigit(Character.getNumericValue(numb.charAt(i)));
//        }
//        return sum;
//    }
//
//    public static int getSize(long number) {
//        return String.valueOf(number).length();
//    }

//    public static boolean isValid(long number) {
//        int even = sumOfDoubleEvenPlace(number);
//        int odd = sumOfOddPlaces(number);
//        int sum = even + odd;
//        return sum % 10 == 0;
//    }




//    public static void main(String[] args) {
//        System.out.println(checkVisaCard(4388576018402626L));
//    }

}

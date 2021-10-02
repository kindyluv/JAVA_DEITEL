package creditCard;

//import static PersonalFolder.ArrayListClass.numbs;
import static java.lang.Long.parseLong;

public class CreditCard {
    private static int digit;

    public static boolean checkVisaCard(long number) {
        String visaCard = String.valueOf(number);
        return visaCard.charAt(0) == '4';

    }

    public static boolean checkMasterCard(long number) {
        String masterCard = String.valueOf(number);
        return masterCard.charAt(0) == '5';
    }
//
//    public static boolean digit(long size) {
//        String cardDigitLength = String.valueOf(size);
//        return cardDigitLength.length() >= 13 && cardDigitLength.length() <= 16;
//    }
//
//    public static int sumOfOddPlaces(long number) {
//        int sum = 0;
//        String numb = String.valueOf(number);
//        int lengthOfNumber = numb.length();
//        for (int i = lengthOfNumber - 1; i >= 0; i -= 2) sum += Integer.parseInt(String.valueOf(numb.charAt(i)));
////        System.out.println(sum);
//        return sum;
//
//    }
//
//    public static int getDigit() {
//        return digit;
//    }
//
//    public static int sumOfDoubleEvenPlace(long number) {
//        int sum = 0;
//        int multiplication;
//        String numb = String.valueOf(number);
//        int lengthOfNumbers = numb.length();
//        for (int i = lengthOfNumbers - 2; i >= 0 ; i -= 2) {
//            multiplication = Character.getNumericValue(numb.charAt(i)) * 2;
//            if (multiplication < 10) {
//                sum += multiplication;
//            } else {
//                String value = String.valueOf(multiplication);
//                sum += Character.getNumericValue(value.charAt(0)) + Character.getNumericValue(value.charAt(1));
//            }
////            else sum += Integer.parseInt(String.valueOf(numb.charAt(count)))*2;
//
//        }
//        return sum;
//    }
//
//    public static boolean isValid(long number) {
//        int even = sumOfDoubleEvenPlace(number);
//        int odd = sumOfOddPlaces(number);
//        int sum = even + odd;
//        return sum % 10 == 0;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(checkVisaCard(4388576018402626L));
//    }

}

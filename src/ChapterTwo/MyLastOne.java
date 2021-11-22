package Trial;

public class MyLastOne {
    public static void main(String[] args) {
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

        int myMaximumValue = Integer.MAX_VALUE;
        int myMinimumValue = Integer.MIN_VALUE;
        System.out.println(myMaximumValue);
        System.out.println(myMinimumValue);
        System.out.println(myMaximumValue + 1);
        System.out.println(myMinimumValue - 1);

        int myMax = 2_147_483_647;
        System.out.println(myMax);

        byte myMaximumValues = Byte.MAX_VALUE;
        byte myMinimumValues = Byte.MIN_VALUE;
        System.out.println(myMaximumValues);
        System.out.println(myMinimumValues);
        System.out.println(myMaximumValues + 1);
        System.out.println(myMinimumValues - 1);

        short myMaximumValueUnit = Short.MAX_VALUE;
        short myMinimumValueUnit = Short.MIN_VALUE;
        System.out.println(myMaximumValueUnit);
        System.out.println(myMinimumValueUnit);
        System.out.println(myMaximumValueUnit + 1);
        System.out.println(myMinimumValueUnit - 1);

        long myMaximumValueUnits = Long.MAX_VALUE;
        long myMinimumValueUnits = Long.MIN_VALUE;
        System.out.println(myMaximumValueUnits);
        System.out.println(myMinimumValueUnits);
        System.out.println(myMaximumValueUnits + 1);
        System.out.println(myMinimumValueUnits - 1);

        // long myLong = (long) ();

        byte myByte = (byte) (myMinimumValues / 2);

        byte sleep = 100;
        short sleepy = 32000;
        int sleeping = 6000;
        long sleepings = 50000L + 10L * (sleep + sleepy + sleeping);
        System.out.println(sleepings);

        short shorty = (short) (1000 + 10 * (sleep + sleepy + sleeping));
        System.out.println(shorty);


        float myMaximumFloatValue = Float.MAX_VALUE;
        float myMinimumFloatValue = Float.MIN_VALUE;
        System.out.println(myMaximumFloatValue);
        System.out.println(myMinimumFloatValue);

        double myMaximumDoubleValue = Double.MAX_VALUE;
        double myMinimumDoubleValue = Double.MIN_VALUE;
        System.out.println(myMaximumDoubleValue);
        System.out.println(myMinimumDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5 / 2f;
        double myDoubleValue = 5 / 2d;

        int pounds = 50;
        double kilograms = pounds * 0.45359237;
        System.out.println(kilograms);

        int toye = 27;
        if (toye <= 27) {
            System.out.println("His still a baby");

            int femi = 20;
            if (femi < toye && toye < 100) {
                System.out.println("i lor him");
            }
        }
        boolean toyee = true;
        if (toyee) {
            System.out.println("false");
        }
        boolean femi = false;
        if (!femi) {
            System.out.println("error");
        }
        boolean david = toyee ? true : false;
        if (david) {
            System.out.println("true");
        }

        double pre = 20.00d;
        double presh = 80.00d;
        double totalPre = (pre + presh) * 100.00d;
        System.out.println(totalPre);
        double result = totalPre % 40.00d  ;
        System.out.println(result);
        boolean results = (result == 0) ? true : false;
        if (!results) {
            System.out.println("true");
        } else System.out.println("false");


       boolean gameOv = true;
     //  int score ==
    }
}

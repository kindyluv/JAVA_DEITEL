package ChapterThree;

import java.util.Scanner;

public class TuitionFee {
     double initialTuition = 10000;
     double totalTuition = 0;
     int numberOfYears = 1;
        double newTuition;
        double futureTuition = 0;

        //increase rate per year is 5%
// display tuition for for 10 years
// get tuition fee for 4 years after the 10 years


     public double setTuitionIncrease(double tuitionFee) {
         while (numberOfYears <= 10) {
             initialTuition = totalTuition;
             numberOfYears++;
         double newTuition = initialTuition * 05;
         totalTuition = newTuition + initialTuition;
          futureTuition = totalTuition + numberOfYears +4;
         System.out.printf("%fThe total tuition is %f%n", totalTuition);
         System.out.printf("%fThe future fee is", futureTuition);
    }

          //public double getTuition(){
            return totalTuition;
        //}
    }
}



package Chapter5;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {

//    Scanner input = new Scanner(System.in);
//    System.out.println("Enter Number");
//    int userInput = input.nextInt();

 //     for (int count = 1; count <= 10; count++){
 //         System.out.println(count);
 //     }
//     for (int count = 10; count >=1; count--){
//         System.out.println(count);
//     }

 //    for (int count = 1; count <= userInput; count++){
 //        System.out.println(count);
 //    }
 //   for (int count = 1; count > userInput; count--){
 //       System.out.println(count);
 //   }

        System.out.println("a\ta^2\ta^3");

        int a = 1;
        int count = 1;

        while(count <= 4){
            System.out.printf("%d\t%d\t%d\n", a, a*a, a*a*a);

            count++;
            a++;
        }
    }
}

  package ChapterFour;
  import java.util.Scanner;
  public class Practice {


      public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

          System.out.println("Enter radius of a sphere");

          double radius = input.nextDouble();
          double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

          System.out.println("volume is: " + volume);
      }
          public static double sphereVolume(double radius){

              double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

              return volume;
      }
  }

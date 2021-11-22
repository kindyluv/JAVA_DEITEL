package Chapter5.unknownFiles;

public class ForLoop {

    public static void main(String[] args) {

        for (int row = 1; row < 5; row++) {

            for (int col = 1; col < 5; col++) {

                System.out.print(" * ");
            }
            System.out.println();
        }


        for (int i= 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("P");
            }
            System.out.println();
        }
    }
}

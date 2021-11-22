//package ChapterEight;
//
//import java.util.Arrays;
//
//public class SevenSegmentDisplayTwo {
//        private static final int ROW = 5;
//        private static final int COLUMN = 4;
//        private static final int[][] screen = new int[ROW][COLUMN];
////    private static String userInput;
//
//
//
//        public static void setScreen(String userInput) {
////        screen = new int[][]{{1,1,1,1},{1,0,0,1},{1,1,1,1},{1,0,0,1},{1,1,1,1}};
////        userInput = "11001101";
//            int[] userArray = new int[8];
//
//            for (int i = 0; i < userArray.length; i++) {
//                userArray[i] = Integer.parseInt(String.valueOf(userInput.charAt(i)));
//            }

//            int a = userArray[0];
//            int b = userArray[1];
//            int c = userArray[2];
//            int d = userArray[3];
//            int e = userArray[4];
//            int f = userArray[5];
//            int g = userArray[6];
//            int h = userArray[7];
//
//            for (int row = 0; row < screen.length; row++) {
//                for (int column = 0; column < screen[row].length; column++) {
//                    if (h == 1) {
//                        if (a == 1) {
//                            screen[0][0] = 1;
//                            screen[0][1] = 1;
//                            screen[0][2] = 1;
//                            screen[0][3] = 1;
//                        }
//                        if (b == 1) {
//                            screen[0][3] = 1;
//                            screen[1][3] = 1;
//                            screen[2][3] = 1;
//                        }
//                        if (c == 1) {
//                            screen[2][3] = 1;
//                            screen[3][3] = 1;
//                            screen[4][3] = 1;
//                        }
//                        if (d == 1) {
//                            screen[4][3] = 1;
//                            screen[4][2] = 1;
//                            screen[4][1] = 1;
//                            screen[4][0] = 1;
//                        }
//                        if (e == 1) {
//                            screen[4][0] = 1;
//                            screen[3][0] = 1;
//                            screen[2][0] = 1;
//                        }
//                        if (f == 1) {
//                            screen[2][0] = 1;
//                            screen[1][0] = 1;
//                            screen[0][0] = 1;
//                        }
//                        if (g == 1) {
//                            screen[2][0] = 1;
//                            screen[2][1] = 1;
//                            screen[2][2] = 1;
//                            screen[2][3] = 1;
//                        }
//                    } else clearScreen();
//
//                }
//            }
//        }
//
//        private static void clearScreen() {
//            for (int[] number : screen) {
//                Arrays.fill(number, 0);
//            }
//        }
//
//        public static void display() {
//            for (int[] row: screen) {
//                for (int column: row) {
//                    if (column == 1) {
//                        System.out.print(column + " ");
//                    } else {
//                        System.out.print("  ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//}
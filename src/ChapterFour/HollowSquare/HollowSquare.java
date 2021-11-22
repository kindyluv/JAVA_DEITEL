package ChapterFour;

public class HollowSquare {
    private int row = 5;
    private int column = 5;

    public void hollow() {
        for (int i = 0; i <row; i++){
            for (int j = 0; j < column; j++) {
                if ((i == 0 || i == row - 1) || (j == 0 || j == column - 1)) {
                    System.out.print("#  ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void hollowDiamond(){

    }

    public static void main(String[] args) {
        HollowSquare hallow = new HollowSquare();
        hallow.hollow();
    }
}

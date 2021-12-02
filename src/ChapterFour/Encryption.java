package ChapterFour;

import java.util.regex.Pattern;

public class Encryption {
    private String id;

    public int encrypt(String numb){
        int numb1 = Integer.parseInt(String.valueOf(numb.charAt(0)));
        int numb2 = Integer.parseInt(String.valueOf(numb.charAt(1)));
        int numb3 = Integer.parseInt(String.valueOf(numb.charAt(2)));
        int numb4 = Integer.parseInt(String.valueOf(numb.charAt(3)));
        int temp;
        numb1 = (numb1 + 7)% 10;
        numb2 = (numb2 + 7) % 10;
        numb3 = (numb3 + 7) % 10;
        numb4 = (numb4 + 7) % 10;

        temp = numb1;
        numb1 = numb3;
        numb3 = temp;

        temp = numb2;
        numb2 = numb4;
        numb4 = temp;

        return Integer.parseInt(String.valueOf(""+numb1 + numb2 + numb3 + numb4));
    }

    public int decrypt(String numb){
        int numb1 = Integer.parseInt(String.valueOf(numb.charAt(0)));
        int numb2 = Integer.parseInt(String.valueOf(numb.charAt(1)));
        int numb3 = Integer.parseInt(String.valueOf(numb.charAt(2)));
        int numb4 = Integer.parseInt(String.valueOf(numb.charAt(3)));
        int temp;
        numb1 = ((numb1 - 7) + 10) % 10;
        numb2 = ((numb2 - 7) + 10) % 10;
        numb3 = ((numb3 - 7) + 10) % 10;
        numb4 = ((numb4 - 7) + 10) % 10;

        temp = numb1;
        numb1 = numb3;
        numb3 = temp;

        temp = numb2;
        numb2 = numb4;
        numb4 = temp;

        return Integer.parseInt(String.valueOf("" + numb1 + numb2 + numb3 + numb4));
    }


}

class MainClass{
    public static void main(String[] args) {
        Encryption encryption = new Encryption();
        int answer = encryption.encrypt("2345");
        System.out.println(answer);

        String ans = String.valueOf(answer);
        int dec = encryption.decrypt(ans);
        System.out.println(dec);

    }
}

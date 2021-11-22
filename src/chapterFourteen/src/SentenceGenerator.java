package Chapter5.src.chapterFourteen.src;

import java.security.SecureRandom;

public class SentenceGenerator {
    private static String[] article = {"the" , "a" , "one" , "some", "any"};
    private static String[] noun = {"boy" , "girl" , "dog" , "town", "car"};
    private static String[] verb = {"drove" , "jumped" , "ran" , "walked", "skipped"};
    private static String[] prepositions = {"to" , "from" , "over" , "under", "on"};

    public static String createSentence(){
        SecureRandom randomIndex = new SecureRandom();
        int index = randomIndex.nextInt(5);
        String firstWord = new String(article[index]);

        firstWord = firstWord.replaceFirst("[a-z]", String.valueOf(firstWord.charAt(0)).toUpperCase());

//        char firstLetter = firstWord.charAt(0);
//        firstLetter = Character.toUpperCase(firstLetter);
//        firstWord = firstWord.replace(firstWord.charAt(0), firstLetter);

        StringBuilder sentence = new StringBuilder(firstWord);
        sentence.append(" ")
                .append(noun[index])
                .append(" ")
                .append(verb[index])
                .append(" ")
                .append(prepositions[index])
                .append(" ")
                .append(article[index])
                .append(" ")
                .append(noun[index]);

        return sentence.toString();

    }

    public static void main(String[] args) {
        System.out.println();
    }
}

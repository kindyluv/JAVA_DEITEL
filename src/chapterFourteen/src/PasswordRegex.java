package chapterFourteen.src;

import java.util.regex.Pattern;

public class PasswordRegex {
    private String password;


    public static void setPassword(String password) {
        this.password = password;
        String idRegex = "^[[a-zA-Z0-9\\-_.+=#&$%,]*"+ "[\\+#*-_.$]?[a-z0-9]*"+"[@\\*+-_.:;()$%#><,?]{1,2}]{8,20}$";

        Pattern pattern = Pattern.compile(idRegex);
        if(pattern.matcher(password).matches()){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }

    static String getPassword(){
        return password;
    }
}

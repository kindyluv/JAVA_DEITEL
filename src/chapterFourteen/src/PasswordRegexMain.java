package chapterFourteen.src;

public class PasswordRegexMain {
    public static void main(String[] args) {
        PasswordRegex passwordRegex = new PasswordRegex();
        passwordRegex.setPassword(".A=-23@");
        System.out.println(passwordRegex.getPassword());
    }
}

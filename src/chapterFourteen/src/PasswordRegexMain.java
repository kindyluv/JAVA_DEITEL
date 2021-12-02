package chapterFourteen.src;

public class PasswordRegexMain {
    public static void main(String[] args) {
        PasswordRegex.setPassword(".A=-23@");
        System.out.println(PasswordRegex.getPassword());
    }
}

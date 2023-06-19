import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodelandUsernameValidation {

    public static String CodelandUsername(String str) {
        Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches() ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(CodelandUsername("asdfg@#$"));
    }
}

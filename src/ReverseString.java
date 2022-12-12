import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String myStr = "Hello World!";
        System.out.println(reverseString(myStr));
    }
}

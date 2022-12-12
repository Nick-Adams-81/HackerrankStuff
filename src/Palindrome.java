import java.util.Scanner;

public class Palindrome {


    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reversed = reverse(str);
        if(str.equals(reversed)) System.out.println("Yes");
        else System.out.println("No");
    }
}

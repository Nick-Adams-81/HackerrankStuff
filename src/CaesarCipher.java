import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, k = 0, n = Integer.parseInt(in.nextLine());
        char[] s = in.nextLine().toCharArray();
        k = in.nextInt(); k %= 26;
        for( i = 0; i < n; i++ ) {
            if( Character.isLetter(s[i]) ) {
                if( s[i] >= 97 && (s[i] + k) > 122 ) s[i] =  (char)(97 + (k - (122 - s[i])) - 1);
                else if( s[i] >= 65 && s[i] <= 90 && (s[i] + k) > 90 ) s[i] =  (char)(65 + (k - (90 - s[i])) - 1);
                else s[i] += k;
            }
        }
        System.out.print( new String(s) );
    }
}

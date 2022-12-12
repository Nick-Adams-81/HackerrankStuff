import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int answer = 1;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < 97) {
                answer++;
            }
        }

        System.out.println(answer);
    }

}

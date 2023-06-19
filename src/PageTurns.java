import java.util.Scanner;

public class PageTurns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        if(p <= n / 2) {
            System.out.println(p / 2);
        } else {
            System.out.println((n - p) / 2);
        }
    }
}

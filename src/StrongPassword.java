import java.util.Scanner;

public class StrongPassword {

    public static int minimumNumber(int n, String password) {
        String numbers = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()-+";
        boolean b1 = false, b2 = false, b3 = false, b4 = false;

        for(char c : password.toCharArray()) {
            if(numbers.indexOf(c) != -1) b1 = true;
            if(lowerCase.indexOf(c) != -1) b2 = true;
            if(upperCase.indexOf(c) != -1) b3 = true;
            if(specialChars.indexOf(c) != -1) b4 = true;

        }

        int change = 0;
        if(!b1) ++change;
        if(!b2) ++change;
        if(!b3) ++change;
        if(!b4) ++change;

        change = Math.max(change, 6-password.length());
        return change;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String password = sc.next();
        int answer = minimumNumber(n , password);
        System.out.println(answer);

    }
}

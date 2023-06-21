public class BeautifulDayAtTheMovies {

    private static int reverse(int n) {
        int result = 0;
        while(n > 0) {
            result = result * 10 + (n % 10);
            n /= 10;
        }
        return result;
    }
    public static int beautifulDays(int i, int j, int k) {
        int days = 0;
        while(i <= j) {
            if((i - reverse(i)) % k == 0) {
                days++;
            }
            i++;
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }
}

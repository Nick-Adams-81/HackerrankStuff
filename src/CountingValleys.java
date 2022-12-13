public class CountingValleys {


    public static int countValleys(int steps, String path) {
        int alt = 0;
        int valleys = 0;
        for(int i = 0; i < steps; i++) {
            if(path.charAt(i) == 'U') {
                if(alt == -1) {
                    valleys++;
                }
                alt++;
            }
            if(path.charAt(i) == 'D') {
                alt--;
            }
        }
        return valleys;
    }
    public static void main(String[] args) {
        String str = "DDUUDDUDUUUD";
        System.out.println(countValleys(12, str));
    }
}

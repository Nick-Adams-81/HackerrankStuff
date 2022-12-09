public class HappyLadybugs {

    public static boolean solve(String s) {
        boolean hasUnderscore = false;
        boolean isHappy = true;
        int[] myArr = new int[26];

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '_') {
                hasUnderscore = true;
            } else {
                myArr[s.charAt(i) - 'A']++;
                if((i > 0 && s.charAt(i - 1) == s.charAt(i)) || (i + 1 < s.length() && s.charAt(i + 1) == s.charAt(i))) {

                } else {
                    isHappy = false;
                }
            }
        }

        if(isHappy) return true;
        if(!hasUnderscore) return false;

        for (int j : myArr) {
            if (j == 1) return false;
        }

        return true;
    }
    public static void main(String[] args) {

        String str = "YYR_B_BR";
        System.out.println(solve(str));
    }
}

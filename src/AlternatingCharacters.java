public class AlternatingCharacters {

    public static int alternateCharacters(String s) {
        int minDeletions = 0;
        for(int i = 0; i < s.length() -1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                minDeletions++;
            }
        }
        return minDeletions;
    }
    public static void main(String[] args) {
        String str = "AABABB";
        System.out.println(alternateCharacters("abbccddef"));
    }
}

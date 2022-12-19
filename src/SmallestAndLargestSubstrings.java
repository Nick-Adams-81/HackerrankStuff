public class SmallestAndLargestSubstrings {


    public static String smallestAndLargest(String s, int k) {
        String currentSubstring = s.substring(0, k);
        String smallestSubstring = currentSubstring;
        String largestSubstring = currentSubstring;

        for(int i = 1; i <= s.length() -k; i++) {
            currentSubstring = s.substring(i, i + k);
            if(currentSubstring.compareTo(largestSubstring) > 0) {
                largestSubstring = currentSubstring;
            }

            if(currentSubstring.compareTo(smallestSubstring) < 0) {
                smallestSubstring = currentSubstring;
            }
        }

        return smallestSubstring + "\n" + largestSubstring;
    }
    public static void main(String[] args) {
        String myString = "welcomeTojava";
        System.out.println(smallestAndLargest(myString, 3));
    }
}

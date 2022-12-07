public class TimeConversion {


    public static String timeConversion(String s) {
        String str = "";
        if(!s.startsWith("12") && s.contains("PM")) {
            str = Integer.toString(Integer.parseInt(s.substring(0, 2)) + 12);
            s = str + s.substring(2);
        }
        if(s.startsWith("12") && s.contains("AM")) {
            str = "00";
            s = str + s.substring(2);
        }
        return s.substring(0, s.length() -2);

    }
    public static void main(String[] args) {
        String myTime = "03:01:00PM";
        System.out.println(timeConversion(myTime));
    }
}

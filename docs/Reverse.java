public class Reverse {
    static String reverse(String s) {
        String result = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
    }
}
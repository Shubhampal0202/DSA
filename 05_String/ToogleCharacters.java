import java.util.Scanner;

public class ToogleCharacters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));

    }

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char upc = (char) ('A' + ch - 'a');
                sb.setCharAt(i, upc);
            } else if (ch >= 'A' && ch <= 'Z') {
                char lc = (char) ('a' + ch - 'A');
                sb.setCharAt(i, lc);
            }
        }
        return sb.toString();
    }
}

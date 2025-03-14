import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));

    }

    public static String compression1(String str) {
        // String s = str.charAt(0) + "";
        String s = str.substring(0, 1);
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char preChar = str.charAt(i - 1);
            if (curr != preChar) {
                s += curr;
            }
        }
        return s;
    }

    public static String compression2(String str) {
        String s = str.substring(0, 1);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr != prev) {
                if (count > 1) {
                    s += count;
                    count = 1;
                }
                s += curr;

            } else {
                count++;
            }
        }
        if (count > 1) {
            s += count;
        }
        return s;
    }
}

import java.util.Scanner;

public class PrintPalindromic {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            char fc = str.charAt(start);
            char lc = str.charAt(end);
            if (fc != lc) {
                return false;
            } else {
                start++;
                end--;
            }

        }

        return true;
    }

    public static void solution(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                if (isPalindrome(subStr) == true) {
                    System.out.println(subStr);
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str);

    }
}

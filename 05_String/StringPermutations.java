import java.util.Scanner;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str);
    }

    public static void printPermutations(String str) {
        int strLn = str.length();
        int fact = calculateFactorial(strLn);
        for (int i = 0; i < fact; i++) {
            StringBuilder sb = new StringBuilder(str);
            StringBuilder output = new StringBuilder("");
            int temp = i;
            for (int div = strLn; div >= 1; div--) {
                int q = temp / div;
                int rem = temp % div;
                char ch = sb.charAt(rem);
                output.append(ch);
                sb.deleteCharAt(rem);
                temp = q;
            }
            System.out.println(output);

        }
    }

    public static int calculateFactorial(int num) {
        int val = 1;
        for (int i = 2; i <= num; i++) {
            val = val * i;
        }
        return val;
    }
}

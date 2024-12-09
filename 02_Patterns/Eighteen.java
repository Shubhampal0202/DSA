import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sps = 0;
        int str = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sps; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= str; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < str) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
                // if ((i > 1 && i <= n / 2 && j > 1 && j < str) || (i > n / 2 + 1 && i < n && j
                // > 1 && j < str)) {
                // System.out.print("\t");
                // } else {
                // System.out.print("*\t");
                // }

            }
            if (i <= n / 2) {
                sps++;
                str -= 2;
            } else {
                sps--;
                str += 2;
            }
            System.out.println();
        }
    }
}

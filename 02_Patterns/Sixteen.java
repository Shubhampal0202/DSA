import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sps = 2 * n - 3;
        int str = 1;
        int val;
        for (int i = 1; i <= n; i++) {
            val = 1;
            for (int j = 1; j <= str; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1; j <= sps; j++) {
                System.out.print("\t");
            }

            if (i == n) {
                str--;
                val--;
            }
            for (int j = 1; j <= str; j++) {
                val--;
                System.out.print(val + "\t");

            }
            sps = sps - 2;
            str++;
            System.out.println();

        }
    }
}

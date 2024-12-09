import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sps = n / 2;
        int str = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sps; j++) {
                System.out.print("\t");
            }
            int cVal = val;
            for (int j = 1; j <= str; j++) {
                System.out.print(cVal + "\t");
                if (j <= str / 2) {
                    cVal++;
                } else {
                    cVal--;
                }

            }
            if (i <= n / 2) {
                val++;
                sps--;
                str = str + 2;
            } else {
                sps++;
                str = str - 2;
                val--;
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val;
        int nextVal;
        for (int i = 0; i <= n - 1; i++) {
            val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + "\t");
                // nextVal = (i - j) / (j + 1) * val;
                nextVal = val * (i - j) / (j + 1);
                val = nextVal;
            }
            System.out.println();
        }
    }
}

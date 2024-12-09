import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sps = n - 1;
        int str = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sps; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= str; j++) {
                System.out.print("*\t");
            }
            sps--;
            str++;
            System.out.println();
        }
    }
}

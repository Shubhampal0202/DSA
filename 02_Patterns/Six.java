import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sps = 1;
        int str = n/2+1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= str; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sps; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= str; j++) {
                System.out.print("*\t");
            }
         
            if (i <= n / 2) {
                sps = sps +2;
                str--;
            } else {
                str++;
                sps = sps - 2;
            }
            System.out.println();

        }
    } 
}

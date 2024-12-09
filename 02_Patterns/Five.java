import java.util.*;

public class Five {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sps = n / 2;
        int str = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sps; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= str; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                sps--;
                str = str + 2;
            } else {
                sps++;
                str = str - 2;
            }
            System.out.println();
           
        }
    }

}

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int result = getSum(b,n1, n2);
        System.out.println(result);
    }

    public static int getSum(int b,int n1, int n2 ) {
        int rv = 0;
        int c = 0;
        int mult = 1;
        while (n1 != 0 || n2 != 0 || c != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int sum = d1 + d2 + c;
            int rem = sum % b;
            c = sum / b;
            rv = rv + rem * mult;
            mult = mult * 10;
        }
        return rv;
    }
}

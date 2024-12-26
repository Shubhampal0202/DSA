import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int dcml = getValueInDecimal(n, b1);
        int result = getValueInBase(dcml, b2);
        System.out.println(result);
    }

    public static int getValueInDecimal(int n, int b1) {
        int rv = 0;
        int p = 1;
        while (n != 0) {
            int dig = n % 10;
            n = n / 10;
            rv = rv + dig * p;
            p = p * b1;
        }
        return rv;
    }

    public static int getValueInBase(int n, int b2) {
        int rv = 0;
        int p = 1;
        while (n != 0) {
            int dig = n % b2;
            n = n / b2;
            rv = rv + dig * p;
            p = p * 10;
        }
        return rv;
    }
}

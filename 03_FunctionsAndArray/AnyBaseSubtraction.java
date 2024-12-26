import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int result = getSubtraction(b, n1, n2);
        System.out.println(result);
    }

    public static int getSubtraction(int b, int n1, int n2) {
        int rv = 0;
        int c = 0;
        int mult = 1;
        while (n2 != 0) { // bcos n2>n1
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            d2 = d2 + c;
            if (d2 >= d1) {
                c = 0;
            } else {
                c = -1;
                d2 = d2 + b;
            }
            int sub = d2 - d1;
            rv = rv + sub * mult;
            mult = mult * 10;
        }
        return rv;
    }
}

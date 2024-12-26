import java.util.Scanner;

public class NPR {
    public static void display(int n, int r, int npr) {
        System.out.println(n + "P" + r + "= " + npr);
    }

    public static int factorial(int x) {
        int rv = 1;
        for (int i = 1; i <= x; i++) {
            rv = rv * i;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int nFact = factorial(n);
        int nmrFact = factorial(n - r);

        int npr = nFact / nmrFact;
        display(n, r, npr);
    }
}

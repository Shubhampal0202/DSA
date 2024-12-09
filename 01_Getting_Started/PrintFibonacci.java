import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for (int i = 1; i <= num; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}

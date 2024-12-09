import java.util.Scanner;

public class PrintDigitsInReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int digit;
        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            System.out.println(digit); 
        }
    }
}

import java.util.Scanner;

public class PrintAllDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int temp = num;
        int mult = 1;
        while (temp >= 10) {
            temp = temp / 10;
            mult = mult * 10;
        }
        while (mult != 0) {
            int digit = num / mult;
            num = num % mult;
            mult = mult / 10;
            System.out.println(digit);
        }
    }
}

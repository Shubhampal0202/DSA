import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int i = 1;
        int inverseNum = 0;
        int digit;
        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            inverseNum = inverseNum + i * (int) Math.pow(10, digit - 1);
            i++;
        }
        System.out.println(inverseNum);
    }
}

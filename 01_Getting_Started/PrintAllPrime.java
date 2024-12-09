import java.util.Scanner;

public class PrintAllPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter low");
        int low = scn.nextInt();
        System.out.println("Enter high");
        int high = scn.nextInt();
        for (int num = low; num <= high; num++) {
            boolean isPrime = true;
            for (int div = 2; div * div <= num; div++) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}

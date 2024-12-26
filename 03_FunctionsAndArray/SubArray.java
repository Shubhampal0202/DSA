import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        for (int stpc = 0; stpc < arr.length; stpc++) {
            for (int enpc = stpc; enpc < arr.length; enpc++) {
                for (int i = stpc; i <=enpc; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}

import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        // for (int x = 0; x < arr[0].length; x++) {
        // int i = 0;
        // int j = x;
        // while (i < arr.length && j < arr[0].length) {
        // System.out.println(arr[i][j]);
        // i++;
        // j++;
        // }
        // }
        for (int g = 0; g < arr.length; g++) {
            for (int i = 0, j = g; j < arr[0].length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}

import java.util.Scanner;

public class RotateBy90 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) { // for transpose j>=i (upper triangle) or i>=j (lower triangle)
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // reverse columns
        for (int i = 0; i < arr.length; i++) {
            reverse(arr, i);
        }
        // for (int i = 0; i < arr[0].length; i++) { // for a.c.w. 90 deg rotation
        // reverse(arr, i);
        // }
        display(arr);

    }

    public static void reverse(int a[][], int row) {
        int start = 0;
        int end = a[row].length - 1;
        while (start < end) {
            int temp = a[row][start];
            a[row][start] = a[row][end];
            a[row][end] = temp;
            start++;
            end--;
        }
    }

    // public static void reverse(int a[][], int col) {
    // int start = 0;
    // int end = a.length - 1;
    // while (start < end) {
    // int temp = a[start][col];
    // a[start][col] = a[end][col];
    // a[end][col] = temp;
    // start++;
    // end--;
    // }
    // }

    public static void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

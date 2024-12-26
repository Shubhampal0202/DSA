import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        // k = (k % n + n) % n;
        k = k % n;
        if (k < 0) {
            k = k + n;
        }
        rotateArr(0, n - k - 1, arr);
        rotateArr(n - k, n - 1, arr);
        rotateArr(0, n - 1, arr);
        display(arr);
    }

    public static void rotateArr(int start, int end, int[] a) {
        while (start < end) {
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }
    }

    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

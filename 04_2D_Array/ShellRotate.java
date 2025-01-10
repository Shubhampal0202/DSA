import java.util.Scanner;

public class ShellRotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();

        int onedArr[] = fillOnedArr(arr, s);
        rotateArr(onedArr, r);
        fillOriginalArrFromOned(onedArr, arr, s);
        displayArr(arr);
    }

    public static int[] fillOnedArr(int[][] arr, int s) {
        int fr = s - 1;
        int lr = arr.length - s;
        int fc = s - 1;
        int lc = arr[0].length - s;
        int size = 2 * (lr - fr) + 2 * (lc - fc);
        int[] onedArr = new int[size];
        int counter = 0;
        // we are doing for only one shell, there is no need to while loop 

        for (int i = fr, j = fc; i <= lr; i++) {
            onedArr[counter] = arr[i][j];
            counter++;
        }

        for (int i = lr, j = fc + 1; j <= lc; j++) {
            onedArr[counter] = arr[i][j];
            counter++;
        }

        for (int i = lr - 1, j = lc; i >= fr; i--) {
            onedArr[counter] = arr[i][j];
            counter++;
        }

        for (int i = fr, j = lc - 1; j >= fc + 1; j--) {
            onedArr[counter] = arr[i][j];
            counter++;
        }

        return onedArr;
    }

    public static void rotateArr(int arr[], int r) {
        r = r % arr.length;
        if (r < 0) {
            r = r + arr.length;
        }
        reverse(arr, 0, arr.length - r - 1);
        reverse(arr, arr.length - r, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int start, int end) {

        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void fillOriginalArrFromOned(int[] arr, int twodArr[][], int s) {
        int fr = s - 1;
        int fc = s - 1;
        int lr = twodArr.length - s;
        int lc = twodArr[0].length - s;
        // here there is no need to make the size

        int counter = 0;

        // left wall
        for (int i = fr, j = fc; i <= lr; i++) {
            twodArr[i][j] = arr[counter];
            counter++;
        }

        // bottom ball
        for (int i = lr, j = fc + 1; j <= lc; j++) {
            twodArr[i][j] = arr[counter];
            counter++;
        }

        // right wall
        for (int i = lr - 1, j = lc; i >= fr; i--) {
            twodArr[i][j] = arr[counter];
            counter++;
        }

        // top wall
        for (int i = fr, j = lc - 1; j >= fc + 1; j--) {
            twodArr[i][j] = arr[counter];
            counter++;
        }

    }

    public static void displayArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

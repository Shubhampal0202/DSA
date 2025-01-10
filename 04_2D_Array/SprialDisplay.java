import java.util.Scanner;

public class SprialDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;
        int totalElms = n * m;
        int count = 0;
        while (count < totalElms) {
            // left wall
            for (int i = minr, j = minc; i <= maxr && count < totalElms; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;

            // bottom wall
            for (int j = minc, i = maxr; j <= maxc && count < totalElms; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            // right wall
            for (int i = maxr, j = maxc; i >= minr && count < totalElms; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            // top wall
            for (int j = maxc, i = minr; j >= minc && count < totalElms; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }

    }
}

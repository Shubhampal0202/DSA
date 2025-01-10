import java.util.Scanner;

public class ExitPointOfMatrix {
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

        int direction = 0; // east
        int i = 0;
        int j = 0;
        while (true) { // or while(i>=0 && i<arr.length && j>=0 && j<arr[0].length) when loop
                       // terminates
                       // report exit point using direction

            // direction = (direction + arr[i][j]) % 4;

            if (arr[i][j] == 1) {
                direction = (direction + 1) % 4;
            }
            // for east
            if (direction == 0) {
                j++;
            }
            // for south
            else if (direction == 1) {
                i++;
            }
            // for west
            else if (direction == 2) {
                j--;
            }
            // for north
            else {
                i--;
            }
            // Report exit point
            if (i < 0) {
                i++;
                break;
            } else if (i == arr.length) {
                i--;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (j == arr[0].length) {
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}

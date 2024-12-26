import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int l = 0;
        int h = arr.length - 1;
        int fi = -1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (data < arr[mid]) {
                h = mid - 1;

            } else if (data > arr[mid]) {
                l = mid + 1;

            } else {
                fi = mid;// potential answer
                h = mid - 1;
            }
        }
        System.out.println(fi);
        l = 0;
        h = arr.length - 1;
        int li = -1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (data < arr[mid]) {
                h = mid - 1;

            } else if (data > arr[mid]) {
                l = mid + 1;

            } else {
                li = mid;// potential answer
                l = mid + 1;
            }
        }
        System.out.println(li);

    }
}

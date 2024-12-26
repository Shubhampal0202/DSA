import java.util.Scanner;

public class FloorAndCeil {
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
        int floor = 0;
        int ceil = 0;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (data < arr[mid]) {
                h = mid - 1;
                ceil = arr[mid];
            } else if (data > arr[mid]) {
                l = mid + 1;
                floor = arr[mid];
            } else {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}

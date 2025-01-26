import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimeFromArrayList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }

        solution(al);
        System.out.println(al);
    }

    public static boolean isPrime(int num) {

        for (int div = 2; div * div <= num; div++) {
            if (num % div == 0) {
                return false;
            }
        }
        return true;
    }

    public static void solution(ArrayList<Integer> al) {
        for (int i = al.size() - 1; i >= 0; i--) {
            if (isPrime(al.get(i))) {
                al.remove(i);
            }
        }
   
        // OR
        
        // for (int i = 0; i < al.size() ; i++) {
        // if (isPrime(al.get(i))) {
        // al.remove(i);
        // i--;
        // }
        // }
    }
}

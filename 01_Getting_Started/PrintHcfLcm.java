import java.util.Scanner;

public class PrintHcfLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int temp1 = num1;
        int temp2 = num2;
        int hcf;
        int lcm;
        while (temp1 % temp2 != 0) {
            int rem = temp1 % temp2;
            temp1 = temp2;
            temp2 = rem;
        }
        hcf = temp2;
        lcm = (num1 * num2) / hcf;
        System.out.println("HCF is : "+hcf);
        System.out.println("LCM is : "+lcm);
        
    }
}

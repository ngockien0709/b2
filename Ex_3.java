package B2;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        System.out.println("nhap vao n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum =0;
        float ave = 0;
        for(int i=0;i<=n;i++){
            sum +=i;
        }
        ave  = (float)sum/n;
        System.out.println("sum = "+sum);
        System.out.println("average = "+ave);
    }
}

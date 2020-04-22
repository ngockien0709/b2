package B2;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        System.out.println("nhap vao first and second numbers: ");
        Scanner scanner =new Scanner(System.in);
        int first  = scanner.nextInt();
        int second = scanner.nextInt();
        int res =0;
        for (int i=0;i<second;i++){
             res +=first;
        }
        System.out.println("result = "+res);
    }
}

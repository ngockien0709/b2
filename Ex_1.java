package B2;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        for (int i=1;i<=h;i++){
            for (int j=h-i;j>=1;j--) {
//            for(int j=1;j<=i;j++){
                  System.out.print(" ");
            }
                for(int k = 1;k<=((i*2)-1);k++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

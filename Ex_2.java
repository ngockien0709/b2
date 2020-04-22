package B2;

import java.util.Scanner;

public class Ex_2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            for (int i=1;i<=n;i++){
                for(int j=n;j>=1;j--){

                    if(j==1 || j==n || i==1 || i==n || i+j==n+1|| i==j){

                        System.out.print(" * ");
                    }
                    else System.out.print("   ");
                }

                System.out.println();
            }
        }
    }



/*
  Write a function to calculate the factorial of a number.
 */

import java.util.Scanner;

public class factorial {

    public static void func(int n){
        if(n < 0){
            System.out.println("enter the valid number..");
            return ;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
            
        }
        System.out.println(factorial);
            return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
}

package Answers;

import java.util.Scanner;

class Factorials{

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }

        return n * factorial(n-1);
    };
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int n = scanner.nextInt();

        int result = factorial(n);

        System.out.println("The result is " + result);
        System.out.println("Thanks for using this. leave like share and comment on David");
    }
}
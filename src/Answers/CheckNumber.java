package Answers;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number \n");
        int num = scanner.nextInt();
        if(num > 0){
            System.out.println("The number is positive");
        }else if(num < 0){
            System.out.println("The number is negative");
        } else if (num == 0) {
            System.out.println("The number is zero");
        }else {
            System.out.println("Invalid number");
        }
    }
}
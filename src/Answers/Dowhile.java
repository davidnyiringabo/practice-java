package Answers;

import java.util.Scanner;
class Dowhile{
    public static void main(String[] args){
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        String opt = "true";
        do {
            System.out.println("Enter the first number ");
            x = scanner.nextInt();
            System.out.println("Enter the first number ");
            y = scanner.nextInt();

            int sum = x + y;

            System.out.println("The sum of the numbers is: " + sum);
            System.out.println("----------------------------------------------");
            System.out.println("Continue, yes or no");
            opt = scanner.nextLine();
        }
        while (opt.equals("true"));
    }
}
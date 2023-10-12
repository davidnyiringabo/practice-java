package Answers;

import java.util.Scanner;

public class Que19 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int rad = scanner.nextInt();

        System.out.println("The area is " + area(rad) + " and the circumference is " + circ(rad));

    }

    public static double area(int r){
        double res = r * r * 3.14;
        return res;
    }

    public static double circ(int n){
        double res = n * 2 * 3.14;

        return res;
    }
}

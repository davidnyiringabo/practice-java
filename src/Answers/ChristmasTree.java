package Answers;

import java.util.Scanner;

class ChristmasTree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the tree");
        int len = scanner.nextInt();
//        int treeHeight = 5;
        printChristmasTree(len);
    }

    public static void printChristmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Print the tree trunk
        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
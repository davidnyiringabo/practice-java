package Answers;

public class SumEven {
    public static void main(String[] args){
        int result = 0;

        for(int i = 0; i <= 100; i=i+2){
            result += i;
        }

        System.out.println("The sum is: " + result);
    }
}

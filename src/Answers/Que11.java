package Answers;

// The product of all prime numbers btn 1 and 100
public class Que11 {
    public static void main(String[] args){
        int result = 1;
        for(int i= 1; i <=100; i++){
            if(check(i)){
                result *= i;
            }
        }

        System.out.println(result);
    }
    public static boolean check(int n){
        int multi = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                multi ++;
            }
        }

        return multi == 2;
    }
}

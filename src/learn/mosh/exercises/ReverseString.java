package learn.mosh.exercises;

import java.lang.String;
import java.util.Stack;

public class ReverseString {
    public String reverseString(String word){
        String[] splitted = word.split("");
        String reversed = "";
        for(int i= splitted.length - 1; i >=0; i--){
            reversed += splitted[i];
        }
        return reversed;
    }

    public String stackReverseString(String word){
        Stack<Character> stack = new Stack<>();
        String reversed = "";
        for (int i = 0; i < word.length(); i++){
            stack.push(word.charAt(i));
        }
        while(!stack.isEmpty()){
            reversed += stack.pop();
        }

        return reversed;
    }
    public static void main(String[] args){
        ReverseString reversed = new ReverseString();
        System.out.println(reversed.stackReverseString("David NYIRINGABO"));
        System.out.println(reversed.reverseString("David NYIRINGABO"));
    }
}

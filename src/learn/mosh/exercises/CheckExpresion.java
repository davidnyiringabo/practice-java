package learn.mosh.exercises;

import java.util.Stack;

public class CheckExpresion {
    public boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()){
            if( ch == '(' || ch == '[' || ch == '<' || ch == '{'){
                stack.push(ch);
            }
            if(ch == ')' || ch == ']' || ch=='>' || ch == '}'){
                if( stack.empty()) return false;
                stack.pop();
            }
        }
        return stack.empty();
    }

    public static void main(String[] args){
        CheckExpresion exp = new CheckExpresion();

        System.out.println(exp.isBalanced("(1+2>"));
    }
}

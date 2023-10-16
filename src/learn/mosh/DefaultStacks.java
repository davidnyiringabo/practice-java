package learn.mosh;

import java.util.Stack;

public class DefaultStacks {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.push(18);
        System.out.println(stack);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        System.out.println(stack.lastElement());

    }
}

import java.util.*;

public class GenericStack {
    public static void main(String[] args) {
        // Stack is a class
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search(20));
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack.capacity());
        System.out.println(stack.size());
        System.out.println(stack.get(1));
        System.out.println(stack.indexOf(20));
    }
}
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("Lion");
        stack.push("Cat");
        stack.push("Dog");
        stack.push("Cow");
        stack.push("Baffow");

        System.out.println("Stack: " + stack);

        System.out.println(stack.peek());

        stack.pop();
        System.out.println("stack:" + stack);

        System.out.println(stack.peek());
        stack.clear();

        System.out.println(stack);


    }
}

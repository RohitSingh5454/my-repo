package AbhinavSirLabWork.Collection.Stack;

import java.util.Stack;

public class PeekAndPop {
    public static void main(String[] args) {
        Stack<Integer> stringStack=new Stack<>();
        stringStack.push(12);
        stringStack.push(18);
        stringStack.push(11);
        stringStack.push(17);
        System.out.println(stringStack);
        System.out.println("First element is "+stringStack.peek());
        System.out.println("using pop"+" "+stringStack.pop());
        System.out.println("search "+stringStack.search(19));
    }
}

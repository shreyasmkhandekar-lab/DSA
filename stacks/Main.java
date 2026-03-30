package stacks;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        myStack.push(5);
        myStack.push(6);

        // myStack.getTop();
        // myStack.getHeight();
        myStack.printStack();
        System.out.println("=====================================");
        myStack.pop();
        myStack.printStack();
    }
}

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Push element to the back of queue
    public void push(int x) {
        stack1.push(x);
    }

    // Removes element from front of queue
    public int pop() {
        if (stack2.isEmpty()) {
            transferStack1ToStack2();
        }
        return stack2.pop();
    }

    // Get the front element
    public int peek() {
        if (stack2.isEmpty()) {
            transferStack1ToStack2();
        }
        return stack2.peek();
    }

    // Return whether the queue is empty
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Helper method to move elements from stack1 to stack2
    private void transferStack1ToStack2() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}

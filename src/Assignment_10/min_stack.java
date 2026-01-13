package Assignment_10;
import java.util.*;
class MinStack {
    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
        if (minStack.isEmpty() || val <= minStack.get(minStack.size() - 1)) {
            minStack.add(val);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int topVal = stack.remove(stack.size() - 1);
            if (topVal == minStack.get(minStack.size() - 1)) {
                minStack.remove(minStack.size() - 1);
            }
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.get(minStack.size() - 1);
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }
}
public class min_stack {

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(20);
        obj.push(10);
        obj.push(40);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
        System.out.println(param_3);//10
        System.out.println(param_4);//5
    }
}



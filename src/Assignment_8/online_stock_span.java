package Assignment_8;

import java.util.Stack;

public class online_stock_span {
    private Stack<int[]> stack;

    // Constructor name must match class name
    public online_stock_span() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        online_stock_span obj = new online_stock_span();

        System.out.println("Stock Spans:");
        for (int price : prices) {
            System.out.print(obj.next(price) + " ");
        }
    }
}
//Input
//["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
//        [[], [100], [80], [60], [70], [60], [75], [85]]
//Output
//[null, 1, 1, 1, 2, 1, 4, 6]
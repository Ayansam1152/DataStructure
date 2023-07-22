package codeChefQuestions;

import java.util.Stack;

public class Minstack {
    public static void main(String[] ayn){
        MinStack stk = new MinStack();
        stk.push(512);
        stk.push(-1024);
        stk.push(-1024);
        stk.push(512);
        System.out.println(stk.min);
        System.out.println(stk.stk);
        stk.pop();
        System.out.println(stk.getMin());
        stk.pop();
        System.out.println(stk.getMin());
        stk.pop();
        System.out.println(stk.getMin());
    }
    static class MinStack {
        Stack<Integer> stk;
        Stack<Integer> min;

        /** initialize your data structure here. */
        public MinStack() {
            stk = new Stack<>();
            min = new Stack<>();
        }

        public void push(int val) {
            if(stk.isEmpty()){
                stk.push(val);
                min.push(val);
            }else{
                stk.push(val);
                int temp = min.peek();
                if(val <= temp){
                    min.push(val);
                }
            }

        }

        public void pop() {

            int popped = stk.pop();
            if (!min.empty() && min.peek() == popped) {
                min.pop();
            }
// find wrong things int this code
//            if(stk.peek() != min.peek()){
//                stk.pop();
//            }else{
//                stk.pop();
//                min.pop();
//            }
        }

        public int top() {
            return stk.peek();

        }

        public int getMin() {
            return min.peek();
        }
    }
}

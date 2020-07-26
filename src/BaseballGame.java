import java.util.Deque;
import java.util.LinkedList;

public class BaseballGame {
    public static int calPoints(String[] ops) {
        int sum = 0;
        Deque<Integer> stack = new LinkedList<>();
        for(int i = 0; i < ops.length; i++){
            if(ops[i].equals("+")){
                int op1 = stack.peek();
                stack.pop();
                int op2 = stack.peek();
                stack.push(op1);
                stack.push(op1 + op2);
                sum += (op1 + op2);
            }
            else if(ops[i].equals("C")){
                if(!stack.isEmpty()){
                    sum -= stack.peek();
                    stack.pop();
                }
            }
            else if(ops[i].equals("D")){
                if(!stack.isEmpty()){
                    sum += stack.peek() * 2;
                    stack.push(stack.peek() * 2);
                }
            }
            else{
                int op = Integer.parseInt(ops[i]);
                stack.push(op);
                sum += op;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        int points = calPoints(ops);
        System.out.println(points);
    }
}

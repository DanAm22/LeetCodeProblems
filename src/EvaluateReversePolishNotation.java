import java.util.Deque;
import java.util.LinkedList;

public class EvaluateReversePolishNotation {
    public static boolean isOperator(String c) {
        return c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("^");
    }

    public static int makeCalculus(int op1, int op2, String operator) {
        switch (operator) {
            case "+":
                return op2 + op1;
            case "-":
                return op2 - op1;
            case "*":
                return op2 * op1;
            case "/":
                return op2 / op1;
            case "^":
                return (int) Math.pow(op2, op1);
        }
        return -1;
    }


    public static int evalRPN(String[] tokens) {
        int rpnVal = 0;
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < tokens.length; i++) {

            if (!isOperator(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int op1 = stack.pop();
                int op2 = stack.pop();
                int result = makeCalculus(op1, op2, tokens[i]);
                stack.push(result);
            }
        }

        rpnVal = stack.pop();

        if (!stack.isEmpty()) {
            System.out.println("Error. Wrong input");
            return -1;
        }

        return rpnVal;
    }

    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int rpnVal = evalRPN(tokens);
        System.out.println(rpnVal);
    }
}

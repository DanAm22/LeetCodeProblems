import java.util.Deque;
import java.util.LinkedList;

public class ValidParantheses {
    public static boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        Deque<Character> brackets = new LinkedList<Character>();
        for(int i = 0; i < s.length(); i++){
            int character = s.charAt(i);
            if(character == '('){
                brackets.push(')');
            }
            else if(character == '['){
                brackets.push(']');
            }
            else if(character == '{'){
                brackets.push('}');
            }
            else if(brackets.isEmpty() || character != brackets.pop()){
                return false;
            }
        }
        return brackets.isEmpty();
    }

    public static void main(String[] args) {
        String input = "([)]";
        boolean result = isValid(input);
        System.out.println(result);
    }
}

import java.util.Stack;

public class App {

    public static void main(String[] args) {
        String s = "((()))";
        System.out.println("Is valid : " + isValid(s));
    }


    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (Character ch: s.toCharArray()){
            if (ch=='(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(Character opening, Character closing) {
        return ( opening == '(' && closing == ')') || ( opening == '{' && closing == '}') || ( opening == '[' && closing == ']');
    }
}

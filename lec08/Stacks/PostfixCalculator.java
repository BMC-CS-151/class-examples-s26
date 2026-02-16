import java.util.Stack;

public class PostfixCalculator {

    //Create a postfix calculator for multiplication 
    public static void main(String[] args) {

        //TODO 1: create a stack of Integers
        Stack<Integer> stack = new Stack<Integer>();

        //String postfix = "3 7 *";
        //String postfix = "3 4 * 5 *";
        String postfix = "3 4 5 * *";


        //for each character
        for (int i=0; i<postfix.length(); i++) {
            //1. if its a digit, add it to the stack 
            char c = postfix.charAt(i);
            //2. if its an operator, evaluate! and push the result to the stack
            if (Character.isDigit(c)) {
                //System.out.println( ((int) c) - 48);
                stack.push(Integer.parseInt(String.valueOf(c)));
            } else if (c == '*') {
                Integer op1 = stack.pop();
                Integer op2 = stack.pop();
                stack.push(op1 * op2);
            } else {
                continue;
            }

            //3. if its a space, continue.
        }
        System.out.println(stack);
    }
}

public boolean isBalanced(String s) {
    Stack<Character> stack = new Stack<Character>();    

    if (s.length() % 2 == 1) return false;

    //loop over input string
    //adding to the stack 
    // “[ { } ]”      => True
    // “[ { ] }”      => False

    for (int i=0; i<s.length(); i++) {
        Character c = s.charAt(i);

        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else if (c == ')' && stack.peek() == '(') {
            stack.pop();
        } else if (c == '}' && stack.peek() == '{') {
            stack.pop();
        } else if (c == ']' && stack.peek() == '[') {
            stack.pop();
        } else {
            return false;
        }
    }

    return true;
}

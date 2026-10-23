class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            }

            if (c == ')' || c == '}' || c == ']') {
                if ((!stack.empty()) && (c == stack.peek())) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }

        if (!stack.empty()) {
            return false;
        } else {
            return true;
        }
    }
}

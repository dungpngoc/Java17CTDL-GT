package day10;

import java.util.Stack;

public class LC20_ValidParentheses {
    public boolean isValid(String s) {
        // Tạo đối tượng stack kiểu char để kiểm tra từng phần tử của chuỗi truyền vào
        // ()[]{}
        // stack : 1 -> (
        //         2 -> c= ) -> else topPeek = (
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {     // Nếu ký tự thứ i là 1 trong 3 dấu thì thêm vào trong stack
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topPeek = stack.peek();
                if (c == ')' && topPeek == '('
                        || topPeek == '{' && c == '}'
                        ||  topPeek == '[' && c == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}

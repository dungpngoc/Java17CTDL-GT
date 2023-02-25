package day10;

import java.util.Stack;

public class LC20_ValidParentheses {
    public boolean isValid(String s) {
        // Tạo đối tượng stack kiểu char để kiểm tra từng phần tử của chuỗi truyền vào
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {     // Nếu ký tự thứ i là 1 trong 3 dấu thì thêm vào trong stack
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topPeek = stack.peek();    // Đến đây chưa hiểu. Theo a nghĩ thì trong điều kiện if đáng nhẽ c = ngoặc mở và topPeek phải là ngoặc đóng chứ nhỉ?
                if (c == ')' && topPeek == '(' || c == '}' && topPeek == '{' || c == ']' && topPeek == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

package day14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LC844_BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        // Sử dụng stack để những phần tử vào sau mà có dấu # có thể pop() ra xoá luôn
        Stack<Character> stackS = new Stack<>();        // Tạo 2 ngăn chứa lần lượt chứa 2 chuỗi mới
        Stack<Character> stackT = new Stack<>();

        for (char c : s.toCharArray()) {                // Duyệt chuỗi s với kiểu ký tự
            if (c == '#' && !stackS.isEmpty()) {        // Điều kiện để xoá( Nếu đến vị trí tiếp theo của s mà có # thì sẽ lấy vị trí trên đỉnh của thằng stack ra)
                stackS.pop();
            } else if (c != '#') {                      // Nếu ko phải # thì sẽ push lần lượt vào stack
                stackS.push(c);
            }
        }

        for (char c : t.toCharArray()) {                // Tương tự chuỗi s
            if (c == '#' && !stackT.isEmpty()) {
                stackT.pop();
            } else if (c != '#') {
                stackT.push(c);
            }
        }

        return stackS.equals(stackT);
    }

    // Độ phức tạp thuật toán : - Tạo 2 biến O(2), vòng lặp for O(n), có 2 vòng lặp sẽ là 2 * O(n) -> 2 + 2 * O(n)
    // n = độ dài chuỗi
}

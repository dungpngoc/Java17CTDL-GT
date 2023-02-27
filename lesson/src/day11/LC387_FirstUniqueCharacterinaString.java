package day11;

import java.util.HashMap;
import java.util.Map;

public class LC387_FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Duyệt chuỗi s để sắp xếp vị trí key và value vào trong map
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {  // Nếu trong map ko có thi thêm vào và lấy giá trị value là 1 ( lần đầu xuất hiện)
                map.put(c,1);
            } else {            // Nếu có rồi thì cập nhập số lần xuất hiện ( tại vị trí key(c), với giá trị cập nhập là value + 1)
                map.put(c,map.get(c) + 1);
            }
        }

        // Duyệt lại chuỗi s để xem vị trí key nào xuất hiện 1 lần và xuất hiện đầu tiên thì return
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {      // Giá trị key c trong map = 1 thì return luôn vị trí i trong chuỗi s
                return i;
            }
        }
        return -1;  // Không có thì return -1
    }
}

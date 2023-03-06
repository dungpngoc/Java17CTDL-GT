package day13;

import java.util.HashSet;
import java.util.Set;

public class LC929_UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();     // Tạo object để chứa các email hợp lệ
        for (String email : emails) {                   // Duyệt mảng chứa các email và mỗi 1 string email ta tách ra thành 1 mảng phân cách = ký tự @
            String[] parts = email.split("@");    // vị trí trong mảng vừa tách thì lấy localName
            String localName = parts[0];
            String domainName = parts[1];
            localName = localName.replaceAll("\\.", "");        // Tìm vị trí dấu . để xoá và nối liền với từ tiếp theo = ""
            int index = localName.indexOf("+");                     // Nếu ở localName có dấu + thì chỉ lấy phần trước dấu +, xoá phần sau
            if (index != -1) {                          // Nếu ko có sẽ trả về -1, nếu có thì sẽ lấy từ 0 > vị trí index và xoá phần còn lại
                localName = localName.substring(0, index);
            }
            uniqueEmails.add(localName + "@" + domainName); // Cuối cùng thêm vào mảng ob các email hợp lệ
        }
        return uniqueEmails.size();     // Trả về size là số lượng các email hợp lệ
    }
}

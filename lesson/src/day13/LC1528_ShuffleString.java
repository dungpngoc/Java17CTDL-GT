package day13;

public class LC1528_ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {      // Duyệt chuỗi s để sắp xếp đúng theo thứ tự từ nhỏ đến lớn của mảng số
            chars[indices[i]] = s.charAt(i);            // -> ký tự thứ i của chuối s = giá trị thứ i của mảng indices và gán = vị trị index của mảng chars vừa khởi tạo
        }                                               // -> chuyển mảng ký tự về kiểu String và return
        return String.valueOf(chars);
    }
}

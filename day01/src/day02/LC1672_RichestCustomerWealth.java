package day02;

public class LC1672_RichestCustomerWealth {
    // Cách 1
//    public int maximumWealth(int[][] accounts) {
//        int[] sum = new int[accounts.length];
//        for (int i = 0; i < accounts.length; i++) {
//            for (int j = 0; j < accounts[i].length; j++) {
//                sum[i] += accounts[i][j];
//            }
//        }
//        int max = 0;
//        for (int i = 0; i < sum.length; i++) {
//            if (sum[i] > max) {
//                max = sum[i];
//            }
//        }
//        return max;
//    }

    // Cách 2
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) { // duyệt từng hàng
            int sum = 0; // tính tổng tất cả các số trên hàng thứ i
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            } // đã tính tổng của hàng thứ i
            // max = max < sum ? sum : max;
            max = Math.max(max,sum);
        }
        return max;
    }
}

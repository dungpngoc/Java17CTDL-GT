package day11;

public class MainTest {
    public static void main(String[] args) {
//        MyObject myObject1 = new MyObject(1);
//        MyObject myObject2 = new MyObject(1);
//        System.out.println(myObject1.equals(myObject2));
//        System.out.println(myHashString("hello"));

    }

    private static int myHashString(String s) {
        int num = s.length();
        return num;
//        int num = Integer.parseInt(s);
//        return num;
    }

    static class MyObject {
        int val;

        MyObject(int val) {
            this.val = val;
        }
    }
}

package day03;

import java.util.*;

public class StudentSorting {
    public String fullName;
    public int age;
    public int GPA;

    public StudentSorting(String fullName, int age, int GPA) {
        this.fullName = fullName;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "StudentSorting{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", GPA=" + GPA +
                '}';
    }

    public static void main(String[] args) {
        List<StudentSorting> studentSortings = new ArrayList<>();
        studentSortings.add(new StudentSorting("Dung",15,5));
        studentSortings.add(new StudentSorting("Anh",16,4));
        studentSortings.add(new StudentSorting("Tien",17,2));
        studentSortings.add(new StudentSorting("Hung",14,3));
        studentSortings.add(new StudentSorting("Dung",14,3));

        System.out.println("1. Sắp xếp học sinh theo fullName, nếu giống fullName thì ai nhiều tuổi hơn thì đứng trước : ");
        studentSortings.sort((o1, o2) -> o1.fullName.compareTo(o2.fullName) + o2.age - o1.age);
        for (StudentSorting studentSorting: studentSortings) {
            System.out.println(studentSorting);
        }

        System.out.println("2. Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần : ");
        studentSortings.sort((o1, o2) -> (o1.age - o2.age) + (o2.GPA - o1.GPA));
        for (StudentSorting studentSorting: studentSortings) {
            System.out.println(studentSorting);
        }

        System.out.println("3. Sắp xếp theo tên : ");

    }
}

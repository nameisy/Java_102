package Deneme;

import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderName());

        students.add(new Student("Mustafa", 20));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Behlül", 45));

        for (Student stu : students) {
            System.out.println(stu.getName());
        }

    }

}

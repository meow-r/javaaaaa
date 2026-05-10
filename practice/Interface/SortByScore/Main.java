package SortByScore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", 85));
        students.add(new Student("李四", 92));
        students.add(new Student("王五", 78));
        students.add(new Student("赵六", 92));
        students.add(new Student("陈七", 88));

        Collections.sort(students);   // 调用 compareTo 排序

        for (Student s : students) {
            System.out.println(s);    // 自动调用 toString
        }
    }
}
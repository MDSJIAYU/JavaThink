package 比较;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    String name;
    int record;

    public Student() {
    }

    public Student(String name, int record) {
        this.name = name;
        this.record = record;
    }

    public boolean equals(Student student) {
        return name.equals(student.name) && record == student.record;
    }

    @Override
    public int compareTo(Student stu) {
        return this.name.compareTo(stu.name);
    }

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("liming", 90),
                new Student("xiaohong", 95),
                new Student("zhoubin", 88),
                new Student("xiaoli", 94)
        );
        // 排序前
        System.out.println(studentList);
        Collections.sort(studentList);
        // 排序后
        System.out.println(studentList);

        for(Student student : studentList){
            System.out.println(student.equals(new Student("xiaohong", 95)));
        }
    }
}

package dao;

import entity.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class updateStudent {
    public  static void updateStudent(int index, Student student, List<Student> stuList){

        stuList.set(index,student);
        System.out.println("修改成功");
    }
}

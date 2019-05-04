package dao;

import entity.Student;
import java.util.List;

/**
 * 根据下标修改list中对应的student对象的值
 */

public class updateStudent {

    public  static void updateStudent(int index, Student student, List<Student> stuList){

        stuList.set(index,student);

        System.out.println("修改成功");
    }
}

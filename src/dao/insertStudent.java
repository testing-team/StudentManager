package dao;

import entity.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class insertStudent {

    public  static void insertStudent(Student student, List<Student> stuList){

                stuList.add(student);


                Collections.sort(stuList, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                // 按照学生的学号进行升序排列
                        if (o1.getId() > o2.getId()) {
                            return 1;
                        }
                        if (o1.getId() == o2.getId()) {
                            return 0;
                        }
                        return -1;
                    }
                });

                System.out.println("插入成功");
        }
}

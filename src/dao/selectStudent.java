package dao;

import entity.Student;
import java.util.List;

/**
 * 根据姓名查找list中对应的学生信息
 */
public class selectStudent {
    public static void selectStudent(String name, List<Student> stuList) {

        for (int i = 0; i < stuList.size(); i++) {

            String item = stuList.get(i).getName();

            //若存在姓名相符的学生则输出该学生信息，退出当前循环
            if (name.equals(item)) {
                System.out.println(	stuList.get(i).getId() + "\t" + stuList.get(i).getName() + "\t" + stuList.get(i).getBirDate()+ "\t" +stuList.get(i).getGender());
                break;
            }
            //若不存在该姓名学生，则提示该学生不存在
            if (i == stuList.size() - 1) {
                System.out.println("没有姓名为" + name + "的学生");
            }
        }
    }
}
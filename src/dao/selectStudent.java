package dao;

import entity.Student;

import java.util.List;

public class selectStudent {
    public static void selectStudent(String name, List<Student> stuList) {
        for (int i = 0; i < stuList.size(); i++) {
            String item = stuList.get(i).getName();
            if (name.equals(item)) {
                System.out.println(	stuList.get(i).getId() + "\t" + stuList.get(i).getName() + "\t" + stuList.get(i).getBirDate()+ "\t" +stuList.get(i).getGender());
                break;
            }
            if (i == stuList.size() - 1) {
                System.out.println("没有姓名为" + name + "的学生");
            }
        }
    }
}
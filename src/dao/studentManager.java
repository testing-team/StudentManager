package dao;

import entity.Student;

import java.util.List;
import java.util.Scanner;

public class studentManager {

    public static void app(String str, List<Student> stuList,List<Integer> flag){
        switch (str){
            case "1":
                System.out.println("请输入要插入的学生(学号 姓名 生日 性别)：");
                Scanner scanner1 = new Scanner(System.in);
                Student student = new Student();
                student.setId(scanner1.nextInt());
                student.setName(scanner1.next());
                student.setBirDate(scanner1.next());
                student.setGender(scanner1.next());
                insertStudent.insertStudent(student,stuList);
                break;

            case "2":
                System.out.println("请输入要查找的学生姓名：");
                Scanner scanner2 = new Scanner(System.in);
                selectStudent.selectStudent(scanner2.next(),stuList);
                break;
            case "3":
                System.out.println("请输入要删除的学生姓名：");
                Scanner scanner3 = new Scanner(System.in);
                deleteStudent.deleteStudent(scanner3.next(),stuList);
                break;
            case "4":
                Student student1 = new Student();
                System.out.println("请输入要修改的学生姓名：");
                Scanner scanner4 = new Scanner(System.in);
                for (int i = 0; i < stuList.size(); i++) {
                    String item = stuList.get(i).getName();
                    if (scanner4.next().equals(item)) {
                        student1 = stuList.get(i);
                        System.out.println("学生当前信息为：" + stuList.get(i).getId() + "\t" + stuList.get(i).getName() + "\t" + stuList.get(i).getBirDate() + "\t" + stuList.get(i).getGender());
                        System.out.println("请输入要修改的学生信息(生日 性别)：");
                        Scanner scanner5 = new Scanner(System.in);
                        student1.setBirDate(scanner5.next());
                        student1.setGender(scanner5.next());
                        updateStudent.updateStudent(i,student1,stuList);
                        break;
                    }
                    if (i == stuList.size() - 1) {
                        System.out.println("没有姓名为" + scanner4 + "的学生");
                    }
                }
                break;
            case "5":
                System.out.println(stuList);
                break;
            case "6":
                flag.set(0,1);
                break;
            default:
                System.out.println("输入有误，请重新输入");
        }

    }
}

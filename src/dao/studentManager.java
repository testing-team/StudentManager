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
                break;
            case "3":
                System.out.println("请输入要删除的学生姓名：");
                Scanner scanner3 = new Scanner(System.in);
                deleteStudent.deleteStudent(scanner3.next(),stuList);
                break;
            case "4":
                System.out.println("请输入要修改的学生姓名：");
                Scanner scanner4 = new Scanner(System.in);
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

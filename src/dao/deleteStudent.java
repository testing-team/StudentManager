package dao;

import entity.Student;

import java.util.List;

public class deleteStudent {

    public  static void deleteStudent(String name, List<Student> stuList){

        for(int i = 0; i < stuList.size();i++){

            String item = stuList.get(i).getName();

            if(name.equals(item)){
                stuList.remove(i);
                System.out.println("删除成功");
                break;
            }
            if(i == stuList.size()-1){
                System.out.println("没有姓名为"+ name +"的学生");
            }
        }




    }
}

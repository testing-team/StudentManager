import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dao.studentManager;
import entity.Student;

public class Main {

    public static void main(String args[]){
        System.out.println("请选择操作:");
        System.out.println("******************************");
        System.out.println("**          1 插入          **");
        System.out.println("**          2 查找          **");
        System.out.println("**          3 删除          **");
        System.out.println("**          4 修改          **");
        System.out.println("**          5 输出          **");
        System.out.println("**          6 退出          **");
        System.out.println("******************************");

        List<Student> stuList = new ArrayList<Student>();
        List<Integer> flag = new ArrayList<Integer>() ;
        flag.add(0);

        while (flag.get(0) == 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你要选择的的操作：");
            String str = scanner.nextLine();
            studentManager.app(str,stuList,flag);
        }
    }
}

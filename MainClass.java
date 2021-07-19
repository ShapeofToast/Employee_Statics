import java.util.*;

public class MainClass {
    public static void main(String[] args){
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("10001","小王","销售部",5000.0f);
        employees[1] = new Employee("10002","小赵","销售部",6500.0f);
        employees[2] = new Employee("10001","Alan","研发部",15000.0f);
        ArrayList<Integer> repeatIndex = isRepeat(employees,3);
        System.out.println("编号\t\t"+"工号\t\t\t"+"姓名\t\t"+"薪水\t\t\t"+"部门\t\t");
        int count = 1;
        for(int i=0;i<3;i++) {
            if(repeatIndex.size()!=0) {
                if(repeatIndex.contains(i))
                    continue;
                else
                    System.out.println((count++)+"\t\t"+employees[i].getidNum()+"\t\t"+employees[i].getName()+"\t\t"
                            +employees[i].getSalary()+"\t\t"+employees[i].getSection()+"\t\t");
            }else {
                System.out.println((i+1)+"\t\t"+employees[i].getidNum()+"\t\t"+employees[i].getName()+"\t\t"
                        +employees[i].getSalary()+"\t\t"+employees[i].getSection()+"\t\t");
            }
        }

    }

    public static ArrayList<Integer> isRepeat(Employee[] employees,int length) {
        ArrayList<Integer> repeatIndex = new ArrayList<Integer>();
        for(int i=0;i<length;i++) {
            for(int j=0;j<length;j++) {
                if(j==i)
                    continue;
                if(employees[i].getidNum().equals(employees[j].getidNum())) {
                    repeatIndex.add(i);
                }
            }
        }
        return repeatIndex;
    }
}

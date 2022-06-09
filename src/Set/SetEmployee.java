package Set;

import lombok.Data;
import model.Employee;

import java.util.HashSet;

@Data
public class SetEmployee {

    public void createSet(){

        HashSet<Employee> employeeHashSet=new HashSet<>();

        Employee employee1=new Employee("Raj",24,"IT");
        System.out.println("HashCode of employee 1(Raj): " +employee1.hashCode());

        Employee employee2=new Employee("Akash",23,"Sales");
        System.out.println("HashCode of employee 2(Akash): " +employee2.hashCode());

        Employee employee3=new Employee("Shobhit",27,"Accounting");
        System.out.println("HashCode of employee 3(Shobhit): " +employee3.hashCode());

        Employee employee4=new Employee("Prafful",26,"Backend");
        System.out.println("HashCode of employee 4(Prafful): " +employee4.hashCode());

        Employee employee5=new Employee("Prakash",21,"Housekeeping");
        System.out.println("HashCode of employee 5(Prakash): " +employee5.hashCode());

        Employee employee6=new Employee("Raj",24,"IT");
        System.out.println("HashCode of employee 6(Raj): " +employee6.hashCode());

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);

        for (Employee var: employeeHashSet){
            System.out.println(var.getName()+" "+var.getAge()+" "+var.getDept()+ " "+var.hashCode());
        }

    }

    public static void main(String[] args) {
        SetEmployee employee=new SetEmployee();
        employee.createSet();
    }


}

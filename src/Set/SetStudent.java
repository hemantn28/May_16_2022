package Set;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import model.Student;

import java.util.HashSet;

@Data
public class SetStudent {

    public void createSet(){

        HashSet<Student> studentHashSet=new HashSet<>();

        Student student=new Student("Ramesh", 47,"PCM");
        System.out.println(student.hashCode());
        Student student1=new Student("Bablu", 11,"PCB");
        System.out.println(student1.hashCode());
        Student student2=new Student("Harendar", 24,"Commerce");
        System.out.println(student2.hashCode());
        Student student3=new Student("Ramesh", 47,"PCM");
        System.out.println(student3.hashCode());

        studentHashSet.add(student);
        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);

        for (Student var: studentHashSet){
            System.out.println(var.getName()+ " " +var.getRollNo()+ " " +var.getSection()+ " "+var.hashCode());
        }


    }


    public static void main(String[] args) {
        SetStudent obj=new SetStudent();
        obj.createSet();
    }
}

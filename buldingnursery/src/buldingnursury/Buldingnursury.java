package buldingnursury;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Buldingnursury implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        admin admin1=new admin();
////to print teachers
//teacher_manager.printfile("teachers.bin");
////to search by id for teacher
////id of teacher==>"T"for teacher/"A"department of class/level1/classB/7=>number of teacher in teacher list
//System.out.println(admin1.search_teacher("TA1B7"));
//
////to add teacher
//List l=new ArrayList();
//teacher t=new teacher("teacher", 20, "address", "qualification", l, l, "", "");
//admin1.Add_teacher(t);
//teacher_manager.printfile("teachers.bin");
////to remove teacher
////admin1.remove_teacher("TA1B3" );
//teacher_manager.printfile("teachers.bin");
class_manager.printfile("A1A.bin");
teacher_manager.printfile("teachers.bin");
   }
}

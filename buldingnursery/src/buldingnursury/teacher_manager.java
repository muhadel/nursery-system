
package buldingnursury;

import static buldingnursury.person_manger.search;
import static buldingnursury.person_manger.sortlist;
import static buldingnursury.person_manger.writetofile;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class teacher_manager extends person_manger implements Serializable{
    
     public static void write_teachertofile(List<teacher> a) throws IOException {
        ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream("teachers.bin"));
        op.writeObject(a);
        op.close();
    }
     
    public static void delete(String id) throws IOException, ClassNotFoundException {

        String file = id.substring(1, 4) + ".bin";
        List<Class> a = readfromfile(file);

        a.get(0).setTeacher(new teacher());
        
        teacher_manager.delete(id);
        

        class_manager.write_Classtofile(file, a);

    }

        public static int Size_teacherfile() throws IOException, ClassNotFoundException {
            return readfromfile("teachers.bin").size();

    }

    public static void add(teacher t) throws IOException, ClassNotFoundException {
        List<teacher> a = readfromfile("teachers.bin");
        String file=t.id.substring(1, 4) + ".bin";
        List<Class> c=new ArrayList<>();
        Class cs=new Class();
        c=readfromfile(file);
        cs=c.get(0);
        if(a.size()<8){
        a.add(t);
        write_teachertofile(a);
               
        cs.setName(file);
        cs.setTeacher(t);
        class_manager.write_Classtofile(file, c);}
    }
        public static void edit(String file, String id) throws IOException, ClassNotFoundException {
        List a = readfromfile(file);
        teacher t=new teacher();
        t = search_main(file, id);
        writetofile(file, a);

    }


    public static teacher search_main(String file, String id) throws IOException, ClassNotFoundException {
        List<teacher> alist = new ArrayList<teacher>();
        alist = readfromfile(file);
        teacher k = new teacher();
        k = search_teacher(alist, id);
        return (teacher) k;
    }

    public static teacher search_teacher(List<teacher> alist, String id) {

        teacher p = new teacher();
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).getId().equals(id)) {
                p = alist.get(i);
            }
        }
        return  p;
    }
    public static int search_teacherindex(List<teacher> alist, String id) {

        int p = 0;
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).getId().equals(id)) {
                p = i;
            }
        }
        return  p;
    }

    public static void edit(String file, String search, String name, String id, int age, String address) throws IOException, ClassNotFoundException {
        List a = readfromfile(file);
        person p = new person();
        p = search(a, search);
        p.setName(name);
       // p.setId(id);
        p.setAge(age);
        p.setAddress(address);
        writetofile(file, a);

    }
    public void setscore(String subname,double score,String id) throws IOException, ClassNotFoundException
    {
    List<Class> c=new ArrayList<>();
   String f=id.substring(1,4)+".bin";
    c=class_manager.readfromfile(f);

    
    }


    
}

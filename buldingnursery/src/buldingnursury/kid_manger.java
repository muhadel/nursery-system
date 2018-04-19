package buldingnursury;

import file_manger.*;
import buldingnursury.*;
import static buldingnursury.person_manger.readfromfile;
import static buldingnursury.person_manger.writetofile;
import static buldingnursury.teacher_manager.search_main;
import static file_manger.person_manger.readfromfile;
import static file_manger.person_manger.writetofile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class kid_manger extends person_manger implements Serializable {

    public static void write_kidtofile(String file, List<kid> a) throws IOException {
        ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream(file));
        op.writeObject(a);
        op.close();
    }

    public static int Size_of_kid(List<kid> k) throws IOException, ClassNotFoundException {

        return k.size();

    }

    public static void add(kid k) throws IOException, ClassNotFoundException {
        List<Class> a = readfromfile(k.check_class() + ".bin");
        Class c = new Class();
       
        c = a.get(0);

        int size = c.getKids().size();
        if (size < 20&&k.getLevel()<3) {
            c.getKids().add(k);
        }

        class_manager.write_Classtofile(k.check_class() + ".bin", a);

    }

    public static void edit(String id) throws IOException, ClassNotFoundException {

        String file = id.substring(1, 4) + ".bin";
        List<Class> a = readfromfile(file);
        Class c = new Class();
        c = a.get(0);

        List b = c.getKids();
        kid k = new kid();
        k = search_kid(b, id);
        //k.setDriver_name("ahmed");

        //list from setssssssssssssssssssssss
        class_manager.write_Classtofile(file, a);

    }

    public static void edit_driver(String id,String name) throws IOException, ClassNotFoundException {

        String file = id.substring(1, 4) + ".bin";
        List<Class> a = readfromfile(file);
        Class c = new Class();
        c = a.get(0);

        List b = c.getKids();
        kid k = new kid();
        k = search_kid(b, id);
        if(k.getRoute().equalsIgnoreCase("Helwan"))
        {
        
        }
        else
            if(k.getRoute().equalsIgnoreCase("Giza")){}
            if(k.getRoute().equalsIgnoreCase("Elmarg")){}
          //********************
        k.setDriver_name(name);
        class_manager.write_Classtofile(file, a);

    }

    public static kid search_main(String id) throws IOException, ClassNotFoundException {
        String file = id.substring(1, 4) + ".bin";
        List <Class> c=new ArrayList<>();
        List<kid> alist = new ArrayList<kid>();
        c = readfromfile(file);
        alist=c.get(0).getKids();
        kid k = new kid();
        k = search_kid(alist, id);
        return  k;
    }

    public static kid search_kid(List<kid> alist, String id) {

        kid p = new kid();
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).getId().equals(id)) {
                p = alist.get(i);
            }
        }
        return  p;
    }
        public static int search_kid_index(List<kid> alist, String id) {

        kid p = new kid();
        int x = 0;
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).getId().equals(id)) {
               x=i; 
            }
        }
        return  x;
    }

    public static void delete(String id) throws IOException, ClassNotFoundException {

        String file = id.substring(1, 4) + ".bin";
        List<Class> a = readfromfile(file);
        Class c = new Class();
        c = a.get(0);
        List b = c.getKids();
        b.remove(search(b, id));

        class_manager.write_Classtofile(file, a);

    }

}

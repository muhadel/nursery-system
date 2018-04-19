package file_manger;


import buldingnursury.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class person_manger  {


    public static void writetofile(String file, List<person> a) throws IOException {
        ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream(file));
        op.writeObject(a);
        op.close();
    }

    public static void add(String file,person p) throws IOException, ClassNotFoundException {
        List<person> a = readfromfile(file);
        a.add(p);
        sortlist(file, a);

    }
    //for all classes

    public static void format(String file) throws IOException, ClassNotFoundException {
        List a = readfromfile(file);
        a.clear();
        writetofile(file, a);
    }

    //for all classes
    public static List readfromfile(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream i = new ObjectInputStream(new FileInputStream(file));
        List x = (List) i.readObject();
        return x;

    }

    //for all classes
    public static void printfile(String file) throws IOException, ClassNotFoundException {
        System.err.println(readfromfile(file));
    }

    public static void delete(String file, String id) throws IOException, ClassNotFoundException {
        List a = readfromfile(file);

        a.remove(search(a, id));
        writetofile(file, a);

    }

    public static person search_main(String file, String id) throws IOException, ClassNotFoundException {
        List<person> alist = new ArrayList<person>();
        alist = readfromfile(file);
        person p = new person();
        p = search(alist, id);
        return p;
    }

    public static person search(List<person> alist, String id) {

        person p = new person();
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).getId().equals(id)) {
                p = alist.get(i);
            }
        }
        return p;
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

    public static void sortlist(String file, List<person> p) throws IOException, ClassNotFoundException {

        for (int i = 0; i < p.size() - 1; i++) {
            for (int j = i; j < p.size(); j++) {

                /*if (p.get(i).getId_no() > p.get(j).getId_no()) {
                    Collections.swap(p, i, j);
                }*/

            }
        }
        writetofile(file, p);

    }

}

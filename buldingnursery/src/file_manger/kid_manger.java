
package file_manger;
import buldingnursury.*;
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


public class kid_manger extends person_manger implements Serializable{
    
    public static void write_kidtofile(String file, List<kid> a) throws IOException {
        ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream(file));
        op.writeObject(a);
        op.close();
    }

    public static void add(String file,kid k) throws IOException, ClassNotFoundException {
        List<person> a = readfromfile(file);
        a.add(k);
        sortlist(file, a);

    }


    public static kid search_main(String file, String id) throws IOException, ClassNotFoundException {
        List<kid> alist = new ArrayList<kid>();
        alist = readfromfile(file);
        person k = new kid();
        k = search_kid(alist, id);
        return (kid) k;
    }

    public static kid search_kid(List<kid> alist, String id) {

        person p = new kid();
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).getId().equals(id)) {
                p = alist.get(i);
            }
        }
        return  (kid) p;
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

    public static void sortlist_kid(String file, List<kid> p) throws IOException, ClassNotFoundException {

        for (int i = 0; i < p.size() - 1; i++) {
            for (int j = i; j < p.size(); j++) {

                /*if (p.get(i).getId_no() > p.get(j).getId_no()) {
                    Collections.swap(p, i, j);
                }*/

            }
        }
        write_kidtofile(file, p);

    }
    
}

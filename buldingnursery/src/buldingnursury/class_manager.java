
package buldingnursury;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class class_manager extends kid_manger implements Serializable{
      
    public static void write_Classtofile(String file, List<Class> a) throws IOException {
        ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream(file));
        op.writeObject(a);
        op.close();
    }
    
    
        public static int Size_of_kids(String file) throws IOException, ClassNotFoundException {
            
            List<Class> c=new ArrayList<>();
            c=readfromfile(file);
            
            List<kid> k=new ArrayList<>();
            k=c.get(0).getKids();
            return Size_of_kid(k);
            

    }
                public static List<kid> kids(String file) throws IOException, ClassNotFoundException {
            
            List<Class> c=new ArrayList<>();
            c=readfromfile(file);
            
            List<kid> k=new ArrayList<>();
            k=c.get(0).getKids();
            return k;
            

    }

    public static void add(String file,Class k) throws IOException, ClassNotFoundException {
        List<Class> a = readfromfile(file);
        a.add(k);
        write_Classtofile(file, a);
        

    }

    public static Class search_Class(List<Class> alist, String name) {

        Class p = new Class();
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).getName().equals(name)) {
                p = alist.get(i);
            }
        }
        return p;
    }
        public static void delete(String file, String id) throws IOException, ClassNotFoundException {
        List a = readfromfile(file);
            
        a.remove(search_Class(a, id));
        writetofile(file, a);

    }


    List<Class> readfromfile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

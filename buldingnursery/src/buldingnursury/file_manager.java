
package buldingnursury;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class file_manager extends person_manger implements Serializable{
    public List filesname=new ArrayList();
        public static void write_file_names(String file, List a) throws IOException {
        ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream(file));
        op.writeObject(a);
        op.close();
    }
    
}

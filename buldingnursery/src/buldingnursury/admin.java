package buldingnursury;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class admin extends userlogin implements Serializable {

    kid_manger km = new kid_manger();
    teacher_manager tm = new teacher_manager();

    public void Add_teacher(teacher t) throws IOException, ClassNotFoundException {
        tm.add(t);

    }

    public void Add_kid(kid k) throws IOException, ClassNotFoundException {

        km.add(k);
    }

    public void edit_teacher(String file, String id) throws IOException, ClassNotFoundException {
        tm.edit(file, id);
    }

    public void edit_kid(String id) throws IOException, ClassNotFoundException {
        km.edit(id);

    }

    public void remove_teacher(String file, String id) throws IOException, ClassNotFoundException {
      //  tm.delete( id);
    }

    public void remove_kid(String id) throws IOException, ClassNotFoundException {

    km.delete(id);
    }

    public kid search_kid(String id) throws IOException, ClassNotFoundException {
String file = id.substring(1, 4) + ".bin";
        return (kid) km.search_main(file, id);
    }

    public teacher search_teacher(String id) throws IOException, ClassNotFoundException {
       String file = id.substring(1, 4) + ".bin";
        return tm.search_main(file, id);
    }
        public void submit_kid_driver(String id) throws IOException, ClassNotFoundException {
            kid k=new kid();
            k=kid_manger.search_main(id);
            Driver_manager.add(k.name, k.id,k.getRoute());
            
       
    }

}

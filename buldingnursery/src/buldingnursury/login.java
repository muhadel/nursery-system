package buldingnursury;

import static buldingnursury.person_manger.readfromfile;
import static buldingnursury.teacher_manager.search_teacherindex;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class login {

    public login() throws IOException, ClassNotFoundException {
       
    }
    

    public void chechlogin(String id, String password) throws IOException, ClassNotFoundException {
        if (id.equals("admin")) {
            if (password.equalsIgnoreCase("admin")) {
                
                JOptionPane.showMessageDialog(null, "true admin");
            } else {
                JOptionPane.showMessageDialog(null, "false admin");
            }
        } else if (id.startsWith("p")) {
            List<Class> c = new ArrayList<>();
            c = class_manager.readfromfile(id.substring(1, 4)+".bin");
            String kid = id.replace("p", "K");
            int y = kid_manger.search_kid_index(c.get(0).getKids(), kid);
            if (c.get(0).getKids().get(y).getParent().getPassword().equalsIgnoreCase(password)) {
                JOptionPane.showMessageDialog(null, "true parent");
            } else {
                JOptionPane.showMessageDialog(null, "false parent");
            }

        } else {
            List<teacher> t = new ArrayList<>();
            t = teacher_manager.readfromfile("teachers.bin");
           int y= search_teacherindex(t, id);
            if (t.get(y).getPassword().equalsIgnoreCase(password)) {
                JOptionPane.showMessageDialog(null, "true teacher");
            } else {
                JOptionPane.showMessageDialog(null, "false teacher");
            }
        }
    }

    public static void change_password(String id, String password) throws IOException, ClassNotFoundException {
        if (id.startsWith("T")) {
            String file = "teachers.bin";
            List<teacher> tl = readfromfile(file);
            int x = search_teacherindex(tl, id);
            tl.get(x).setPassword(password);
            teacher_manager.write_teachertofile(tl);
        } else if (id.startsWith("p")) {
            List<Class> c = new ArrayList<>();
            c = kid_manger.readfromfile(id.substring(1, 4) + ".bin");
            String kid = id.replace("p", "K");

            int y = kid_manger.search_kid_index(c.get(0).getKids(), kid);
            c.get(0).getKids().get(y).getParent().setPassword(password);
            class_manager.write_Classtofile(id.substring(1, 4) + ".bin", c);

        }

    }
    public int kidloop() throws IOException, ClassNotFoundException
    {
      List<Class> cl=new ArrayList<>();
      int size=0;
      for(int i=0;i<8;i++){
     cl=class_manager.readfromfile((String) file_manager.readfromfile("filesname.bin").get(i)+".bin");
     size+=cl.get(0).getKids().size();
     
      }
      return size;
    }
        public void Allbirth() throws IOException, ClassNotFoundException
    {
      List<Class> cl=new ArrayList<>();
      String birthdays="";
      for(int i=0;i<8;i++){
     cl=class_manager.readfromfile((String) file_manager.readfromfile("filesname.bin").get(i)+".bin");
     for(int j=0;j<cl.get(0).getKids().size();j++)
     {birthdate bd=new birthdate();
    if( cl.get(0).getKids().get(j).birthd.equals(bd.currentdate())){
        birthdays+= cl.get(0).getKids().get(j).id+"\n"; 
    }
     }
   
      }
      JOptionPane.showMessageDialog(null, birthdays); 
    }
}

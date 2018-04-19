package buldingnursury;

import static buldingnursury.class_manager.Size_of_kids;
import static buldingnursury.kid_manger.search_kid;
import static buldingnursury.person_manger.readfromfile;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

public class teacher extends userlogin implements Serializable {

    private String qualification;
    private List<String> languages;

    private String department_type;
    private String Class_no;
    private String parentmessage;
    private String reply;

    public teacher() {
    }
    
    

    public teacher(String name, int age, String address, String qualification, List<String> languages, List<String> rate, String department_type, String Class_no) throws IOException, ClassNotFoundException {
        this.name = name;
        this.age = age;
        this.address = address;
        this.qualification = qualification;
        this.languages = languages;

        this.department_type = department_type;
        this.id = setId();

        this.setPassword("0000");
    }
    public void view_all_kids() throws IOException, ClassNotFoundException
    {
 List<Class> a =new ArrayList<>();
         String file = this.id.substring(1, 4) + ".bin";
         a=readfromfile(file);
        System.err.println(a.get(0).getKids());
        

    }

    public void send_reply_notifigation(String id, String notif) throws ClassNotFoundException, IOException {
        String file = id.substring(1, 4) + ".bin";
        List<Class> a = readfromfile(file);
        Class c = new Class();
        c = a.get(0);

        List b = c.getKids();
        kid k = new kid();
        k = search_kid(b, id);
        k.parent.teachers_message = notif;
        class_manager.write_Classtofile(file, a);

    }

    public void write_notes(String id, String note) throws IOException, ClassNotFoundException {
        String file = id.substring(1, 4) + ".bin";
        List<Class> a = readfromfile(file);
        Class c = new Class();
        c = a.get(0);

        List b = c.getKids();
        kid k = new kid();
        k = search_kid(b, id);
        k.setNote_progress(note);
        class_manager.write_Classtofile(file, a);
    }

    public String setId() throws IOException, ClassNotFoundException {
        teacher_manager t = new teacher_manager();
        String c;

        if (this.department_type.equalsIgnoreCase("arabic")) {
            c = "A";
        } else {
            c = "E";
        }
        //class a or class b
        String s;
        int x = teacher_manager.Size_teacherfile();
        if (x % 2 != 0) {
            s = "A";
        } else {
            s = "B";
        }

        //level
        int level;

        
        if (x == 1 || x == 2 || x == 5 || x == 6) {
            level = 1;
        } else {
            level = 2;
        }
        return "T" + c + level + s + (x + 1);
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getDepartment_type() {
        return department_type;
    }

    public void setDepartment_type(String department_type) {
        this.department_type = department_type;
    }

    @Override
    public String toString() {
        return "teacher{" + "name=" + name +"pass="+this.getPassword()+ "id=" + id + "age=" + age + "Address" + address + "qualification=" + qualification + ", languages=" + languages + ", department_type=" + department_type + ", Class_no=" + Class_no + ", parentmessage=" + parentmessage + ", reply=" + reply + "}\n";
    }



}

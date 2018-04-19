package buldingnursury;

import static buldingnursury.class_manager.Size_of_kids;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class kid extends person implements Serializable {

    private List<subject> mySubjects;
    private String route;
    private String department_type;
    private int level;
    private String Class;
    private String note_progress = "";
    private String teacher_rate = "";
    private String game;
    private String driver_name;
    parent parent = new parent();
    private String examtime;
     birthdate birthd=new birthdate();
    

    public kid() {

    }

    public kid(String name,int day,int month,int year, int age, String address, String route, String department_type, String game, int parent_age) throws IOException, ClassNotFoundException {
        this.name = name;
        this.birthd.day=day;
        this.birthd.month=month;
        this.birthd.year=year;
        this.age = birthd.setage(day, month, year);
        this.address = address;
        this.route = route;
        this.department_type = department_type;
        this.game = game;
        this.parent.age = parent_age;
        this.parent.address = address;
        this.examtime="";

        setLevel();
        this.Class=check_class();
        this.mySubjects = setsubject();
        this.id = setId();
        this.parent.name = setparentname();
        this.parent.id = setparentid();
        this.parent.setPassword("0000");
        this.parent.announce = "";
        this.parent.teachers_message = "";
        Game_manager.add(this.name,this.id,this.game);

    }

    public String setparentname() {
        String kname = this.name;
        String pname;
        String[] parts = kname.split(" ");
        pname = parts[1] + " " + parts[2];
        return pname;
    }

    public String setparentid() {
        String kid = this.id;
        String pname = kid.replace("k", "p");

        return this.id.replace("K", "p");
    }

    public String getRoute() {
        return route;
    }
    

    public String getDepartment_type() {
        return department_type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel() {
        if (this.age <= 4) {
            this.level = 1;
        } else if (this.age > 4 && this.age < 6) {
            this.level = 2;
        }
        else
            JOptionPane.showMessageDialog(null, "the age is more than 6");
        
    }

    public String check_class() throws IOException, ClassNotFoundException {
        String c;

        if (this.department_type.equalsIgnoreCase("arabic")) {
            c = "A";
        } else {
            c = "E";
        }
       if (Size_of_kids(c + this.level+"A.bin") <=20 ) {
            return c + this.level + "A";
        } else {
           return c + this.level + "B";

       }
    }





    public String getNote_progress() {
        return note_progress;
    }

    public void setNote_progress(String note_progress) {
        this.note_progress = note_progress;
    }

    public String getGame() {
        return game;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getTeacher_rate() {
        return teacher_rate;
    }

    public void setTeacher_rate(String teacher_rate) {
        this.teacher_rate = teacher_rate;
    }

    public String setId() throws IOException, ClassNotFoundException {

        class_manager cm = new class_manager();
        String zero = "";
       if (Size_of_kids(this.Class+".bin") < 9) {
            zero = "0";
        }
        return "K" + this.Class + zero + (Size_of_kids(this.Class+".bin") + 1);

    }

    public List<subject> setsubject() {

        List<subject> sla1 = new ArrayList<>();
        List<subject> sle1 = new ArrayList<>();
        List<subject> sla2 = new ArrayList<>();
        List<subject> sle2 = new ArrayList<>();


        sla1.add(new subject("arabic1", "arabic", 1));
        sla1.add(new subject("english1", "arabic", 1));
        sla1.add(new subject("math1", "arabic", 1));
        sle1.add(new subject("arabic1", "english", 1));
        sle1.add(new subject("english1", "english", 1));
        sle1.add(new subject("math1", "english", 1));

        sla2.add(new subject("arabic2", "arabic", 2));
        sla2.add(new subject("english2", "arabic", 2));
        sla2.add(new subject("math2", "arabic", 2));
        sle2.add(new subject("arabic2", "english", 2));
        sle2.add(new subject("english2", "english", 2));
        sle2.add(new subject("math2", "english", 2));

     

        if (this.department_type.equalsIgnoreCase("arabic")) {
            if (this.level == 1) {
                return sla1;
            } else {
                return sla2;
            }

        } else if (this.level == 1) {
            return sla1;
        }  else {
            return sla2;
        }

    }

    public parent getParent() {
        return parent;
    }

    public void setParent(parent parent) {
        this.parent = parent;
    }

    public String getExamtime() {
        return examtime;
    }

    public void setExamtime(String examtime) {
        this.examtime = examtime;
    }
    

    @Override
    public String toString() {
        return "kid{" + "name=" + name + "id=" + id + "age=" + age + "Address" + address + "BD="+birthd+"mySubjects=" + mySubjects + ", route=" + route + ", department_type=" + department_type + ", level=" + level + ", note_progress=" + note_progress + ", game=" + game + ", driver_name=" + driver_name + ", parentname=" + parent.name + ", parentid=" + parent.id +"password"+parent.getPassword()+" C= "+Class+ this.getParent().teachers_message+"examtime="+examtime+"}\n";
    }

}

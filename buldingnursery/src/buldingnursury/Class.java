
package buldingnursury;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Class implements Serializable{
    private String name;
    private String dept_name;
    private int level;
    private teacher teacher=new teacher();
    private List<kid> kids=new ArrayList<>();

    public Class() {
    }

    public Class(String name,teacher t,List<kid> k,int l) {
        this.name = name;
        this.teacher=t;
        this.kids=k;
        this.level=l;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(teacher teacher) {
        this.teacher = teacher;
    }

    public List<kid> getKids() {
        return kids;
    }

    public void setKids(List<kid> kids) {
        this.kids = kids;
    }

    @Override
    public String toString() {
        return "Class{" + "name=" + name + ", teacher=" + teacher + ", kids=" + kids + '}';
    }
    
    
}

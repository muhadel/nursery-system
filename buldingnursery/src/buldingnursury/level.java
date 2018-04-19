package buldingnursury;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class level implements Serializable{
   
    private int level_number;
    private List<Class> cls=new ArrayList<>();

    public level() {
    }

    public level(int level_number) {
        this.level_number = level_number;
    }

    public int getLevel_number() {
        return level_number;
    }

    public void setLevel_number(int level_number) {
        this.level_number = level_number;
    }

    public void setCls(List<Class> cls) {
        List<kid> k=new ArrayList<>();
        List l=new ArrayList();
        teacher t=new teacher();
       Class c1=new Class("A", t, k, this.level_number);
       Class c2=new Class("B", t, k, this.level_number);
       cls.add(c1);
       cls.add(c2);
    }
    
}



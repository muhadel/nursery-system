package buldingnursury;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class event implements Serializable{
    
List birthdate=new ArrayList();;  

List applyschool=new ArrayList();;

    public event() {
    }
    
    public void examtime(String t,String file) throws IOException, ClassNotFoundException
    {
        List<Class> ls=new ArrayList<>();
        ls=class_manager.readfromfile(file);
      //  for(int i=0;i<ls.size();i++)
       // ls.get(0).getKids().get(i).setExamtime(t);
        
        
    }

    public List getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(List birthdate) {
        this.birthdate = birthdate;
    }

    public List getApplyschool() {
        return applyschool;
    }

    public void setApplyschool(List applyschool) {
        this.applyschool = applyschool;
    }
            }

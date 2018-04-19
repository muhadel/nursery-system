
package buldingnursury;

import java.io.Serializable;
import java.util.List;

public class department implements Serializable{
    private int payment;
    private String department_type;
    private List<level> levellist;
    

   
    public department(String d_type,int payment)
    {
        this.department_type=d_type;
        this.payment=payment;
        
    }
    

    
    public int getPayment() {
        return payment;
    }

    private String setdept_id(String d_type) {
        if(d_type.equalsIgnoreCase("english"))
        return "ED" ;
        else if(d_type.equalsIgnoreCase("arabic"))
        return "AD";
        else
            return"";
    }


    public String getDepartment_type() {
        return department_type;
    }

    public void setDepartment_type(String department_type) {
        this.department_type = department_type;
    }

    public List<level> getLevellist() {
        return levellist;
    }

    public void setLevellist(List<level> levellist) {
        level l1=new level(1);
        level l2=new level(2);
        levellist.add(l1);
        levellist.add(l2);
    }
    
}

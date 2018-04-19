
package buldingnursury;

import java.io.Serializable;


public  class staff extends person implements Serializable{
     public double salary;
    public void set_salary(double slry)
    {
      this.salary=slry; 
    }
    public  double get_salary()
    {
        return salary;
    }
    
}

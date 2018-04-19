
package buldingnursury;

import java.io.Serializable;


public class coach extends staff implements Serializable{
    private String game_name;
    
     public coach(String name,int age ,String address,double salary,String game)
   {
    this. name=name;
    this.age=age;
    this.address=address;
    this.salary=salary;
    this.game_name=game;
 
   }
    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
  
}
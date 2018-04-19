
package buldingnursury;

import java.io.Serializable;

public class bus implements Serializable{
  
   public int capacity=20;
    String route;

    public bus() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
 
   

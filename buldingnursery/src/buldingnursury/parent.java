package buldingnursury;

import java.io.Serializable;


public class parent extends userlogin implements Serializable{
public String announce;
public String teachers_message;
 

    public parent() {
    }

    @Override
    public String getName() { 

        return this.name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getAddress() {
        return address;
    }


 
//hya5od event

    public String getAnnounce() {
        return announce;
    }

    public void setAnnounce(String announce) {
        this.announce = announce;
    }

        
}

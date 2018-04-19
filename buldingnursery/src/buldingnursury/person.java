package buldingnursury;

import java.io.Serializable;

public class person implements Serializable {

    protected String name;
    protected int age;
    protected String id;
    protected String address;

    public person() {
    }

    public person(String name, String id, int age, String address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

}

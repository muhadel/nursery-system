package buldingnursury;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class driver extends staff implements Serializable{

    private String driving_license_no;
    private bus bus=new bus();
    private List kid_name=new ArrayList <>();
    private List kid_id=new ArrayList <>();

    public driver() {
    }
   
    public driver(String name,int age ,String address,String license,String route)
   {
    this.name=name;
    this.age=age;
    this.address=address;
    this.salary=1000;
    this.driving_license_no = license;
    this.bus.route=route;
   }

    public String getDriving_license_no() {
        return driving_license_no;
    }

    public void setDriving_license_no(String driving_license_no) {
        this.driving_license_no = driving_license_no;
    }





    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public bus getBus() {
        return bus;
    }

    public void setBus(bus bus) {
        this.bus = bus;
    }

    public List getKid_name() {
        return kid_name;
    }

    public void setKid_name(List kid_name) {
        this.kid_name = kid_name;
    }

    public List getKid_id() {
        return kid_id;
    }

    public void setKid_id(List kid_id) {
        this.kid_id = kid_id;
    }

    @Override
    public String toString() {
        return "driver{"+ "name=" + name + "age=" + age + "Address" + address + "kids_name=" + getKid_name()+ "kids_Id=" + getKid_id() + "driving_license_no=" + driving_license_no + ", route=" + bus.route + '}';
    }
    

}

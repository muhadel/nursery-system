/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingnursury;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import buldingnursury.kid_manger;

/**
 *
 * @author mostafa
 */
public class Driver_manager extends person_manger implements Serializable {

    public static void writetofile(List<driver> drivers) throws IOException {
        ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream("drivers.bin"));
        op.writeObject(drivers);
        op.close();
    }


    public static void add_new_driver(driver d) throws IOException, ClassNotFoundException {
        List<driver> dl = new ArrayList<>();
        dl = Driver_manager.readfromfile("drivers.bin");
        dl.add(d);
        Driver_manager.writetofile(dl);
    }

    public static void add(String name, String id, String r) throws IOException, ClassNotFoundException {
        List<driver> dl = new ArrayList<>();
        List<Class> c=new ArrayList<>();
        c=readfromfile(id.substring(1, 4) + ".bin");
        
        List<kid> kl=new ArrayList<>();
        kl=c.get(0).getKids();
       
        
        
        dl = readfromfile("drivers.bin");
        driver d = new driver();

        for (int i = 0; i < 3; i++) {
            d = dl.get(i);

            if (r.equalsIgnoreCase(d.getBus().route)) {
                d.getKid_name().add(name);
                d.getKid_id().add(id);
                writetofile(dl);
              kl.get( kid_manger.search_kid_index(kl, id)).setDriver_name(d.name);
              class_manager.write_Classtofile(id.substring(1, 4) + ".bin", c);
            }
        }
    }
}

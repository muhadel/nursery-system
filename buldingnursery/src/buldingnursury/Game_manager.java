package buldingnursury;

import static buldingnursury.Driver_manager.writetofile;
import static buldingnursury.person_manger.readfromfile;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Game_manager extends person_manger implements Serializable{ 

    public static void writetofile(List<game> games) throws IOException {
        ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream("games.bin"));
        op.writeObject(games);
        op.close();
    }

    public static void add(String name, String id, String game) throws IOException, ClassNotFoundException {
        List<game> gl = new ArrayList<>();

        gl = readfromfile("games.bin");
        

        
            
            if (game.equalsIgnoreCase("football")) {
                if(gl.get(0).getTeam().get(0).getKid_name().size()<gl.get(0).getTeam().get(0).getCapacity()){
                gl.get(0).getTeam().get(0).addKid_id(name, id);}
                else{gl.get(1).getTeam().get(1).addKid_id(name, id);}

            } else if (game.equalsIgnoreCase("basketball")) {
                if(gl.get(0).getTeam().get(0).getKid_name().size()<gl.get(0).getTeam().get(0).getCapacity()){
                gl.get(0).getTeam().get(0).addKid_id(name, id);}
                else{gl.get(1).getTeam().get(1).addKid_id(name, id);}
            } else {
                if(gl.get(0).getTeam().get(0).getKid_name().size()<gl.get(0).getTeam().get(0).getCapacity()){
                gl.get(0).getTeam().get(0).addKid_id(name, id);}
                else{gl.get(1).getTeam().get(1).addKid_id(name, id);}
            }

        
        Game_manager.writetofile(gl);
    }



}

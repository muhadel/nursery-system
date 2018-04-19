package buldingnursury;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class team implements Serializable{

    public String team_name;
    private String game_name;
    private String coach_name;
    private int capacity;
    private List kid_name=new ArrayList <>();
    private List kid_id=new ArrayList <>();

    public team(String team_name, String game_name, String coach_name) {
        this.team_name = team_name;
        this.game_name = game_name;
        this.coach_name = coach_name;
        this.capacity = 6;
       
      
    }


    team() {
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public String getCoach_name() {
        return coach_name;
    }

    public void setCoach_name(String coach_name) {
        this.coach_name = coach_name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
       public void addKid_id(String name ,String id) {
        this.kid_name.add(name);
        this.kid_id.add(id);
        
    }

    @Override
    public String toString() {
        return "team{" + "team_name=" + team_name + ", game_name=" + game_name + ", coach_name=" + coach_name  + ", kid_name=" + kid_name + ", kid_id=" + kid_id + "}\n";
    }

    
  
}

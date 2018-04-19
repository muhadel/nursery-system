package buldingnursury;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class game implements Serializable {

    private int capacity;
    private List<team> team = new ArrayList<>();
    private String game_name;

    public game(String game_name, int capacity) {
        this.game_name = game_name;
        this.capacity = capacity;
    }

    game() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<team> getTeam() {
        return team;
    }

    public void setTeam(List<team> team) {
        this.team = team;
    }



    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    @Override
    public String toString() {
        return "game{" + ", game_name=" + game_name+ "capacity=" + capacity + ", team=" + team  + "}\n";
    }

}

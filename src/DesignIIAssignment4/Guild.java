package DesignIIAssignment4;

import java.util.List;

public class Guild{
    private String name;
    private List<Adventurer> adventurers;

    public Guild(String name, List<Adventurer> adventurers){
        this.name = name;
        this.adventurers = adventurers;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty())
            this.name = name;
    }

    public List<Adventurer> getAdventurers() {
        return adventurers;
    }

    public void setAdventurers(List<Adventurer> adventurers) {
        if(!adventurers.isEmpty())
            this.adventurers = adventurers;
    }
}

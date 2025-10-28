package DesignIIAssignment4;

import java.util.List;

/**
 * Guild Class.
 */
public class Guild{
    /**
     * String for the name of the guild.
     * List of adventurers that are a part of the guild.
     */
    private String name;
    private List<Adventurer> adventurers;

    /**
     * Basic Constructor taking name and List of adventurers.
     * @param name - name of guild. String
     * @param adventurers - List of adventurers.
     */
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

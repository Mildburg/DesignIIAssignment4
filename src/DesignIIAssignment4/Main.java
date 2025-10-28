package DesignIIAssignment4;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Main class.
 * Contains all Stream methods.
 */
public class Main {

    /**
     * Method to find all adventurers with a given skill.
     * @param s - desired skill.
     * @param guilds - List of all guilds to search.
     * @return - returns a list of adventurers that have skill s.
     */
    public static List<Adventurer> skilledAdventurers(Skill s, List<Guild> guilds){
         return guilds.stream()     //Stream of guilds
                 .flatMap(guild -> guild.getAdventurers().stream()) //Gets stream of adventurers
                 .filter(p -> p.getSkills().contains(s))
                 .toList();
    }

    /**
     * Method that groups the Adventurers by role and then prints it out.
     * @param guilds - List of all guilds that adventurers belong to.
     */
    public static void groupedRoleAdventurers(List<Guild> guilds){
        Map <String, List<Adventurer>> groupedAdv =
        guilds.stream() // stream of guilds
                .flatMap(g -> g.getAdventurers().stream()) //stream of adventurers
                .collect(Collectors.groupingBy(Adventurer::getRole)); // collects the adventurers and groups them by role
        System.out.println(groupedAdv);
    }

    /**
     * Method that finds the adventurer with the most skills out of all guilds.
     * @param guilds - List of Guilds to search.
     * @return - Returns an optional of the Adventurer with the most skills.
     */
    public static Optional<Adventurer> mostSkilledAdventurer(List<Guild> guilds) {
        return guilds.stream() // stream of guilds
                .flatMap(g -> g.getAdventurers().stream()) // stream of adventurers
                .max(Comparator.comparingInt(a -> a.getSkills().size())); // finds adventurer with the maximum number of skills in their list
    }

    /**
     * Method that sorts guilds based on average age.
     * @param guilds - List of guilds to sort.
     * @return - returns List of guilds sorted.
     */
    public static List<Guild> youngestToOldestGuild(List<Guild> guilds){
        return guilds.stream() // Stream of guilds
                .sorted(Comparator.comparingInt(g -> g.getAdventurers().stream()
                        .mapToInt(Adventurer::getAge)
                        .sum()
                        / g.getAdventurers().size())) //Converts it to a stream of ints, these ints are the average age of the guilds
                .toList();

    }

    /**
     * Method that maps how many adventurers possess each skill.
     * @param guilds - List of guilds to search.
     * @return - returns a map of Skills as keys to how many adventurers have each skill.
     */
    public static Map<Skill, Integer> skilledAdvCounter(List<Guild> guilds){
        return guilds.stream() //Guild Stream
                .flatMap(g -> g.getAdventurers().stream())// Stream of adventurers
                .flatMap(s -> s.getSkills().stream()) // skill of streams
                .collect(Collectors.toMap(skill -> skill, skill -> 1, Integer::sum));// skills = key, each skill is counted 1 time as value
                // any duplicate skills are summed up and counted in values.
    }

    /**
     * Method that applies a bonus gold event. All adventurers with less than 1000 gold get a 20% bonus.
     * @param guilds - List of all guilds to apply the bonus to.
     */
    public static void bonusGoldEvent(List<Guild> guilds){
        double goldThresh = 1000;
        List<Adventurer> updatedAdv = guilds.stream() // stream of guilds
                .flatMap(g -> g.getAdventurers().stream())// stream of adventurers
                .map(a -> {
                    if(a.getGoldEarned() < 1000) {
                        return new Adventurer(a.getName(), a.getAge(), a.getRole(), a.getGoldEarned() * 1.2,
                                a.getSkills());
                    }
                    else
                        return a;
                })
                .toList();

        System.out.println(updatedAdv);
    }

}

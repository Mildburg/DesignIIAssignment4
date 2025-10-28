package DesignIIAssignment4;

import java.util.List;

/**
 * Adventurer Class.
 */

public class Adventurer{
    /**
     * Standard String, int and double for the name, age, role, and gold Earned.
     * Skills is a list of skills.
     */
    private String name;
    private int age;
    private String role;
    private double goldEarned;
    private List<Skill> skills;

    /**
     * Basic Constructor for Adventurer class.
     * @param name - name of adventurer. String
     * @param age - age of adv. Int
     * @param role - role of adv. String
     * @param goldEarned - gold earned from quests. Double.
     * @param skills - list of Skills each adv has.
     */

    public Adventurer(String name, int age, String role, double goldEarned, List<Skill> skills){
        this.name = name;
        this.age = age;
        this.role = role;
        this.goldEarned = goldEarned;
        this.skills = skills;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty())
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0)
            this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if(!role.isEmpty())
            this.role = role;
    }

    public double getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(double goldEarned) {
        if(goldEarned >= 0)
            this.goldEarned = goldEarned;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        if(!skills.isEmpty())
            this.skills = skills;
    }

    /**
     * Overridden toString() method for adv.
     * @return - Returns String of information about adventurers
     */
    @Override
    public String toString(){
        String info = "";

        info += "Name: " + name + " Age: " + age + " Role: " + role + " Gold Earned: " + goldEarned + " Skills: "
                + skills;

        return info;
    }
}

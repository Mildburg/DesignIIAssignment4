package DesignIIAssignment4;

import java.util.List;

public class Adventurer implements Comparable{
    private String name;
    private int age;
    private String role;
    private double goldEarned;
    private List<Skill> skills;

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

    public String toString(){
        String info = "";

        info += "Name: " + name + " Age: " + age + " Role: " + role + " Gold Earned: " + goldEarned + " Skills: "
                + skills;

        return info;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

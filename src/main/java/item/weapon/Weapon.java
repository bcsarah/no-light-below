public class Weapon extends Item {
    protected int minDmg, maxDmg;
    protected Skill skill;
    protected int actionsForSkill;

    // Constructor
    public Weapon(String name, int minDmg, int maxDmg, Skill skill, int actionsForSkill) {
        super(name);
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.skill = skill;
        this.actionsForSkill = actionsForSkill;
    }

    // Getters
    public int getMinDmg() {
        return minDmg;
    }

    public int getMaxDmg() {
        return maxDmg;
    }

    public Skill getSkill() {
        return skill;
    }

    public int getActionsForSkill() {
        return actionsForSkill;
    }
}

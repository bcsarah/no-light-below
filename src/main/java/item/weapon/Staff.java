package item.weapon;

public class Staff extends Weapon {
    // Constructor
    public Staff(String name, int minDmg, int maxDmg, Skill skill, int actionsForSkill) {
        super(name, minDmg, maxDmg, skill, actionsForSkill);
    }

    // Getters
    @Override
    public int getAttribute(Character p) {
        return p.getWisdom();
    }

    @Override
    public String getAttribute() {
        return "WIS";
    }
}

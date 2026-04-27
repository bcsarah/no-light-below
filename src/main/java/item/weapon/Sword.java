public class Sword extends Weapon {
    // Constructor
    public Sword(String name, int minDmg, int maxDmg, Skill skill, int actionsForSkill) {
        super(name, minDmg, maxDmg, skill, actionsForSkill);
    }

    // Getters
    @Override
    public int getAttribute(Character p) {
        return p.getStrength();
    }

    @Override
    public String getAttribute() {
        return "STR";
    }
}

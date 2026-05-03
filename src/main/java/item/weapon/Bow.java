public class Bow extends Weapon {
    // Constructor
    public Bow(String name, int minDmg, int maxDmg, Skill skill, int actionsForSkill) {
        super(name, minDmg, maxDmg, skill, actionsForSkill);
    }

    // Getters
    @Override
    public int getAttribute(Character p) {
        return p.getDexterity();
    }

    @Override
    public String getAttribute() {
        return "DEX";
    }
}

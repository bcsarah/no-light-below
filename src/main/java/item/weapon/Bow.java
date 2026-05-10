public class Bow extends Weapon {
    // Constructor
    public Bow(String name, int minDmg, int maxDmg) {
        super(name, minDmg, maxDmg);
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

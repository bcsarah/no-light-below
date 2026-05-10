public class Sword extends Weapon {
    // Constructor
    public Sword(String name, int minDmg, int maxDmg) {
        super(name, minDmg, maxDmg);
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

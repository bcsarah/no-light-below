public class Weapon extends Item {
    protected int minDmg, maxDmg;

    // Constructor
    public Weapon(String name, int minDmg, int maxDmg) {
        super(name);
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
    }

    // Getters
    public int getMinDmg() {
        return minDmg;
    }

    public int getMaxDmg() {
        return maxDmg;
    }

    public int getAttribute(Character p) {
        return p.getStrength();
    }

    public String getAttribute() {
        return "STR";
    }
}

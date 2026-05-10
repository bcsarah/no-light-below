public class Staff extends Weapon {
    // Constructor
    public Staff(String name, int minDmg, int maxDmg) {
        super(name, minDmg, maxDmg);
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

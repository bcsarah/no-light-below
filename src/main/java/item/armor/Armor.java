public class Armor extends Item {
    protected int baseAc;

    // Constructor
    public Armor(String name, int baseAc) {
        super(name);
        this.baseAc = baseAc;
    }

    // Getters
    public int getBaseAc() {
        return baseAc;
    }
}

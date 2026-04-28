package character;

public class Enemy extends Character {
    protected int lvl;

    // Constructor
    public Enemy(String name, int health, int mana, int str, int dex, int wis, int con, int cha, Weapon weapon,
            Armor armor, int lvl) {
        super(name, health, mana, str, dex, wis, con, cha, weapon, armor);
        this.lvl = lvl;
    }

    // Getters
    public int getLevel() {
        return lvl;
    }
}

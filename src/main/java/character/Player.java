public class Player extends Character {
    protected int cha, exp, lvl;

    // Constructor
    public Player(String name, int health, int mana, int str, int dex, int wis, int con, int cha, Weapon weapon, Armor armor, int exp, int lvl) {
        super(name, health, mana, str, dex, wis, con, weapon, armor);
        this.cha = cha;
        this.exp = exp;
        this.lvl = lvl;
    }

    // Getters
    public int getCharisma() {
        return cha;
    }

    public int getExperience() {
        return exp;
    }

    public int getLevel() {
        return lvl;
    }

    public int getNextLevelExperience() {
        return 100 * lvl;
    }

    // Setters
    public void setCharisma(int cha) {
        this.cha = cha;
    }

    public void setExperience(int exp) {
        this.exp = exp;
    }

    public void setLevel(int lvl) {
        this.lvl = lvl;
    }

    // Level UP
    public void addExp(int amount) {
        exp += amount;
        while (exp >= getNextLevelExperience()) {
            exp -= getNextLevelExperience();
            levelUp();
        }
    }

    public void levelUp() {

    }
}
